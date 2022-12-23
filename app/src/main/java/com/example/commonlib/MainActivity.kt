package com.example.commonlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.ShowToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val context = this
        val showToast = ShowToast()
        showToast.showMessage(context,"hahahahahah")
    }
}