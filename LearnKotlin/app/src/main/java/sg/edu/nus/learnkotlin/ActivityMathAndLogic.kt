package sg.edu.nus.learnkotlin

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView

class ActivityMathAndLogic : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_and_logic)
        val arithmetic = findViewById<CardView>(R.id.sub2_1)
        arithmetic.setOnClickListener {
            val myIntent = Intent(this, ActivityArithmetic::class.java)
            startActivity(myIntent)
        }

        val relationOperatorPage = findViewById<CardView>(R.id.sub2_2)
        relationOperatorPage.setOnClickListener {
            val myIntent = Intent(this, ActivityRelation::class.java)
            startActivity(myIntent)
        }

        val assignment = findViewById<CardView>(R.id.sub2_3)
        assignment.setOnClickListener {
            val myIntent = Intent(this, ActivityAssignment::class.java)
            startActivity(myIntent)
        }

        val logical = findViewById<CardView>(R.id.sub2_4)
        logical.setOnClickListener {
            val myIntent = Intent(this, ActivityLogical::class.java)
            startActivity(myIntent)
        }

        val inputOutputPage = findViewById<CardView>(R.id.sub2_5)
        inputOutputPage.setOnClickListener {
            val myIntent = Intent(this, ActivityInputOutput::class.java)
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
