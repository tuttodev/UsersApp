package com.example.kotlinusersapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.DividerItemDecoration.VERTICAL
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinusersapp.MyApplication
import com.example.kotlinusersapp.R
import com.example.kotlinusersapp.data.UserDataSourceImpl
import com.example.kotlinusersapp.domain.repository.UserRepoImpl
import com.example.kotlinusersapp.presentation.adapter.UsersAdapter
import com.example.kotlinusersapp.vo.RetrofitClient
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory

    private val mainViewModel by viewModels<MainViewModel> { mainViewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (applicationContext as MyApplication).appComponent.inject(this)
        setupRecycler()
        setupObservers()
    }

    private fun setupRecycler() {
        rv_users.layoutManager = LinearLayoutManager(this)
        rv_users.addItemDecoration(DividerItemDecoration(this, VERTICAL))
    }
    private fun setupObservers() {
        mainViewModel.userList.observe(this, Observer { userList ->
            rv_users.adapter = UsersAdapter(userList, this)
        })
    }
}