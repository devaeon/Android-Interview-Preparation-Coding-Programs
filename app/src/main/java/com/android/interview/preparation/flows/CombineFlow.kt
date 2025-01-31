package com.android.interview.preparation.flows

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.shareIn

fun main() {
    val flow = flow {
        emit(1)
        delay(100)
        emit(2)
    }

    val sharedFlow = flow.shareIn(scope = CoroutineScope(Dispatchers.Default), started = SharingStarted.Lazily, replay = 1)

    sharedFlow.onEach { value ->
        println(value)  // Collect values
    }

}

