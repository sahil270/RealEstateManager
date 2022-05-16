package com.team3.realestatemanager.activities

import android.os.Bundle
import com.team3.realestatemanager.R
import kotlinx.android.synthetic.main.activity_add_places.*

class AddPlacesActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_places)

        setupActionBar()

    }

    fun placeAddedSuccessfully() {
       // TODO("Not yet implemented")
    }

    private fun setupActionBar() {

        setSupportActionBar(toolbar_add_place)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)
            actionBar.title = resources.getString(R.string.add_place)
        }

        toolbar_add_place.setNavigationOnClickListener { onBackPressed() }
    }

}