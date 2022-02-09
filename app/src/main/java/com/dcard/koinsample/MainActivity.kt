package com.dcard.koinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dcard.koinsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupViews()
    }

    private fun setupViews(){

        binding.apply {
            depositButton.setOnClickListener {
                cleanInput()
            }

            withdrawButton.setOnClickListener {
                cleanInput()
            }

            remitButton.setOnClickListener {
                cleanInput()
            }
        }
    }

    private fun cleanInput(){
        binding.editText.text = null
    }
}