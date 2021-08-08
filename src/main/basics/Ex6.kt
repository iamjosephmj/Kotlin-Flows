package basics

import exampleOf
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    exampleOf("completion")

    exampleOf("Iterative")

    fun data(): Flow<Int> = flow {
        emit(1)
        emit(2)
        emit(3)
    }

    try {
        data().collect { item ->
            println(item)
        }
    } finally {
        println("Completed")
    }

    exampleOf("Declarative")

    data()
        .onCompletion {
            println("Completed declarative")
        }
        .collect { item ->
            println(item)
        }

    exampleOf("ends here")
}