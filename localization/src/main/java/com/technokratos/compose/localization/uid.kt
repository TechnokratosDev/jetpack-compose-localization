package com.technokratos.compose.localization

import java.util.concurrent.atomic.AtomicInteger

private val resUID = AtomicInteger(Int.MIN_VALUE)
private val objToUID = mutableMapOf<Any, Int>()

internal fun generateUID(): Int = resUID.incrementAndGet()

internal fun generateUID(name: Any): Int = resUID.incrementAndGet().also {
    objToUID[name] = it
}
