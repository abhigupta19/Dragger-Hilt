package com.example.dragger_hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import dagger.hilt.android.AndroidEntryPoint
import java.util.EnumSet.of

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val vm:Vm= ViewModelProvider(this).get(Vm::class.java);
     vm.response.observe(this, Observer { re ->

        Log.d("test3",re[0].title.toString())
      })




    }
}