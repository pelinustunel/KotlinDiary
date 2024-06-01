package com.pelinustunel.calculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.pelinustunel.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

        fun plusNumber(view: View) {
            val number1 = binding.editTextText.text.toString().toDoubleOrNull()
            val number2 = binding.editTextText2.text.toString().toDoubleOrNull()

            if(number1 != null && number2 != null)
            {
                val result = number1 + number2
                binding.textView.text = "Result ${result}"
            } else {
                binding.textView.text = "Enter Number"
            }

        }



        fun minusNumber(view: View) {
            val number1 = binding.editTextText.text.toString().toDoubleOrNull()
            val number2 = binding.editTextText2.text.toString().toDoubleOrNull()

            if(number1 != null && number2 != null)
            {
                val result = number1 - number2
                binding.textView.text = "Result ${result}"
            } else {
                binding.textView.text = "Enter Number"
            }

        }

        fun multiNumber(view: View){
            val number1 = binding.editTextText.text.toString().toDoubleOrNull()
            val number2 = binding.editTextText2.text.toString().toDoubleOrNull()

            if(number1 != null && number2 != null)
            {
                val result = number1 * number2
                binding.textView.text = "Result ${result}"
            } else {
                binding.textView.text = "Enter Number"
            }

        }

        fun divisionNumber(view: View){
            val number1 = binding.editTextText.text.toString().toDoubleOrNull()
            val number2 = binding.editTextText2.text.toString().toDoubleOrNull()

            if(number1 != null && number2 != null)
            {
                val result = number1 / number2
                binding.textView.text = "Result ${result}"
            } else {
                binding.textView.text = "Enter Number"
            }

        }


    }

