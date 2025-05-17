package com.aok.a13_workmanagerkullanimi

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.aok.a13_workmanagerkullanimi.databinding.ActivityMainBinding
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonYap.setOnClickListener {

           /*
            val calismaKosulu = Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build()

            // iste yapılıyor
            val req = OneTimeWorkRequestBuilder<MyWorker>()
                .setInitialDelay(3, TimeUnit.SECONDS)
                .setConstraints(calismaKosulu)
                .build()
            WorkManager.getInstance(this).enqueue(req)  // istek çalıştırıldı
            WorkManager.getInstance(this).getWorkInfoByIdLiveData(req.id)
                .observe (this){
                    val durum = it.state.name
                    Log.e("Arkaplan Durum", durum)
                }
             */

            val req2 = PeriodicWorkRequestBuilder<MyWorkerBildirim>(15, TimeUnit.MINUTES)
                .setInitialDelay(10, TimeUnit.SECONDS)
                .build()

            WorkManager.getInstance(this).enqueue(req2)
        }

    }
}