package com.pang.coffeemachines

fun main(){
    // Immutable list - you cannotadd items after the initilization
   // val shoppingList = listOf("Processor","Ram", "Graphice Card", "SSD")

    // mutable list- you caan add items later and modify
    val shoppingList = mutableListOf("Processor", "Ram", "Graphice Card RTX 3060", "SSD")

    //adding item to list
    shoppingList.add("cooling System")
    shoppingList.remove("Graphice Card RTX 3060")
    shoppingList.add("Graphice Card RTX 4090")

    println(shoppingList)
    shoppingList.removeAt(2)
    println(shoppingList)
    shoppingList.removeAt(1)
    println(shoppingList)
    shoppingList.add(1,"Ram")
    println(shoppingList)
    println(shoppingList[1])

    shoppingList[3] = "Graphice Card RTX 7800"
    println(shoppingList)

    shoppingList.set(1, "Water Colling")
    println(shoppingList)

    for(item in shoppingList){
        println(item)
    }

}


/*
data class CoffeeDatail(val sugarCount : Int, val Name: String, val size:String, val creamAmount:Int)

fun main() {
 val coffeeForPang = CoffeeDatail(4, "Pang", "xl", 0)
 makeCoffee(coffeeForPang)
}

fun askcoffeeDetail(){
    println("Enter Your name for the order: ")
    var Name = readln()

    println("How many sugar(type the number): ")
    var sugarCount = readln().toIntOrNull() ?:0

    //callfunction
    //makeCoffee(sugarCount, Name)
}

//Define function
fun makeCoffee(CoffeeDatail: CoffeeDatail) {
    if (CoffeeDatail.sugarCount == 1) {
        println("Coffee with ${CoffeeDatail.sugarCount} spoon of sugar for ${CoffeeDatail.Name}"
                + ", size ${CoffeeDatail.size} "
                + "and cream: ${CoffeeDatail.creamAmount}")
    } else if (CoffeeDatail.sugarCount >= 2) {
        println("Coffee with ${CoffeeDatail.sugarCount} spoons of sugar for ${CoffeeDatail.Name}"
                + ", size ${CoffeeDatail.size} "
                + "and cream: ${CoffeeDatail.creamAmount}")
    } else {
        println("Coffee with no sugar for ${CoffeeDatail.Name}"
                + ", size ${CoffeeDatail.size} "
                + "and cream: ${CoffeeDatail.creamAmount}")
    }
}*/
