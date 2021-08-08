package basics

import exampleOf
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    exampleOf("Simple flow")


    fun returnFlowData(): Flow<String> = flow {
        listOf("Cat", "Bat", "Mat").forEach { item ->
            delay(1000)
            emit(item)
        }
    }

    launch {
        returnFlowData().collect { item ->
            println(item)
        }
    }

    exampleOf("Simple flow ends here.")


    exampleOf("Simple flow - as cold observables.")

    returnFlowData().collect { item ->
        println(item)
    }
    returnFlowData().collect { item ->
        println(item)
    }

}