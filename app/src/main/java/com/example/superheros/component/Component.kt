package com.example.superheros.component

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SuperHeroTopBar(title: String, modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = { Text(text = title,
            style = MaterialTheme.typography.displayLarge) },
        modifier = modifier
    )
}