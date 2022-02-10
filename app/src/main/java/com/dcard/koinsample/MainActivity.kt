package com.dcard.koinsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dcard.koinsample.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModel {
        parametersOf(UseCase.Normal)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupViews()
        setupViewModel()
    }

    private fun setupViews() {

        binding.apply {
            depositButton.setOnClickListener {
                viewModel.onDeposit(editText.text.toString().toInt())
                cleanInput()
            }

            withdrawButton.setOnClickListener {
                viewModel.onWithdraw(editText.text.toString().toInt())
                cleanInput()
            }

            remitButton.setOnClickListener {
                viewModel.onRemit(editText.text.toString().toInt())
                cleanInput()
            }
        }
    }

    private fun setupViewModel() {
        val owner = this
        viewModel.apply {
            amount.observe(owner) { value ->
                binding.amountTextView.text = (value ?: 0).toString()
            }
        }
    }

    private fun cleanInput() {
        binding.editText.text = null
    }
}