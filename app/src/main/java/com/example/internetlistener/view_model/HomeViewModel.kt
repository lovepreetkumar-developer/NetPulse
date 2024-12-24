package com.example.internetlistener.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {

    private var _connectionState = MutableLiveData(false)
    var connectionState: LiveData<Boolean> = _connectionState

    fun  setConnectionState(status: Boolean){
        _connectionState.postValue(status)
    }
}