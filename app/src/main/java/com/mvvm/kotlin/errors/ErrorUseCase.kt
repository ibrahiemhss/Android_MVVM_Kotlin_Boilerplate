package com.mvvm.kotlin.usecase.errors

import com.mvvm.kotlin.data.error.Error

interface ErrorUseCase {
    fun getError(errorCode: Int): Error
}
