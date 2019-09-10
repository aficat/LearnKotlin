package sg.edu.nus.learnkotlin

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView

class ActivityHome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val sub1 = findViewById<CardView>(R.id.sub1)
        sub1.setOnClickListener {
            val myIntent = Intent(this, ActivityIntroToKotlin::class.java)
            startActivity(myIntent)
        }

        val sub2 = findViewById<CardView>(R.id.sub2)
        sub2.setOnClickListener {
            val myIntent = Intent(this, ActivityMathAndLogic::class.java)
            startActivity(myIntent)
        }

        val sub3 = findViewById<CardView>(R.id.sub3)
        sub3.setOnClickListener {
            val myIntent = Intent(this, ActivityControlFlow::class.java)
            startActivity(myIntent)
        }
        val sub4 = findViewById<CardView>(R.id.sub4)
        sub4.setOnClickListener {
            val myIntent = Intent(this, ActivityFunction::class.java)
            startActivity(myIntent)
        }

        val sub5 = findViewById<CardView>(R.id.sub5)
        sub5.setOnClickListener {
            val myIntent = Intent(this, ActivityString::class.java)
            startActivity(myIntent)
        }

        val sub6 = findViewById<CardView>(R.id.sub6)
        sub6.setOnClickListener {
            val myIntent = Intent(this, ActivityArray::class.java)
            startActivity(myIntent)
        }

        val sub7 = findViewById<CardView>(R.id.sub7)
        sub7.setOnClickListener {
            val myIntent = Intent(this, ActivityNullSafety::class.java)
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
                    val intent1 = Intent(this@ActivityHome, ActivityHome::class.java)
                    startActivity(intent1)
                }
                R.id.ic_video -> {
                    val intent2 = Intent(this@ActivityHome, ActivityVideosPage::class.java)
                    startActivity(intent2)
                }
                R.id.ic_onlineCode -> {
                    val intent3 = Intent(this@ActivityHome, ActivityNotes::class.java)
                    startActivity(intent3)
                }
                R.id.ic_game -> {
                    val intent4 = Intent(this@ActivityHome, ActivityGame::class.java)
                    startActivity(intent4)
                }
                R.id.ic_disclaimer-> {
                    val intent5 = Intent(this@ActivityHome, ActivityDisclaimer::class.java)
                    startActivity(intent5)
                }
            }
            false
        }
    }
}
