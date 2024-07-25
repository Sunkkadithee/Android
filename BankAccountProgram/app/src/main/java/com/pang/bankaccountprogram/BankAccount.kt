package com.pang.bankaccountprogram

class BankAccount(var accountHolder: String, var balance: Double) {
    private val transationHistiry = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transationHistiry.add("$accountHolder deposited + $$amount")

    }
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            transationHistiry.add("$accountHolder withdrew -$$amount")
        } else {
            println("You don't have the funds to withdraw $$amount")
            transationHistiry.add("$accountHolder attempted to withdraw -$$amount but failed due to insufficient funds")
        }
    }


    fun displayTransactionHistory(){
        println("---Transaction history for $accountHolder---")
          for(transaction in transationHistiry){
              println(transaction)
          }
    }
}