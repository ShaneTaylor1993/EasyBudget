package com.example.easybudget.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.StateFlow

@Dao
interface TransactionDao {
    @Query("SELECT name, amount FROM Income")
    fun getIncome(): StateFlow<List<Income>>

    @Query("SELECT name, amount FROM Expenses")
    fun getExpenses(): StateFlow<List<Expenses>>

    @Insert
    fun addIncome(income: Income)

    @Insert
    fun addExpense(expenses: Expenses)
}