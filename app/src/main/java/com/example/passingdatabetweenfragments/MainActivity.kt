package com.example.passingdatabetweenfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), FirstFragment.OnFragmentInteraction {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }


    private fun init(){
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, FirstFragment()).commit()
    }

    override fun onButtonClicked(name: String) {
        var secondFragment = SecondFragment.newInstance(name)

        supportFragmentManager?.beginTransaction()?.add(R.id.fragment_container, secondFragment)?.commit()

    }

}