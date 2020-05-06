package com.abdalwahab.androidanimation

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var animation = imageView.background as AnimationDrawable?
        animation?.setEnterFadeDuration(3000)
        animation?.setExitFadeDuration(1000)
        animation?.start()

        var layoutAniamtion = overlay_layout.background as AnimationDrawable
        layoutAniamtion.setExitFadeDuration(3000)
        layoutAniamtion.setExitFadeDuration(1000)
        layoutAniamtion.start()
    }
}
