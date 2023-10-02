package com.mshaw.vin.util.extensions

import io.ktor.http.HttpStatusCode

sealed interface HttpStatusCodeType {
    val name: String

    data object Info : HttpStatusCodeType {
        override val name = "INFORMATIONAL"
    }
    data object Success : HttpStatusCodeType{
        override val name = "SUCCESS"
    }

    data object Redirect : Error {
        override val fault = HttpErrorFault.SERVER
        override val name = "INFORMATIONAL"

    }

    sealed interface Error: HttpStatusCodeType {
        val fault: HttpErrorFault

        data object Client : Error {
            override val fault = HttpErrorFault.CLIENT
            override val name = "${fault}_ERROR"
        }

        data object Server : Error {
            override val fault = HttpErrorFault.SERVER
            override val name = "${fault}_ERROR"
        }
    }

    companion object {
        fun values(): Array<HttpStatusCodeType> {
            return arrayOf(Info, Success, Redirect, Error.Client, Error.Server)
        }

        fun valueOf(value: String): HttpStatusCodeType {
            return when (value) {
                Info.name -> Info
                Success.name -> Success
                Redirect.name -> Redirect
                Error.Client.name -> Error.Client
                Error.Server.name -> Error.Server
                else -> throw IllegalArgumentException("No object com.mshaw.vin.util.extensions.HttpStatusCodeType.$value")
            }
        }
    }
}

enum class HttpErrorFault {
    CLIENT, SERVER
}

val HttpStatusCode.codeType
    get() = when (value) {
        in 100..<200 -> {
            HttpStatusCodeType.Info
        }

        in 200..<300 -> {
            HttpStatusCodeType.Success
        }

        in 300..<400 -> {
            HttpStatusCodeType.Redirect
        }

        in 400..<500 -> {
            HttpStatusCodeType.Error.Client
        }

        in 500..<600 -> {
            HttpStatusCodeType.Error.Server
        }

        else -> throw IllegalStateException("Server code out of range 200..<600")
    }