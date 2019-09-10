package sg.edu.nus.learnkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.btn_LoginPage)
        btnLogin.setOnClickListener{
            val myIntent = Intent(this, ActivityLogin::class.java)
            startActivity(myIntent)
        }

        val btnRegister = findViewById<Button>(R.id.btn_RegisterPage)
        btnRegister.setOnClickListener{
            val myIntent = Intent(this, ActivityRegister::class.java)
            startActivity(myIntent)
        }

        /*val btnHome = findViewById<Button>(R.id.btn_Home)
        btnHome.setOnClickListener{
            val myIntent = Intent(this, ActivityHome::class.java)
            startActivity(myIntent)
        }*/
    }
}
