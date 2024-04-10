package org.example.Coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


//main thread pr small n light operations chlana chaiye
//for heavy work like use of net , file download or upload , database querying we shud use worker threads
//but also creating so many threads is not a good idea as our memory gets full or system gets out of memory
//so the sol is using couroutines
//means ek background thread hoga n us pr bhot sara couroutine chla skte
//coroutines are not thread
//diff is coroutines are very very cheap , we can create 1000s  of them without any memory issue
//unlike threads , for coroutine the application by default does not wait for it to finish its execution
fun  main(){
    println("main thread starts: ${Thread.currentThread().name}")

//    thread { // creates a thread
//        println("Worker thread 1 working : ${Thread.currentThread().name}")
//        Thread.sleep(1000)
//        println("Worker thread 1 finished : ${Thread.currentThread().name}")
//
//    }

    //globalscope ko use krne se iske andar ka chla hi ni
    //main prog doesnt know whether to wait or not for coroutine
    //but agr thread.sleep lgau to worker thread chlega
   GlobalScope.launch {// operates within a thread
        println("Worker thread 2 working : ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Worker thread 2 finished : ${Thread.currentThread().name}")

    }
    //blocks the current main thread n wait for coroutine to finish
    //practically not a right way to wait
    Thread.sleep(2000)
    println("main thread ends: ${Thread.currentThread().name}")

}

