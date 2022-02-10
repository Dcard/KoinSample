package com.dcard.koinsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.dcard.feature.AtmActivity

class MainActivity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        startActivity(
            Intent(this, AtmActivity::class.java)
        )
    }

    override fun onStop() {
        super.onStop()
        finish()
    }
}