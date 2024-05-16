package com.suleyman.retrofitkotlin.service

import io.reactivex.Observable
import com.suleyman.retrofitkotlin.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData() : Observable<List<CryptoModel>>


    //fun getData() : Call<List<CryptoModel>>


}