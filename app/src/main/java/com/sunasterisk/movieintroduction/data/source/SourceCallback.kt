package com.sunasterisk.movieintroduction.data.source

interface SourceCallback<T> {
    fun onSuccess(data: T)
    fun onError(e: Exception)
}
