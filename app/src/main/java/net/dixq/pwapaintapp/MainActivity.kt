package net.dixq.pwapaintapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn).setOnClickListener {
            val intent = Intent(this, com.google.androidbrowserhelper.trusted.LauncherActivity::class.java)
            intent.data = Uri.parse("https://dixq.net/pwa/capture");
            startActivity(intent)
        }
    }
}