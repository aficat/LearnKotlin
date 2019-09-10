package sg.edu.nus.learnkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class ActivityRegister : AppCompatActivity() {

    lateinit var peopleDBHelper: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister = findViewById<Button>(R.id.btn_signUp)
        btnRegister.setOnClickListener {
            register()
        }

        val buttonLogin = findViewById<Button>(R.id.goToLogin)
        buttonLogin.setOnClickListener {
            val myIntent = Intent(this, ActivityLogin::class.java)
            startActivity(myIntent)
        }

        peopleDBHelper = DBHelper(this)

    }

    fun register() {
        var username = this.et_username.text.toString()
        var password = this.et_password.text.toString()
        var name  = this.et_name.text.toString()

        peopleDBHelper.addUser(DataRecord(username, password, name))

        this.et_username.setText("")
        this.et_password.setText("")
        this.et_name.setText("")

        Toast.makeText(this, "User Registered Successfully", Toast.LENGTH_LONG).show()
        val myIntent = Intent(this, ActivityHome::class.java)
        startActivity(myIntent)

    }
}
