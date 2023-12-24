package com.example.easybudget.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.easybudget.components.TransactionEntry

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BudgetScreen() {
    Scaffold(
        topBar = {
            TopAppBar()
        },
        containerColor = Color(66, 76, 118)
    ) { paddingValues ->
        Row(modifier = Modifier.padding(paddingValues)) {
            TransactionEntry()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar() {
    TopAppBar(title = {
        Text(text = "Budget")
    },
        actions = {
            IconButton(
                onClick = {
                },
            ) {
                Icon(
                    imageVector = Icons.Outlined.AddCircle,
                    contentDescription = ""
                )
                
            }
        }
    )
}
