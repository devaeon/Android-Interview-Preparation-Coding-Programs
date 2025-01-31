package com.android.interview.preparation.flows

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flatMapMerge
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun getData(id: Int): Flow<String> = flow {
    emit("Loading for $id")
    delay(500) // Simulating API delay
    emit("Data for $id")
}

suspend fun testFlatMapConcat() {
        flowOf(1, 2, 3)
            .flatMapConcat { getData(it) }
            .collect { println(it) }
    }


suspend fun testFlatMapMerge() {
        flowOf(1, 2, 3)
            .flatMapMerge { getData(it) }
            .collect { println(it) }
}

suspend fun testFlatMapLatest() {
        flowOf(1, 2, 3)
            .flatMapLatest { getData(it) }
            .collect { println(it) }
    }


fun main()= runBlocking{
    testFlatMapLatest()
    testFlatMapMerge()
    testFlatMapConcat()
}
