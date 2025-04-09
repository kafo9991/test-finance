package model

import java.time.LocalDate

data class Transaction(
    val id: Int,
    val amount: Double,
    val date: LocalDate,
    val category: Category,
    val description: String
)