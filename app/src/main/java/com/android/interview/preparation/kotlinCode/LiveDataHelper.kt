package com.android.interview.preparation.kotlinCode

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object LiveDataHelper {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> get() = _data

    fun updateData(newValue: String) {
        _data.postValue(newValue)
    }
}