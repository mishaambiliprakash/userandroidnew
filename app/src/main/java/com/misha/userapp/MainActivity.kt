package com.misha.userapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mybtnclick(view: View) {
        var getemail=findViewById<EditText>(R.id.email);
        var getpass=findViewById<EditText>(R.id.pass);
        Toast.makeText(this,getemail.text.toString() + " " + getpass.text.toString(),Toast.LENGTH_LONG).show();

    }

    fun mybtn2click(view: View) {
        intent= Intent(this,RegisterActivity::class.java);
        startActivity(intent);
    }
}