package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class ShowToast {
    fun showMessage(context:Context,msg:String){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

}