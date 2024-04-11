package org.example.Coroutines

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() =runBlocking { // MAIN THRead creates a coroutine that blocks the current main thread

    println("main prog starts: ${Thread.currentThread().name}") //main thread

   val job: Job = launch { //MAin thread creates a child coroutine but in worker thread(Bckgroud)
        println("fake prog starts: ${Thread.currentThread().name}") //main
        delay(1000) // corutine is suspended but  t1 is free
        println("fake prog starts: ${Thread.currentThread().name}")
    }

    //dont use delay as its not good to use , so use join n cancel
    //delay(2000) //main thread: wait for corutine to finish

    job.join()

    println("main prog end: ${Thread.currentThread().name}")


        }

//here since runblocking works on main thread so launch bhi usi pr kam krega
//runblocking creates a coroutine , n launch creates a child coroutine which works on same thread as parent coroutine
