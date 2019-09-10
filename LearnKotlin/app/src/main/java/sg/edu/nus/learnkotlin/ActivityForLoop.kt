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

class ActivityForLoop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_loop)

        val forLoop = findViewById<Button>(R.id.forloop_quiz)
        forLoop.setOnClickListener {
            val myIntent = Intent(this, ActivityForLoopQuiz::class.java)
            startActivity(myIntent)
        }

        val description1 = findViewById<TextView>(R.id.description1)
        description1.setTextColor(Color.BLACK)
        val spannable1 = SpannableStringBuilder(
            "The for loop iterates through a collection, more specifically through anything that provides an iterator.\n\n"
                    + "Let’s print the list of values in a range.\n"
        )
        // bold red var
        spannable1.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 4, 8, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 4, 8, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        example1.setTextColor(Color.BLACK)
        val code1 = SpannableStringBuilder(
            "var myRange = 1..10;\n"
                    + "for (x in myRange) {\n"
                    + "   println(x);\n"
                    + "}\n"
        )

        // color red 10
        code1.setSpan(ForegroundColorSpan(Color.RED), 14, 19, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        example1.text = code1

        val description2 = findViewById<TextView>(R.id.description2)
        description2.setTextColor(Color.BLACK)
        val spannable2 =
            SpannableStringBuilder("The program will print numbers 1 through 10.\n"
                    + "During each step of the loop, the variable x will contain the value of the current element in the range.\n\n"
                    + "Let’s say we want to iterate over a range of even numbers.\n"
                    + "To do so we can define a range with a step:\n"
            )

        // bold red num
        spannable2.setSpan(ForegroundColorSpan(Color.BLACK), 87, 90, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 87, 90, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        spannable2.setSpan(ForegroundColorSpan(Color.BLACK), 248, 252, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 248, 252, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description2.text = spannable2

        val example2 = findViewById<TextView>(R.id.code_example2)
        example2.setTextColor(Color.BLACK)
        val code2 = SpannableStringBuilder(
            "var evenRange = 0..10 step2\n"
                    + "for (i in evenRange) {\n"
                    + "   println(i);\n"
                    + "}\n"
        )

        // color red 10 and 12
        code2.setSpan(ForegroundColorSpan(Color.RED), 16, 21, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(ForegroundColorSpan(Color.RED), 16, 21, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

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
