package ui

fun main(){

}

private fun mainMenu() {
    while (true) {
        println("""
            _______________________
            Welcome to PFT, How i can help you today:
            1- income
            2- expenses
            3- View transactions
            4- Exit
            _______________________
            """.trimIndent())

        print("Enter your option: ")
        when (readln()) {
            "1" -> incomeMenu()
            "2" -> expensesMenu()
            "3" -> viewTransactionsMenu()
            "4" -> return
            else -> println("Invalid option!")
        }
    }
}

private fun incomeMenu() {
    while (true) {
        println("""
            _______________________
            income menu
            1- add income
            2- view income transaction
            0- Back to main menu
            _______________________
            """.trimIndent())

        print("Enter income amount: ")
        when (readln()) {
            "1" -> addIncome()
            "2" -> viewIncomeTransactions()
            "0" -> return
            else -> println("Invalid option!")
        }
    }
}

private fun addIncomeMenu() {
    var amount: Double
    var incomeSalary: String
    while (true) {
        print("_______________________\n" +
                "let's add income\n" +
                "Enter Amount: ")
        amount = readln().toDouble()

        //income update

        print("Enter Category: ")
        incomeSalary = readln().toString()
        println("Your Balance: ") //display balance after update

    }
}

fun viewIncomeTransactions() {
    println("viewIncomeTransactions")
}

fun addIncome() {
    println("addIncome")
}

fun viewTransactionsMenu() {
    println("viewTransactionsMenu")
}

fun expensesMenu() {
    println("expensesMenu")
}


