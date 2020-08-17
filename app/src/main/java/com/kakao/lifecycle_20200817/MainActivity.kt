package com.kakao.lifecycle_20200817

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//STEP2:MainActivity-BaseActivity,setupEvents,setValues
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }
}