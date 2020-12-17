package id.sidedi.kotlinkoin.data.api

import id.sidedi.kotlinkoin.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}