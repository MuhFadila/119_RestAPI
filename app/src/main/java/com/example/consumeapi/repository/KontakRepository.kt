package com.example.consumeapi.repository

import com.example.consumeapi.model.Kontak
import com.example.consumeapi.service_api.KontakService

interface KontakRepository{

    suspend fun getKontak(): List<Kontak>
}


class NetworkkontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository{

    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}