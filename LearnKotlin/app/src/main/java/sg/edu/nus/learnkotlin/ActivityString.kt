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

class ActivityString : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_string)

        val stringQuiz = findViewById<Button>(R.id.string_quiz)
        stringQuiz.setOnClickListener {
            val myIntent = Intent(this, ActivityStringQuiz::class.java)
            startActivity(myIntent)
        }

        val description1 = findViewById<TextView>(R.id.description1)
        val spannable1 = SpannableStringBuilder(
            "The String class represents an array of char types. Strings are immutable which means the length and elements cannot be changed after their creation.\n\n"
                    + "Characters are represented by the type Char.\n"
        )

        // bold red var
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 4, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 4, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 190, 194, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 190, 194, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        val code1 = SpannableStringBuilder(
            "val ch = charArrayOf('h', 'e', 'l', 'l', 'o')\n"
                    + "val st = String(ch)\n"
        )

        // black bold
        code1.setSpan(ForegroundColorSpan(Color.BLACK), 9, 20, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 9, 20, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // blue char
        code1.setSpan(ForegroundColorSpan(Color.BLUE),  21, 23, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.BLUE),  26, 28, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.BLUE),  31, 33, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.BLUE),  36, 38, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.BLUE),  41, 43, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example1.text = code1

        val description2 = findViewById<TextView>(R.id.description2)
        val spannable2 =
            SpannableStringBuilder("A collection of characters is represented by a String.\n\n"
                    + "A String can be simply declared within double quote (\" \") known as escaped string or triple quote(\"\"\" \"\"\") known as raw string.\n")

        // bold red
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 47, 53, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 47, 53, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 123, 130, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 123, 130, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 172, 175, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 172, 175, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description2.text = spannable2

        val example2 = findViewById<TextView>(R.id.code_example2)
        val code2 = SpannableStringBuilder(
            "val str1 = \"Hello\"  \n"
                    + "val str2 = \"\"\"Welcome\"\"\"  \n"
        )

        // color  BLUE
        code2.setSpan(ForegroundColorSpan(Color.BLUE), 12, 18, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(ForegroundColorSpan(Color.BLUE), 32, 45, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        example2.text = code2

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
