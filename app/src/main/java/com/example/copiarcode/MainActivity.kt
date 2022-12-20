package com.example.copiarcode

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.copiarcode.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    var resultado = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener() {
            resta()
            }
        binding.button2.setOnClickListener() {
            suma1()
            }
        binding.editTextTextPersonName.setOnClickListener(){
            var qlo = ColorStateList.valueOf(Color.parseColor("#9b9b9b"))
            binding.button.backgroundTintList = qlo
            binding.button2.backgroundTintList = qlo
        }
    }

    fun suma1 () {
        resultado +=binding.editTextTextPersonName.text.toString().toInt()
        binding.textView.text = resultado.toString()
    }
    fun resta(){

        if (0> resultado - binding.editTextTextPersonName.text.toString().toInt()){
            binding.textView.text = "0"
        }
        else{
            resultado -= binding.editTextTextPersonName.text.toString().toInt()
            binding.textView.text = resultado.toString()
        }
    }

}