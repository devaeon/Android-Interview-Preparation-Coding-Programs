package com.android.interview.preparation.kotlinCode
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

object FlowHelper {
    fun getNumbers(): Flow<Int> = flow {
        for (i in 1..5) {
            emit(i)
            delay(500)
        }
    }

    fun getNumbersAsCallback(callback: (Int) -> Unit) {
        GlobalScope.launch(Dispatchers.IO) {
            getNumbers().collect {
                callback(it)
            }
        }
    }


}
