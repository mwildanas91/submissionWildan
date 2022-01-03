package com.example.submission1bfaawildan

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class UserGithub(
    var avatar: Int,
    var name: String,
    var username: String,
    var company: String,
    var repository: String,
    var followers: String,
    var following: String,
    var location: String

) : Parcelable