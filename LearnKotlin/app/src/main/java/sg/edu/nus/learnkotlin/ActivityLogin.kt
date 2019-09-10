package sg.edu.nus.learnkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class ActivityLogin : AppCompatActivity() {
    lateinit var peopleDBHelper: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btn_Login)
        btnLogin.setOnClickListener {
            login()
        }

        val buttonRegister = findViewById<TextView>(R.id.goToRegister)
        buttonRegister.setOnClickListener {
            val myIntent = Intent(this, ActivityRegister::class.java)
            startActivity(myIntent)
        }

        peopleDBHelper = DBHelper(this)
    }

    fun login() {
        var users = peopleDBHelper.readAllUsers()

        var username = this.et_username.text.toString()
        var password = this.et_password.text.toString()

        users.forEach {
            if (it.username.toString() == username) {
                if (it.password.toString() == password) {
                    //login successful

                    val myIntent = Intent(this, ActivityHome::class.java)
                    startActivity(myIntent)
                } else {
                    // wrong password
                    Toast.makeText(this, "Wrong username or password", Toast.LENGTH_LONG).show()
                }
            } else {
                // no user exists
                //Toast.makeText(this, "Wrong username or password", Toast.LENGTH_LONG).show()
            }

        }
    }

}
