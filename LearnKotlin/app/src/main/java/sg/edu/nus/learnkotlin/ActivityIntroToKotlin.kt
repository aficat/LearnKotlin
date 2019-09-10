package sg.edu.nus.learnkotlin

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView

class ActivityIntroToKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_to_kotlin)


        val whatIsKotlin = findViewById<CardView>(R.id.sub1_1)
        whatIsKotlin.setOnClickListener {
            val myIntent = Intent(this, ActivityWhatIsKotlin::class.java)
            startActivity(myIntent)
        }

        val printHelloWorld = findViewById<CardView>(R.id.sub1_2)
        printHelloWorld.setOnClickListener {
            val myIntent = Intent(this, ActivityPrintHelloWorld::class.java)
            startActivity(myIntent)
        }

        val comment = findViewById<CardView>(R.id.sub1_3)
        comment.setOnClickListener {
            val myIntent = Intent(this, ActivityComment::class.java)
            startActivity(myIntent)
        }

        val variableDeclaration = findViewById<CardView>(R.id.sub1_4)
        variableDeclaration.setOnClickListener {
            val myIntent = Intent(this, ActivityVariableDeclaration::class.java)
            startActivity(myIntent)
        }

        val dataType = findViewById<CardView>(R.id.sub1_5)
        dataType.setOnClickListener {
            val myIntent = Intent(this, ActivityDataType::class.java)
            startActivity(myIntent)
        }

        val typeConversion = findViewById<CardView>(R.id.sub1_6)
        typeConversion.setOnClickListener {
            val myIntent = Intent(this, ActivityTypeConversion::class.java)
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
                    val intent1 = Intent(this@ActivityIntroToKotlin, ActivityHome::class.java)
                    startActivity(intent1)
                }
                R.id.ic_video -> {
                    val intent2 = Intent(this@ActivityIntroToKotlin, ActivityVideosPage::class.java)
                    startActivity(intent2)
                }
                R.id.ic_onlineCode -> {
                    val intent3 = Intent(this@ActivityIntroToKotlin, ActivityNotes::class.java)
                    startActivity(intent3)
                }
                R.id.ic_game -> {
                    val intent4 = Intent(this@ActivityIntroToKotlin, ActivityGame::class.java)
                    startActivity(intent4)
                }
                R.id.ic_disclaimer-> {
                    val intent5 = Intent(this@ActivityIntroToKotlin, ActivityDisclaimer::class.java)
                    startActivity(intent5)
                }
            }
            false
        }
    }

}
