package com.example.kotlinusersapp.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlinusersapp.R
import com.example.kotlinusersapp.domain.model.User
import kotlinx.android.synthetic.main.user_row.view.*

class UsersAdapter(private val userList: List<User>, private val ctx: Context): RecyclerView.Adapter<UsersAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(ctx).inflate(R.layout.user_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(userList[position], position)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User, position: Int){
            itemView.tv_name.text = user.name
            if(user.urlImage != ""){
                Glide.with(ctx).load(user.urlImage).into(itemView.iv_avatar)
            }
        }
    }
}