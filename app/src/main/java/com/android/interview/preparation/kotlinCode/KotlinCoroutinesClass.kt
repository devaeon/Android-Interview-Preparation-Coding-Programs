package com.android.interview.preparation.kotlinCode

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.concurrent.CompletableFuture

// Kotlin suspending function
suspend fun fetchData(): String {
    delay(1000)  // Simulate long-running task
    return "Data fetched!"
}

object CoroutineHelper {
    fun fetchDataAsync(): CompletableFuture<String> {
        val future = CompletableFuture<String>()
        GlobalScope.launch(Dispatchers.IO) {
            try {
                val result = fetchData()
                future.complete(result)
            } catch (e: Exception) {
                future.completeExceptionally(e)
            }
        }
        return future
    }
}