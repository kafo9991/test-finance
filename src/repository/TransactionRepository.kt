package repository
import model.Transaction

interface TransactionRepository {
    fun addTransaction(transaction: Transaction)
    fun getAllTransactions(): List<Transaction>
    fun getTransactionById(id: Int): Transaction?
    fun updateTransaction(updated: Transaction): Boolean
    fun deleteTransaction(id: Int): Boolean
}