package com.mshaw.vin.util.api
import kotlinx.serialization.Serializable

import kotlinx.serialization.SerialName

@Serializable
data class ErrorResponse(
    @SerialName("message")
    val message: String,
    @SerialName("messageDetail")
    val messageDetail: String
)