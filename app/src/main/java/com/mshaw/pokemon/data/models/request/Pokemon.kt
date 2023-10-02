package com.mshaw.vin.data.models.request

@JvmInline
value class Pokemon(val string: String) {
    override fun toString(): String {
        return string
    }
}

fun String.toPokemon() = Pokemon(this)