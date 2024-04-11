package org.example.Coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() { //executes in main thread
    runBlocking { //creates a coroutine that blocks the current main thread
        println("main prog starts: ${Thread.currentThread().name}") //main thread

        GlobalScope.launch { //{thread t1} creates a child coroutine but in worker thread(Bckgroud)
            println("fake prog starts: ${Thread.currentThread().name}") //t1
            delay(1000) // corutine is suspended but  t1 is free
            println("fake prog starts: ${Thread.currentThread().name}")
        }

        delay(2000) //main thread: wait for corutine to finish

        println("main prog end: ${Thread.currentThread().name}")


    }
}