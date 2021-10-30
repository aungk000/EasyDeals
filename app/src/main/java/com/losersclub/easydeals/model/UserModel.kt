package com.losersclub.easydeals.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class UserModel {
    private var _username = MutableLiveData<String>()
    private var _password = MutableLiveData<String>()
    private var _phone = MutableLiveData<Int>()
    private var _email = MutableLiveData<String>()

    val username: LiveData<String> = _username
    val password: LiveData<String> = _password
    val phone: LiveData<Int> = _phone
    val email: LiveData<String> = _email


}