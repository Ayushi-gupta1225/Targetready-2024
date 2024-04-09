package Coroutines

import kotlin.concurrent.thread

fun  main(){
    println("main thread starts: ${Thread.currentThread().name}")

    thread {
        println("Worker thread working : ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Worker thread finished : ${Thread.currentThread().name}")

    }
    println("main thread ends: ${Thread.currentThread().name}")

}