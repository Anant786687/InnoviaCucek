package com.andro.anant.innoviacucek

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    fun  load(v:View)
    {
        when(v.id)
        {
            R.id.previous_events-> print("Events to be Written here")
            R.id.next_events-> print("Events to be Written here")
            R.id.messages-> print("messages")
            R.id.complaint-> print("complaints")
            R.id.user-> print("user profile")
            R.id.contactus-> print("contact information")
        }

    }
}
