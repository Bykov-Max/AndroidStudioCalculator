package com.example.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button = binding.buttonPlus
        button.setOnClickListener{
            var num1: Int = binding.editTextNumber1.text.toString().toInt();
            var num2: Int = binding.editTextNumber2.text.toString().toInt();
            binding.textResult.text = (num1+num2).toString();
        }

        val button2 = binding.buttonMinus
        button2.setOnClickListener{
            var number1: Int = binding.editTextNumber1.text.toString().toInt();
            var number2: Int = binding.editTextNumber2.text.toString().toInt();
            binding.textResult.text = (number1-number2).toString()
        }

        val button3 = binding.buttonDel
        button3.setOnClickListener{
            var number1: Int = binding.editTextNumber1.text.toString().toInt();
            var number2: Int = binding.editTextNumber2.text.toString().toInt();
            binding.textResult.text = (number1/number2).toString()
        }

        val button4 = binding.buttonUmn
        button4.setOnClickListener{
            var number1: Int = binding.editTextNumber1.text.toString().toInt();
            var number2: Int = binding.editTextNumber2.text.toString().toInt();
            binding.textResult.text = (number1*number2).toString()
        }
    }
}