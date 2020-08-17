package com.kakao.lifecycle_20200817

import androidx.appcompat.app.AppCompatActivity

//STEP1:BaseActivity만들기
abstract class BaseActivity : AppCompatActivity() {
    val mContext = this
    abstract fun setupEvents()
    abstract fun setValues()
}