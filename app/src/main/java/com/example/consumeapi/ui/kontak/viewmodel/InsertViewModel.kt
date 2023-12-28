package com.example.consumeapi.ui.kontak.viewmodel

import com.example.consumeapi.model.Kontak

data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent(),
)
data class InsertUiEvent(
    val id: Int = 0,
    val nama: String = "",
    val email: String = "",
    val nohp: String = "",
)

fun InsertUiEvent.toKontak(): Kontak = Kontak(
    id = id,
    nama = nama,
    email = email,
    noHp = nohp
)

fun Kontak.toUiStateKontak(): InsertUiState = InsertUiState(
    insertUiEvent = toInsertUiEvent(),
)

fun Kontak.toInsertUiEvent(): InsertUiEvent = InsertUiEvent(
    id = id,
    nama = nama,
    email = email,
    nohp = noHp
)
