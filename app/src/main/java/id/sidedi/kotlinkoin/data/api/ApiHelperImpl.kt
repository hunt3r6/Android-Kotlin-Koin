package id.sidedi.kotlinkoin.data.api

import id.sidedi.kotlinkoin.data.model.User
import retrofit2.Response

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
    override suspend fun getUsers(): Response<List<User>> = apiService.getUsers()

}