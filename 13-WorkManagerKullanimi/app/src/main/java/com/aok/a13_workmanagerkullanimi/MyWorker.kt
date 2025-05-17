package com.aok.a13_workmanagerkullanimi

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(context: Context, workerParameters: WorkerParameters) : Worker(context, workerParameters) {
    override fun doWork(): Result {
        val toplam = 10 + 20
        Log.e("Arkaplan İşlemi", toplam.toString())
        return Result.success()
    }
}