package com.example.submission1bfaawildan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MoveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val usergit = intent.getParcelableExtra<UserGithub>(MainActivity.INTENT_PARCELABLE)

        val avatar = findViewById<ImageView>(R.id.img_avatar)
        val username = findViewById<TextView>(R.id.tv_username)
        val name = findViewById<TextView>(R.id.tv_name)
        val company = findViewById<TextView>(R.id.tv_company)
        val repository = findViewById<TextView>(R.id.tv_RepositoryNumber)
        val followers = findViewById<TextView>(R.id.tv_FollowersNumber)
        val following = findViewById<TextView>(R.id.tv_FollowingNumber)
        val location = findViewById<TextView>(R.id.tv_location)

        avatar.setImageResource(usergit?.avatar!!)
        name.text = usergit.name
        username.text = usergit.username
        company.text = usergit.company
        repository.text = usergit.repository
        followers.text = usergit.followers
        following.text = usergit.following
        location.text = usergit.location
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}