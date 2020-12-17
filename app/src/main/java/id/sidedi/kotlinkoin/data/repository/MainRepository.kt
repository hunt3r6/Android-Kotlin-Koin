package id.sidedi.kotlinkoin.data.repository

import id.sidedi.kotlinkoin.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}