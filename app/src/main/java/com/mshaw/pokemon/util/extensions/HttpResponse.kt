package com.mshaw.vin.util.extensions

import com.mshaw.vin.data.di.modules.NetworkModule
import com.mshaw.vin.util.state.NetworkResult
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.ResponseException
import io.ktor.client.request.request
import io.ktor.client.request.url
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpMethod

suspend inline fun <reified T> HttpClient.awaitResult(url: String, httpMethod: HttpMethod): NetworkResult<T> {
    val json = NetworkModule.json
    return try {
        val response = request {
            url(url)
            method = httpMethod
        }
        NetworkResult.Ok(response.body(), response)
    } catch (e: ResponseException) {
        NetworkResult.Exception(e, e.response, json.decodeFromString(e.response.bodyAsText()))
    } catch (e: Exception) {
        NetworkResult.Exception(e)
    }
}

suspend inline fun <reified T> HttpResponse.value(): T? =
    try {
        body<T>()
    } catch (e: Exception) {
        null
    }