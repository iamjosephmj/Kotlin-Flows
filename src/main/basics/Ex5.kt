package basics

import exampleOf
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val data = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    exampleOf("operators")

    exampleOf("filter")
    data.asFlow().filter { item ->
        item > 5
    }.collect { item ->
        println(item)
    }

    exampleOf("map")
    data.asFlow()
        .filter { item ->
            item > 5
        }
        .map { item ->
            item * 10
        }.collect { item ->
            println(item)
        }

    exampleOf("transform")
    data.asFlow().transform { item ->
        if (item > 5) {
            emit(item)
        }
    }.collect { item ->
        println(item)
    }

    exampleOf("size limiting operator")

    exampleOf("take")
    data
        .asFlow()
        .take(2)
        .collect { item ->
            println(item)
        }

    exampleOf("skip")

    data
        .asFlow()
        .drop(2)
        .collect { item ->
            println(item)
        }

    exampleOf("ends here")

    val reducedResult = data.asFlow()
        .reduce { accumulator, value ->
            accumulator + value
        }

    print(reducedResult)
}