package com.example.kapilesh.flags

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("name")
    val countryName: String?,
    @SerializedName("capital")
    val capital: String?,
    @SerializedName("flagPNG")
//    @SerializedName("flag")
    val flag: String?
)