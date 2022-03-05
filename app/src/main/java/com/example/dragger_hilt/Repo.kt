package com.example.dragger_hilt

import android.view.Display
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.util.concurrent.Flow
import javax.inject.Inject

class Repo @Inject constructor(val apiServiceImp: ApiServiceImp) {
    fun getPost(): kotlinx.coroutines.flow.Flow<List<Model>> =
          flow {
                val res=apiServiceImp.getData();
            emit(res);
        }.flowOn(Dispatchers.IO)
    }

