package com.thedeveloperworldisyours.simplekoin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    // Lazy injected MainPresenter
    val firstPresenter: MainPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        get_bn.setOnClickListener {
            hello_tv.text = firstPresenter.sayHello()
        }
    }

}
