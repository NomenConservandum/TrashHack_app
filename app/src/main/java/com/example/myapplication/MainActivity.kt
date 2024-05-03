package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {

    lateinit var textInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textInput = findViewById(R.id.input_text)
    }
    fun sendfunc(view: View?) {
        val fileOutputStream: FileOutputStream = openFileOutput("output_testfile.txt", Context.MODE_PRIVATE)
        fileOutputStream.write(textInput.text.toString().toByteArray())
        println(textInput.text)
    }
}
