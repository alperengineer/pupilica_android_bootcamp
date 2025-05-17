package com.aok.odev6

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.aok.odev6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val BASE_WHITE = ContextCompat.getColor(this@MainActivity, R.color.base_white)
        val BASE_YELLOW = ContextCompat.getColor(this@MainActivity, R.color.base_yellow)

        val titleText = SpannableString("getiryemek")
        titleText.setSpan(ForegroundColorSpan(BASE_YELLOW), 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        titleText.setSpan(ForegroundColorSpan(BASE_WHITE), 5, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.toolbarTitle.text = titleText

        // Bottom Navigation kurulumu
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_main_activity) as NavHostFragment
        NavigationUI.setupWithNavController(binding.bottomNavBar, navHostFragment.navController)
    }
}