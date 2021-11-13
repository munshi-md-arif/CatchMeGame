package com.example.catchmegame

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Play : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)
    }

    fun play(view: View){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Play")
        alert.setMessage("Are you want to play?")

        alert.setPositiveButton("yes"){DialogInterface,Int->
            Toast.makeText(applicationContext,"launching Game",
                Toast.LENGTH_LONG).show()}

        alert.setNegativeButton("No"){DialogInterface,Int->
            Toast.makeText(applicationContext,"Quiting....",
                Toast.LENGTH_LONG).show()}
        alert.show()

        intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)

        //intent = Intent(com.example.catchmegame)
    }

    fun quit(view: View){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("quite")
        alert.setMessage("Are you want to quite?")

        alert.setPositiveButton("yes",){
            DialogInterface,Int->Toast.makeText(this,"redirecting to dashboard",Toast.LENGTH_LONG).show()
                }
        alert.setNegativeButton("no"){
            DialogInterface,Int->Toast.makeText(this,"enjoy your game",Toast.LENGTH_LONG).show()
        }
        finish()
        alert.show()
    }

}