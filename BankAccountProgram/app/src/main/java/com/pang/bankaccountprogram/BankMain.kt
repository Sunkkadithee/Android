package com.pang.bankaccountprogram

fun main(){
 val PangBankAccount = BankAccount("Pang", 1000.00)

    PangBankAccount.deposit(200.0)

    PangBankAccount.withdraw(1500.00)

    PangBankAccount.deposit(3000.00)


    PangBankAccount.deposit(200.00)

    PangBankAccount.withdraw(500.00)

   PangBankAccount.displayTransactionHistory()
    println("Account ${PangBankAccount.accountHolder} have belance is $${PangBankAccount.balance}")
}