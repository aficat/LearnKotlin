package sg.edu.nus.learnkotlin

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView

class ActivityControlFlow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control_flow)

        val ifElse = findViewById<CardView>(R.id.sub3_1)
        ifElse.setOnClickListener {
            val myIntent = Intent(this, ActivityIfElse::class.java)
            startActivity(myIntent)
        }

        val whenStatement = findViewById<CardView>(R.id.sub3_2)
        whenStatement.setOnClickListener {
            val myIntent = Intent(this, ActivityWhen::class.java)
            startActivity(myIntent)
        }

        val forLoop = findViewById<CardView>(R.id.sub3_3)
        forLoop.setOnClickListener {
            val myIntent = Intent(this, ActivityForLoop::class.java)
            startActivity(myIntent)
        }

        val whileLoop = findViewById<CardView>(R.id.sub3_4)
        whileLoop.setOnClickListener {
            val myIntent = Intent(this, ActivityWhileLoop::class.java)
            startActivity(myIntent)
        }

        val doWhileLoop = findViewById<CardView>(R.id.sub3_5)
        doWhileLoop.setOnClickListener {
            val myIntent = Intent(this, ActivityDoWhileLoop::class.java)
            startActivity(myIntent)
        }

        val breakContinue = findViewById<CardView>(R.id.sub3_6)
        breakContinue.setOnClickListener {
            val myIntent = Intent(this, ActivityBreak::class.java)
            startActivity(myIntent)
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView_Bar)
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(0)
        menuItem.isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> {
                    val intent1 = Intent(this, ActivityHome::class.java)
                    startActivity(intent1)
                }
                R.id.ic_video -> {
                    val intent2 = Intent(this, ActivityVideosPage::class.java)
                    startActivity(intent2)
                }
                R.id.ic_onlineCode -> {
                    val intent3 = Intent(this, ActivityNotes::class.java)
                    startActivity(intent3)
                }
                R.id.ic_game -> {
                    val intent4 = Intent(this, ActivityGame::class.java)
                    startActivity(intent4)
                }
                R.id.ic_disclaimer-> {
                    val intent5 = Intent(this, ActivityDisclaimer::class.java)
                    startActivity(intent5)
                }
            }
            false
        }
    }
}
