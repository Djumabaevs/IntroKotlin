package com.example.introkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.introkotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    /*    var timesClicked = 0
        button.setOnClickListener {
            timesClicked += 1
            text_id.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Hello dude!!!!", Toast.LENGTH_LONG).show();
        }*/

        var timesClicked = 0
        binding.button.setOnClickListener {
            timesClicked += 1
            binding.textId.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Hello dude!!!!", Toast.LENGTH_LONG).show()
        }

    }
}