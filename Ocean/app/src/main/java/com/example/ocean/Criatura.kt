package com.example.ocean

data class Criatura (
    val number: Int,
    val name: String,
    val image: String,
    val legendary: Boolean,
    val evolveTo: Criatura?
)