package basics

import exampleOf
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun main() = runBlocking {


    fun data(): Flow<String> = flow {
        listOf("Cat", "Bat", "May").forEach { item ->
            delay(1000)
            emit(item)
        }
    }

    exampleOf("withTimeoutOrNull")

    withTimeoutOrNull(3000) {
        data().collect { item ->
            println(item)
        }
    }

    exampleOf("withTimeoutOrNull")


    exampleOf("ends here")
}