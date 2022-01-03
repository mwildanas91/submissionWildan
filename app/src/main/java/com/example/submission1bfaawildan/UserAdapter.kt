package com.example.submission1bfaawildan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class UserAdapter (private val context: Context, private val usergit: List<UserGithub>, val listener: (UserGithub)  -> Unit)
    : RecyclerView.Adapter<UserAdapter.UserGithubViewHolder>(){

    class UserGithubViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val avatar = view.findViewById<ImageView>(R.id.img_item_photo)
        val name = view.findViewById<TextView>(R.id.tv_item_name)
        val username = view.findViewById<TextView>(R.id.tv_item_username)
        val company = view.findViewById<TextView>(R.id.tv_item_company)

        fun bindView(usergit: UserGithub,listener: (UserGithub) -> Unit) {
            avatar.setImageResource(usergit.avatar)
            name.text = usergit.name
            username.text = usergit.username
            company.text = usergit.company
            itemView.setOnClickListener{
                listener(usergit)

            }


         }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserGithubViewHolder {
        return UserGithubViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_user, parent, false)
        )
    }

    override fun onBindViewHolder(holder: UserGithubViewHolder, position: Int) {
        holder.bindView(usergit[position], listener)
    }

    override fun getItemCount(): Int = usergit.size
    }
