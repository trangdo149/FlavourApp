package com.example.flavourapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.flavourapp.Authentication.Authentication
import com.example.flavourapp.databinding.ActivitySigninBinding
import com.google.firebase.auth.FirebaseAuth

class Signin : Authentication() {

    private lateinit var binding: ActivitySigninBinding
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAuth = FirebaseAuth.getInstance()

        binding.textViewdk.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

        binding.dnhapbutton.setOnClickListener {
            login()
        }

        binding.google.setOnClickListener {
            signIn()
        }
    }

    private fun login() {
        val email = binding.editTextTextEmailAddress.text.toString().trim()
        val pass = binding.editTextTextPassword.text.toString().trim()

        if (email.isEmpty()) {
            binding.editTextTextEmailAddress.error = "Email không được để trống"
            return
        }
        if (pass.isEmpty()) {
            binding.editTextTextPassword.error = "Mật khẩu không được để trống"
            return
        }

        mAuth.signInWithEmailAndPassword(email, pass)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val user = mAuth.currentUser
                    if (user != null && user.isEmailVerified) {
                        Toast.makeText(this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(
                            this,
                            "Email của bạn chưa được xác minh. Vui lòng kiểm tra email để xác minh tài khoản.",
                            Toast.LENGTH_LONG
                        ).show()
                        user?.sendEmailVerification()
                    }
                } else {
                    val errorMessage = task.exception?.message ?: "Đăng nhập không thành công!"
                    Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
                }
            }
    }
}