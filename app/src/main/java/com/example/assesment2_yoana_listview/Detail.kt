package com.example.assesment2_yoana_listview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import de.hdodenhof.circleimageview.CircleImageView

class Detail  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_view)
        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )
        val backBtn = findViewById<Button>(R.id.back)
        backBtn.setOnClickListener {
            val intent = Intent(this, Main::class.java)
            startActivity(intent)
            finish()
        }
        val nama = intent.getStringExtra("nama")
        val desc = intent.getStringExtra("desc")
        val notelp = intent.getStringExtra("notelp")
        val deskripsi = intent.getStringExtra("deskripsi")
        val fotoResId = intent.getIntExtra("foto", 0)
        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val descTextView = findViewById<TextView>(R.id.descTextView)
        val notelpTextView = findViewById<TextView>(R.id.noTelpView)
        val deskripsiTextView = findViewById<TextView>(R.id.deskripsiView)
        val fotoImageView = findViewById<CircleImageView>(R.id.preview)
        namaTextView.text = nama
        descTextView.text = desc
        notelpTextView.text = notelp
        deskripsiTextView.text = deskripsi
        fotoImageView.setImageResource(fotoResId)
    }
}