package com.hocruxx.adi.adinugrohokel4

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button

class MainActivity : AppCompatActivity() {

    internal lateinit var myAnim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myAnim = AnimationUtils.loadAnimation(this, R.anim.grind)

        val email = findViewById(R.id.sendEmail) as Button
        email.setOnClickListener {
            email.startAnimation(myAnim)
            val i = Intent(applicationContext, EmailActivity::class.java)
            startActivity(i)
        }
        val kontak = findViewById(R.id.kontak) as Button
        kontak.setOnClickListener {
            kontak.startAnimation(myAnim)
            val i = Intent(applicationContext, KontakActivity::class.java)
            startActivity(i)
        }

        val about = findViewById(R.id.about) as Button
        about.setOnClickListener {
            about.startAnimation(myAnim)
            val i = Intent(applicationContext, AboutActivity::class.java)
            startActivity(i)
        }

        val user = findViewById(R.id.user) as Button
        user.setOnClickListener {
            user.startAnimation(myAnim)
            val i = Intent(applicationContext, UserListActivity::class.java)
            startActivity(i)
        }
}
}

