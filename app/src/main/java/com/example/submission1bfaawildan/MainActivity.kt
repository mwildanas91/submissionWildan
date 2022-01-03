package com.example.submission1bfaawildan

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val displayList = ArrayList<UserGithub>()
    val userList = ArrayList<UserGithub>()

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userList.add(UserGithub(R.drawable.user1,
            "Jake Wharton",
            "Jake Wharton",
            "Google, Inc.",
            "102",
            "56995",
            "12",
            "Pittsburgh, PA, USA"

        ))
        userList.add(UserGithub(
            R.drawable.user2,
            "Amit Shekhar",
            "amitshekhariitbhu",
            "MindOrksOpenSource",
            "37",
            "5153",
            "2",
            "New Delhi, India"
        ))
        userList.add(UserGithub(
            R.drawable.user3,
            "Romain Guy",
            "romainguy",
            "Google",
            "9",
            "7972",
            "0",
            "California"
        ))
        userList.add(UserGithub(
            R.drawable.user4,
            "Chris Banes",
            "chrisbanes",
            "Google working on @android",
            "30",
            "14725",
            "1",
            "Sydney, Australia"
        ))
        userList.add(UserGithub(
            R.drawable.user5,
            "David",
            "tipsy",
            "Working Group Two",
            "56",
            "788",
            "0",
            "Trondheim, Norway"
        ))
        userList.add(UserGithub(
            R.drawable.user6,
            "Ravi Tamada",
            "ravi8x",
            "AndroidHive | Droid5",
            "28",
            "18628",
            "3",
            "India"

        ))
        userList.add(UserGithub(
            R.drawable.user7,
            "Deny Prasetyo",
            "jasoet",
            "gojek-engineering",
            "44",
            "277",
            "39",
            "Kotagede, Yogyakarta, Indonesia"
        ))
        userList.add(UserGithub(
            R.drawable.user8,
            "Budi Oktaviyan",
            "budioktaviyan",
            "KotlinID",
            "110",
            "178",
            "23",
            "Jakarta, Indonesia"

        ))
        userList.add(UserGithub(
            R.drawable.user9,
            "Hendi Santika",
            "hendisantika",
            "JVMDeveloperID @KotlinID @IDDevOps",
            "1064",
            "428",
            "61",
            "Bojongsoang - Bandung Jawa Barat"
        ))
        userList.add(UserGithub(
            R.drawable.user10,
            "Sidiq Permana",
            "sidiqpermana",
            "Nusantara Beta Studio",
            "65",
            "465",
            "10",
            "Jakarta Indonesia"
        ))
        displayList.addAll(userList)

        val recyclerView = findViewById<RecyclerView>(R.id.rv_user)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = UserAdapter(this, userList){
            val intent = Intent (this, MoveActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)



        }
    }


}