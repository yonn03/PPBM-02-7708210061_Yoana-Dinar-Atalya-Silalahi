package com.example.assesment2_yoana_listview

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_view)
        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )
        val namanama = arrayOf<String>(
            "Yoana",
            "Bryan",
            "Ghiyas",
            "Bagas",
            "Sarah",
            "Luci",
            "Maol",
            "Purba",
            "Bella",
            "Punjoy"
        )
        val desc = arrayOf<String>(
            "Saya Sendiri",
            "Gay",
            "Ustad",
            "Preman",
            "Besti 1",
            "Besti 2",
            "Begitulah",
            "Pro player",
            "Besti 3",
            "Besti 4"
        )
        val fotofoto = arrayOf<Int>(
            R.drawable.sepuluh,
            R.drawable.dua,
            R.drawable.tiga,
            R.drawable.empat,
            R.drawable.lima,
            R.drawable.enam,
            R.drawable.tujuh,
            R.drawable.delapan,
            R.drawable.sembilan,
            R.drawable.satu
        )
        val fotofoto1 = arrayOf<Int>(
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp
        )
        val noTelp = arrayOf<String>(
            "+62 360069140",
            "+62 381523887",
            "+62 173046112",
            "+62 950048236",
            "+62 882254396",
            "+62 935607516",
            "+62 997180652",
            "+62 866103657",
            "+62 800666352",
            "+62 340188013"
        )
        val none1 = arrayOf<String>(
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        )
        val Deskripsi = arrayOf<String>(
            "Name : Yoana \nNo Telp : +62 360069140 \nKota : Bandung \nStatus : Single",
            "Name : Bryan \nNo Telp : +62 381523887 \nKota : Bandung \nStatus : ?",
            "Name : Ghiyas \nNo Telp : +62 173046112 \nKota : Bandung \nStatus : ?",
            "Name : Bagas \nNo Telp : +62 950048236 \nKota : Bandung \nStatus : ?",
            "Name : Sarah \nNo Telp : +62 882254396 \nKota : Bandung \nStatus : ?",
            "Name : Luci \nNo Telp : +62 935607516 \nKota : Bandung \nStatus : ?",
            "Name : Maol \nNo Telp : +62 997180652 \nKota : Bandung \nStatus : Single",
            "Name : Purba \nNo Telp : +62 866103657 \nKota : Bandung \nStatus : ?",
            "Name : Bella \nNo Telp : +62 800666352 \nKota : Bandung \nStatus : ?",
            "Name : Punjoy \nNo Telp : +62 340188013 \nKota : Bandung \nStatus : Single"
        )
        val list1 = findViewById<ListView>(R.id.listview1)
        list1.adapter = Adapter(this, noTelp, fotofoto1 , none1 )
        list1.setOnItemClickListener { adapterView, view, position, id ->
        }
        val list = findViewById<ListView>(R.id.listview)
        list.adapter = Adapter(this, namanama, fotofoto, desc)
        list.setOnItemClickListener { adapterView, view, position, id ->
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("nama", namanama[position])
            intent.putExtra("desc", desc[position])
            intent.putExtra("foto", fotofoto[position])
            intent.putExtra("notelp", noTelp[position])
            intent.putExtra("deskripsi", Deskripsi[position])
            startActivity(intent)
        }
    }
}