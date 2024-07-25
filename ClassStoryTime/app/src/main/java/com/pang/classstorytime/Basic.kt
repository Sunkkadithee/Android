package com.pang.classstorytime

fun main() {
    var daisy = Dog("Daisy", "Dwarf poodle" ,1)
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
    println("A year has passed!")

    daisy.age = 2
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")

}