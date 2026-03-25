package oop_128409_AdityaZianur.week07

enum class AppStates {STARTING, RUNNING, STOPPED}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Failure(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}