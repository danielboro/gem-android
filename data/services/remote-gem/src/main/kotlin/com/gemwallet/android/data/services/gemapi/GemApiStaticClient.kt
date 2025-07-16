package com.gemwallet.android.data.services.gemapi

import com.wallet.core.primitives.StakeValidator
import retrofit2.http.GET
import retrofit2.http.Path

interface GemApiStaticClient {

    @GET("/blockchains/{chain}/validators.json")
    suspend fun getValidators(@Path("chain") chain:String): List<StakeValidator>
}