package com.mshaw.vin.util.state

import com.mshaw.vin.util.api.ErrorResponse
import io.ktor.client.statement.HttpResponse

sealed interface NetworkResult<out R> {
    data class Ok<out T>(val value: T, val response: HttpResponse): NetworkResult<T>
    data class Exception(val exception: kotlin.Exception,
                         val response: HttpResponse? = null,
                         val errorResponse: ErrorResponse? = null): NetworkResult<Nothing>
}