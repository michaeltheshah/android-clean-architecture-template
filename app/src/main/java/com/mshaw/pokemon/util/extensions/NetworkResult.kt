package com.mshaw.vin.util.extensions

import com.mshaw.vin.util.state.NetworkResult
import com.mshaw.vin.util.state.State
import com.mshaw.vin.util.state.success

fun <T> NetworkResult<T>.toState(): State<T> {
    return when (this) {
        is NetworkResult.Ok -> {
            success { value }
        }
        is NetworkResult.Exception -> {
            error { exception }
        }
    }
}