package com.suleyman.retrofitkotlin.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(
    //aldığımız verilerin isimleri aynı olursa (currency price) serializedName kullanmamaıza da gerek kalmaz!
    //@SerializedName("currency")
    val currency: String,

    //@SerializedName("price")
    val price: String
)