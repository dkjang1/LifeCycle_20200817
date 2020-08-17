package com.kakao.lifecycle_20200817

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

//        2.5초 로딩화면
        val myHandler = Handler(Looper.getMainLooper())
        myHandler.postDelayed({
//            일정시간이 지난후 실행
//        Splash 화면 => 메인화면
            val myIntent = Intent(mContext, MainActivity::class.java)
            startActivity(myIntent)

//        메인화면으로 이동
            finish()
        }, 2500)

    }
}