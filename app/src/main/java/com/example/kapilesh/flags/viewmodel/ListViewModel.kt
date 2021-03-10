package com.example.kapilesh.flags.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kapilesh.flags.Country

class ListViewModel : ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()


    fun refresh() {
        fetchCountries()
    }

    private fun fetchCountries() {
        val mockData = listOf(
            Country("Country A"),
            Country("Country B"),
            Country("Country C"),
            Country("Country D"),
            Country("Country E"),
            Country("Country F"),
            Country("Country G"),
            Country("Country H"),
            Country("Country I"),
            Country("Country J"),
            Country("Country K")
        )

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }

}