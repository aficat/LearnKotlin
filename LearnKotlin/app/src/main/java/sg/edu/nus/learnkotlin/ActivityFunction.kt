package sg.edu.nus.learnkotlin

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.widget.Button
import android.widget.TextView

class ActivityFunction : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function)

        val intro = findViewById<TextView>(R.id.intro)
        intro.setTextColor(Color.BLACK)
        val line1 = SpannableStringBuilder("Function is a group of inter related block of code " +
                "which performs a specific task. Function is used to break a program into different sub module. " +
                "It makes reusability of code and makes program more manageable.\n\n")

        line1.setSpan(ForegroundColorSpan(Color.RED), 0, 8, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val line2 = SpannableStringBuilder("In Kotlin, functions are declared using fun keyword. There are two " +
                "types of functions depending on whether it is available in standard library or defined by user.\n\n")
        line2.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 40, 43, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line2.setSpan(StyleSpan(Typeface.BOLD), 40, 43, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        line1.append(line2)

        val lib = "\u2022" + " Standard Library\n" + "\u2022" + " User-defined Library"
        line1.append(lib)

        intro.setText(line1)

        val next = findViewById<Button>(R.id.btnStdLib)
        next.setOnClickListener {
            val nextPage = Intent(this, ActivityStandardLibrary::class.java)
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
