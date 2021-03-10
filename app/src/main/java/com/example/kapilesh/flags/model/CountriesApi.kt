package com.example.kapilesh.flags.model

import com.example.kapilesh.flags.Country
import io.reactivex.Single
import retrofit2.http.GET

interface CountriesApi {

    @GET("DevTides/countries/master/countriesV2.json")
//    @GET("all")
    fun getCountries(): Single<List<Country>>
}