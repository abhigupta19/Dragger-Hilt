package com.example.dragger_hilt

import android.util.Log
import android.view.Display
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.flow.catch


class Vm @ViewModelInject constructor( private  val repo: Repo) : ViewModel() {
    val response:LiveData<List<Model>> = repo.getPost().catch { t->
        Log.d("test3",t.toString())
     }.asLiveData();

}