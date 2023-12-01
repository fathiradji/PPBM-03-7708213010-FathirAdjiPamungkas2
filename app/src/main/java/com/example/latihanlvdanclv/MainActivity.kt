package com.example.latihanlvdanclv


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.latihanlvdanclv.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var userArrayList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(

            R.drawable.maskoboy, R.drawable.alberto,R.drawable.beckham,R.drawable.ciro,R.drawable.david,R.drawable.dedi,
            R.drawable.henhen,R.drawable.levy,R.drawable.mark,R.drawable.nick,R.drawable.rezaldi,R.drawable.teja

        )

        val name = arrayOf(

            "Mas Koboy","Alberto","Beckham","Ciro","David","Dedi","Henhen","Levy","Mark","Nick"
            ,"Rezaldy","Teja"
        )

        val lastmessage = arrayOf(

            "Cihuuuyyyy","oke","halo bang","oke bang","real","relax","siap","waduh","sudahku skinsut kelakuanmu","apa coba","ada-ada saja"
            ,"walaw we"

        )

        val lastMsgTime = arrayOf(

            "3:00 AM","4:00 AM","5:00 AM","6:00 AM","7:00 AM","8:00 AM","9:00 AM","10:00 AM","11:00 AM","12:00 PM","13:00 PM","14:00 PM"
        )

        val phoneNo = arrayOf(

            "0895804720974","0895463460974","08235266364","08946264274472574","0892464757974","08373436436346","082467488697"
            ,"08435727488","084677575867","0835357573756","083673757757","08457489877908"
        )

        val country = arrayOf(

            "Indonesia","Indonesia","Indonesia","Indonesia","Indonesia","Indonesia","Indonesia","Indonesia","Indonesia","Indonesia"
            ,"Indonesia","Indonesia"
        )

        userArrayList = ArrayList()

        for( i in name.indices){

            val user = User(name[i],lastmessage[i],lastMsgTime[i],phoneNo[i],country[i],imageId[i])
            userArrayList.add(user)

        }

        binding.listView.isClickable = true
        binding.listView.adapter = MyAdapter(this, userArrayList)
        binding.listView.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val phone = phoneNo[position]
            val country = country[position]
            val imageId = imageId[position]

            val i = Intent(this, UserActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("phone",phone)
            i.putExtra("country",country)
            i.putExtra("imageId",imageId)
            startActivity(i)


        }

    }

}