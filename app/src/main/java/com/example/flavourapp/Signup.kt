package com.example.flavourapp

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Bundle
import android.widget.Toast
import com.example.flavourapp.Authentication.Authentication
import com.example.flavourapp.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthWeakPasswordException
import com.google.firebase.auth.FirebaseAuthUserCollisionException

class Signup : Authentication() {

    private lateinit var binding: ActivitySignupBinding
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAuth = FirebaseAuth.getInstance()

        binding.textViewdn.setOnClickListener {
            val intent = Intent(this, Signin::class.java)
            startActivity(intent)
        }

        binding.dkbutton.setOnClickListener {
            dky()
        }

        binding.google.setOnClickListener {
            signIn()
        }
    }

    private fun dky() {
        val email = binding.editTextTextEmailAddress.text.toString().trim()
        val pass = binding.editTextTextPassword.text.toString().trim()

        if (!isNetworkAvailable()) {
            Toast.makeText(this, "Không có kết nối mạng!", Toast.LENGTH_SHORT).show()
            return
        }

        if (email.isEmpty()) {
            binding.editTextTextEmailAddress.error = "Email không được để trống"
            return
        }
        if (pass.isEmpty()) {
            binding.editTextTextPassword.error = "Mật khẩu không được để trống"
            return
        }
        if (pass.length < 6) {
            binding.editTextTextPassword.error = "Mật khẩu phải ít nhất 6 ký tự"
            return
        }

        mAuth.createUserWithEmailAndPassword(email, pass)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val user = mAuth.currentUser
                    user?.sendEmailVerification()?.addOnCompleteListener { verificationTask ->
                        if (verificationTask.isSuccessful) {
                            Toast.makeText(
                                applicationContext,
                                "Tài khoản được tạo thành công. Vui lòng kiểm tra email để xác nhận tài khoản!",
                                Toast.LENGTH_LONG
                            ).show()
                            val intent = Intent(this, Signin::class.java)
                            startActivity(intent)
                            finish()
                        } else {
                            Toast.makeText(
                                applicationContext,
                                "Không thể gửi email xác nhận. Vui lòng thử lại sau!",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                } else {
                    task.exception?.let {
                        val error = when (it) {
                            is FirebaseAuthWeakPasswordException -> "Mật khẩu quá yếu!"
                            is FirebaseAuthInvalidCredentialsException -> "Email không hợp lệ!"
                            is FirebaseAuthUserCollisionException -> "Email đã được sử dụng!"
                            else -> "Đăng ký không thành công!"
                        }
                        Toast.makeText(applicationContext, error, Toast.LENGTH_SHORT).show()
                    }
                }
            }
    }

    private fun isNetworkAvailable(): Boolean {
        val connectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = connectivityManager.activeNetworkInfo
        return activeNetwork != null && activeNetwork.isConnected
    }
}