package com.dcard.koinsample

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.dcard.component.NormalAtm
import com.dcard.koinsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels {
        MyViewModelFactory(NormalAtm())
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