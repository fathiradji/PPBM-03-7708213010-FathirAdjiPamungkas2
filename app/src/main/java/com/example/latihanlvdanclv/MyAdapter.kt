package com.example.latihanlvdanclv

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<User>) : ArrayAdapter<User>(context,
    R.layout.list_item,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item,null)

        val imageView : ImageView = view.findViewById(R.id.maskoboy)
        val username : TextView = view.findViewById(R.id.personName)
        val lastMsg : TextView = view.findViewById(R.id.lastmessage)
        val lastMsgTime : TextView = view.findViewById(R.id.lastmsgtime)

        imageView.setImageResource(arrayList[position].imageId)
        username.text = arrayList[position].name
        lastMsg.text = arrayList[position].lastmessage
        lastMsgTime.text = arrayList[position].lastMsgTime

        return view
    }
}