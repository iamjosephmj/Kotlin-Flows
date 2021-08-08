package basics

import exampleOf
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(): Unit = runBlocking {

    exampleOf("Sequences - blocks main thread")
    fun data(): Sequence<String> = sequence {
        for (item in listOf("Hat", "Bat", "Cat")) {
            Thread.sleep(1000)
            yield(item)
        }
    }

    data().forEach { item ->
        println(item)
    }

    exampleOf("Suspending Functions")

    suspend fun dataSuspended(): List<String> {
        delay(1000)
        return listOf("Hat", "Bat", "Cat")
    }

    launch {
        dataSuspended().forEach { item ->
            println(item)
        }
    }

    exampleOf("Post Work")
}