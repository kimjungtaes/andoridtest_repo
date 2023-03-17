package com.example.androidfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.example.androidfirst.databinding.*

class MainActivity2 : AppCompatActivity() {
    lateinit var binding1: ActivitySub4Binding
    lateinit var binding2: ActivitySub13Binding
    lateinit var binding3: ActivitySub15Binding
    lateinit var binding4: ActivitySub16Binding
    lateinit var binding5: ActivitySub21Binding


    var flag: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding1 = ActivitySub4Binding.inflate(layoutInflater)

        binding2 = ActivitySub13Binding.inflate(layoutInflater)
        binding3 = ActivitySub15Binding.inflate(layoutInflater)
        binding4 = ActivitySub16Binding.inflate(layoutInflater)
        binding5 = ActivitySub21Binding.inflate(layoutInflater)






        setContentView(binding5.root)

        binding5.chbVisible.isChecked = false
        binding5.chbVisible.text = "invisible"

        binding5.chbVisible.setOnClickListener {
            //암호를 보여줄것
            if (binding5.chbVisible.isChecked == true) {
                binding5.edpPassword2.inputType = InputType.TYPE_CLASS_TEXT
                binding5.chbVisible.text = "visible"

            } else {
                //암호를 보이지마라
                binding5.edpPassword2.inputType =
                    InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                binding5.chbVisible.text = "invisible"

            }

        }


        binding4.edtPassword.setOnClickListener {
            binding4.edtPassword.inputType = InputType.TYPE_TEXT_VARIATION_FILTER

            Toast.makeText(
                applicationContext, binding4.edtPassword.text.toString(),
                Toast.LENGTH_SHORT
            ).show()
        }

    }


}


