package com.example.kotlinusersapp.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinusersapp.domain.model.User
import com.example.kotlinusersapp.domain.repository.UserRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainViewModel @Inject constructor (private val userRepo: UserRepo) : ViewModel() {

    private val _userList = MutableLiveData<List<User>>()
    val userList: LiveData<List<User>> get() = _userList

    init {
        getUsers()
    }

    private fun getUsers() {
        viewModelScope.launch {
            val users = withContext(Dispatchers.IO){ userRepo.getUsers() }
            Log.i("users", "getUsers: $users")
            _userList.value = users
        }
    }
}