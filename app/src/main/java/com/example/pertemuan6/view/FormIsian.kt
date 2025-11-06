package com.example.pertemuan6.view

import androidx.compose.runtime.Composable

@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit
) {