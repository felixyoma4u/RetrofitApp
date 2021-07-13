package com.emoyoma.retrofitapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.emoyoma.retrofitapp.databinding.UserItemBinding
import com.emoyoma.retrofitapp.models.User

class UserAdapter(var users: List<User>): RecyclerView.Adapter<UserAdapter.UsersViewHolder>() {

    class UsersViewHolder(private val binding: UserItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(users: User){
            binding.apply {
                nameDisplay.text = users.name
                emailDisplay.text = users.email
                streetDisplay.text = users.address.street
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
      val binding = UserItemBinding.inflate(LayoutInflater.from(parent.context))
        return UsersViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        holder.bind((users[position]))
    }

    override fun getItemCount(): Int {
        return users.size
    }

}