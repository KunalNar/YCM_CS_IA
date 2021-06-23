package com.example.ycmia2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page3.*

class page2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        orderBTN.setOnClickListener {
            val nextpageIntent = Intent(this, neworder::class.java)
            startActivity(nextpageIntent)

        }
        existingbtn.setOnClickListener {
            val nextpageIntent = Intent(this, ExistingOrders::class.java)
            startActivity(nextpageIntent)

        }

        databtn.setOnClickListener {
            val nextpageIntent = Intent(this, records::class.java)
            startActivity(nextpageIntent)

        }
    }
}
