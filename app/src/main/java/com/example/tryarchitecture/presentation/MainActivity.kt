package com.example.tryarchitecture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tryarchitecture.databinding.ActivityMainBinding
import com.example.tryarchitecture.domain.models.SaveUserNameParam
import com.example.tryarchitecture.domain.useCase.GetUserNameUseCase
import com.example.tryarchitecture.domain.useCase.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val getUserNameUseCase = GetUserNameUseCase()
    private val saveUserNameUseCase = SaveUserNameUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {
            val text = binding.edtInputData.text.toString()
            val params = SaveUserNameParam(name = text)
            val result = saveUserNameUseCase.execute(param = params)
            binding.twDataTitle.text = "Save result = $result"
        }

        binding.receiveButton.setOnClickListener {
            val userName = getUserNameUseCase.execute()
            binding.twDataTitle.text = "${userName.firstName} ${userName.lastName}"
        }
    }
}