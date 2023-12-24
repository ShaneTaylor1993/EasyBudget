package com.example.easybudget.data.database

import androidx.compose.runtime.MutableState
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Income(
    @PrimaryKey val id: Int,
    val type: String = "Income",
    val name: MutableState<String>,
    val amount: MutableState<Float>
)

@Entity
data class Expenses(
    @PrimaryKey val id: Int,
    val type: String = "Expense",
    val name: MutableState<String>,
    val amount: MutableState<Float>
)
