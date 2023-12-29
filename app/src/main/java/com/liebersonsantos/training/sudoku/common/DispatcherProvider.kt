package com.liebersonsantos.training.sudoku.common

import kotlin.coroutines.CoroutineContext

/**
 * Coroutines != Threads, mas nós podemos usar dispatchers para dizer em qual thread
 * nosso coroutines vai rodar
 * */

interface DispatcherProvider {
    fun provideUIContext(): CoroutineContext
    fun provideIOContext(): CoroutineContext
}