package com.example.myapplication.ui.myteam

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyteamViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is myteam Fragment"
    }
    val text: LiveData<String> = _text
}