package basics

import exampleOf
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {

    val data1 = listOf("A", "B", "C")
    val data2 = listOf("D", "E", "F")
    val data3 = listOf("G", "H", "I")

    exampleOf("flowOf")

    flowOf(data1, data2, data3).collect { item ->
        println(item)
    }

    exampleOf("asFlow")

    data1.asFlow().collect { item ->
        println(item)
    }

}