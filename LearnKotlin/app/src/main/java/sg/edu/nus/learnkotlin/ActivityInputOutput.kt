package sg.edu.nus.learnkotlin

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.text.SpannableStringBuilder
import android.widget.Button
import android.widget.TextView

class ActivityInputOutput : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_output)
        val intro = findViewById<TextView>(R.id.intro)
        val line1 = SpannableStringBuilder("Kotlin standard input output operations are performed " +
                "to flow byte stream from input device (keyboard) to main memory and from main memory " +
                "to output device (screen).\n\n")


        intro.setTextColor(Color.BLACK)

        intro.setText(line1)

        val next = findViewById<Button>(R.id.nextOutput)
        next.setOnClickListener{
            val nextPage = Intent(this, ActivityOutput::class.java)
            startActivity(nextPage)
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
