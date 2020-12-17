package id.sidedi.kotlinkoin.data.api

import id.sidedi.kotlinkoin.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}