package com.login.loginapp.screens

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.login.loginapp.R
import com.login.loginapp.components.AuthHeaderView
import com.login.loginapp.components.CustomTextField

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val authHeaderView = findViewById<AuthHeaderView>(R.id.authHeaderView)
        authHeaderView.setData("Giriş Yap", "Hesabınızda oturum açın", "login")

        val usernameField = findViewById<CustomTextField>(R.id.usernameField)
        usernameField.setFieldType(CustomTextField.CustomTextFieldType.USERNAME)

    }
}