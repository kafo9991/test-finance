package service

import model.Transaction
import repository.TransactionRepository

class TransactionService(
    private val repository: TransactionRepository
) {
    fun addTransaction(transaction: Transaction) = repository.addTransaction(transaction)

    fun getAllTransactions(): List<Transaction> = repository.getAllTransactions()

    fun updateTransaction(updated: Transaction): Boolean = repository.updateTransaction(updated)

    fun deleteTransaction(id: Int): Boolean = repository.deleteTransaction(id)
}