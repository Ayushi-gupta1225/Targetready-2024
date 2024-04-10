package org.example.Coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun  main(){
    println("main thread starts: ${Thread.currentThread().name}")

    //let us assume coroutine hmara thread 1 pr start hora h
   GlobalScope.launch {//Thread :T1
        println("Worker thread  working : ${Thread.currentThread().name}") //Thread:T1
        delay(1000)//coroutine is suspended but thread t1 is free(not blocked)
        println("Worker thread  finished : ${Thread.currentThread().name}")//can run on any thread t1 or other

    }


    //here i cant use delay fxn as it cant be called from outside a coroutine
    //solution to use delay outsode is to use runblocking n keep delaf yxn in that

    runBlocking { //creates a coroutine h=that blox=cks the current main thread
        delay(2000) //wait for co
    }
   // Thread.sleep(2000)
    println("main thread ends: ${Thread.currentThread().name}")

}

//SUSPEND fxn -- a fxn with suspend modifie is know as suspending fxn
//            -- these fxns are only allowed to be called from a coroutine
//or from another suspending fxn
//they cannot be called from outside a coroutine