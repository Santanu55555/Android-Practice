package com.example.logincompose

import android.content.Context
import android.widget.Toast

//@formatter:off
fun verifyUser(name: String, email: String, password: String, context: Context): Boolean {
    return if (name != "") {
        if (email == "santanu" && password == "12345") {
            Toast.makeText(context, "Logged in successfully", Toast.LENGTH_SHORT).show()
            true
        } else {
            Toast.makeText(context, "Wrong username or password", Toast.LENGTH_SHORT).show()
            false
        }
    } else {
        Toast.makeText(context, "Name Can't be blank", Toast.LENGTH_SHORT).show()
        false
    }
}