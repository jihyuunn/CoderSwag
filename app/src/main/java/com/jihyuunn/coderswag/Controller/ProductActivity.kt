package com.jihyuunn.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jihyuunn.coderswag.R
import com.jihyuunn.coderswag.Utility.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        intent.getStringExtra(EXTRA_CATEGORY)

        
    }

}
