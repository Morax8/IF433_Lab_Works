package oop_128409_AdityaZianur.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }
        val type = rawJson["type"] as? String

        if (type == "ELECTRONIC") {
            val warranty = rawJson["warranty"] as? Int ?: 12
            return Electronic(id, name, warranty)
        }

        if (type == "CLOTHING") {
            val size = rawJson["size"] as? String ?: "All Size"
            return Clothing(id, name, size)
        }

        return null
    }

    fun checkout(product: Product) {
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }
        val transactionId = JavaPaymentService.processPayment(id)
        println("Payment Success: ${transactionId!!}")
    }
}