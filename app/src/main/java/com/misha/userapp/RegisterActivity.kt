package com.misha.userapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun regclick(view: View) {
        var getname=findViewById<EditText>(R.id.nam);
        var getplace=findViewById<EditText>(R.id.pla);
        var getphone=findViewById<EditText>(R.id.ph);
        var getemail=findViewById<EditText>(R.id.email);
        var getpass=findViewById<EditText>(R.id.pas);
        var getconfirm=findViewById<EditText>(R.id.con);
        Toast.makeText(this,getname.text.toString() + " " + getplace.text.toString() + " " + getphone.text.toString() + " " + getemail.text.toString() + " " + getpass.text.toString() + " " + getconfirm.text.toString(),Toast.LENGTH_LONG).show();
    }

    fun logclick(view: View) {

        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);

    }
}