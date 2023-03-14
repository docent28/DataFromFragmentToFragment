package com.example.datafromfragmenttofragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel : ViewModel() {
    val messageForFragmentOne: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val messageForFragmentTwo: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}