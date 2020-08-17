package com.kakao.lifecycle_20200817

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

//STEP2:MainActivity-BaseActivity,setupEvents,setValues
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()

        Log.d("메인화면","onCreate 실행됨")
    }

    override fun setupEvents() {

        otherActivityBtn.setOnClickListener {
            val myIntent = Intent(mContext, OtherActivity::class.java)
            startActivity(myIntent)
        }
    }

    override fun setValues() {
    }
}