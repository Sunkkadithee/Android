package com.pang.kotlinbasics

fun main(){
    //    you can not set up diferrent number
    val number1 = 1
    //number1 = 2

    //    you can set up diferrent number
    var myAge : Long = 35
    println(myAge)
    myAge  = 36645768794234354
    println(myAge)

    var pi = 3.14f
    println(pi)

    pi = 3.1415926535F
    println(pi)

    // Unsigned interger literals => UByte, UShot, ULong

    var age: UShort = 35u
    println(age)

    //Boolean ||=or, &&=and , ! = NOT
    val myTrue: Boolean = true
    val myFalse: Boolean = false

    println(myTrue || myFalse) //true
    println(myTrue && myFalse)// false
    println(!myTrue) // false

    var myage = 25
    myage = readln().toInt()

    if (myage<= 18){
        println("you can not go")
    }
    else{
        println("you can go")
    }



}