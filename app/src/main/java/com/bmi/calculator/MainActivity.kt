package com.bmi.calculator

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bmi.calculator.databinding.ActivityMainBinding
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.usaSwitch.setOnClickListener {
            if (binding.usaSwitch.isChecked) {
                binding.weightEtLayout.hint = "Enter weight (lbs)"
                binding.heightEtLayout.hint = "Enter height (in)"
            } else {
                binding.weightEtLayout.hint = "Enter weight (kg)"
                binding.heightEtLayout.hint = "Enter height (cm)"
            }
        }



        binding.calculateBtn.setOnClickListener {


            val weightText = binding.weightEt.text.toString()
            val heightText = binding.heightEt.text.toString()

            if (weightText.isBlank() || heightText.isBlank()) {
                binding.heightEt.error = "Required"
                binding.weightEt.error = "Required"
                return@setOnClickListener
            }
            val weight = weightText.toFloatOrNull()
            val height = heightText.toFloatOrNull()

            if (weight == null || height == null || weight <= 0 || height <= 0) {
                binding.heightEt.error = "Invalid value"
                binding.weightEt.error = "Invalid value"
                return@setOnClickListener
            }

            val bmi = if (binding.usaSwitch.isChecked) {
                // BMI = (lbs / in^2) * 703
                (weight / (height * height)) * 703
            } else {
                // BMI = kg / m^2 (convert cm to m)
                weight / ((height / 100) * (height / 100))
            }
            val category = when {
                bmi < 18.5 -> "Underweight"
                bmi < 25 -> "Normal weight"
                bmi < 30 -> "Overweight"
                else -> "Obese"
            }

            val resultText = "Your BMI: $bmi\nCategory: $category"
            binding.bmiResultTv.text = resultText




            Snackbar.make(
                binding.root,
                "Reset Everything",
                BaseTransientBottomBar.LENGTH_INDEFINITE
            )
                .setAction("Reset") {
                    binding.weightEt.text?.clear()
                    binding.heightEt.text?.clear()
                    binding.bmiResultTv.text = ""
                    binding.usaSwitch.isChecked = false
                    binding.weightEtLayout.hint = "Enter weight (kg)"
                    binding.heightEtLayout.hint = "Enter height (cm)"
                }
                .show()



        }

    }



}



