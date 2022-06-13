package com.example.firtstactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.first_layout.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
//        val button1 : Button = findViewById(R.id.button1)
        button1.setOnClickListener{
//            Toast.makeText(this,"You clicked Button 1", Toast.LENGTH_SHORT).show()
        val intent = Intent(Intent.ACTION_VIEW)
//            intent.addCategory("com.example.activitytest.MY_CATEGORY")
            intent.data = Uri.parse("https://www.baidu.com")
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.add_item -> Toast.makeText(this,"you clicked Add",Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this,"you clicked Remove",Toast.LENGTH_SHORT).show()
        }
        return true;
    }
}