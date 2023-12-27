package com.example.assesment2_yoana_listview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter (private val context: Activity,
                   private val title: Array<String>,
                   private val imgid: Array<Int>,
                   private val desc: Array<String>)
    : ArrayAdapter<String>(context, R.layout.adapter_view, title) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.adapter_view, null, true)
        var _image = rowView.findViewById<ImageView>(R.id.icon)
        _image.setImageResource(imgid[position])
        var _name = rowView.findViewById<TextView>(R.id.title)
        _name.setText(title[position])
        var _desc = rowView.findViewById<TextView>(R.id.description)
        _desc.setText(desc[position])
        return rowView
    }
}