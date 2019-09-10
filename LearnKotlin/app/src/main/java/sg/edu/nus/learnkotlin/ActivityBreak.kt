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

class ActivityBreak : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_break)

        val breakQuiz = findViewById<Button>(R.id.break_quiz)
        breakQuiz.setOnClickListener {
            val myIntent = Intent(this, ActivityBreakQuiz::class.java)
            startActivity(myIntent)
        }

        val description1 = findViewById<TextView>(R.id.description1)
        val spannable1 = SpannableStringBuilder(
            "The break statement ends the execution of the loop.\n"
        )
        // bold red break
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 4, 9, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 4, 9, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        val code1 = SpannableStringBuilder(
            "var x = 5\n"
                    + "do {\n"
                    + "   println(x);\n"
                    + "   x--;\n"
                    + "   if (x==3)\n"
                    + "   break;\n"
                    + "} while (x > 0);\n"
        )

        // color red 5
        code1.setSpan(ForegroundColorSpan(Color.RED), 8, 9, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.RED), 48, 49, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.RED), 74, 75, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color dark blue and bold do, if and while, break
        code1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 10, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 10, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 30, 32, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 30, 32, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 40, 43, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 40, 43, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 63, 68, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 63,  68, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        code1.setSpan(ForegroundColorSpan(Color.BLACK), 54, 59, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 54, 59, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example1.text = code1

        val example2 = findViewById<TextView>(R.id.code_example2)
        val code2 = SpannableStringBuilder(
            "Output:\n"
                    + "5\n"
                    + "4\n\n"
                    + "And then exits the loop.\n"
        )

        example2.text = code2

        val description2 = findViewById<TextView>(R.id.description2)
        val spannable2 =
            SpannableStringBuilder("In case you want to remain in the loop, but skip an iteration, use the continue statement:\n")

        // bold red
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 71, 79, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 71, 79, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description2.text = spannable2

        val example3 = findViewById<TextView>(R.id.code_example3)
        val code3 = SpannableStringBuilder(
            "var x = 0;\n"
                    + "while (x < 5) {\n"
                    + "   x++;\n"
                    + "   if (x==3)\n"
                    + "   continue;\n"
                    + "   println(x);\n"
                    + "}\n"
        )

        // color red
        code1.setSpan(ForegroundColorSpan(Color.RED), 8, 9, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.RED), 22, 23, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.RED), 37, 38, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color dark blue and bold
        code1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 11, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 11, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 30, 32, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 30, 32, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 39, 47, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 39, 47, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example3.text = code3

        val example4 = findViewById<TextView>(R.id.code_example4)
        val code4 = SpannableStringBuilder(
            "Output:\n"
                    + "1\n"
                    + "2\n"
                    + "4\n"
                    + "5\n\n"
                    + "The value 3 is skipped.\n"
        )
        example4.text = code4

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView_Bar)
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(0)
        menuItem.isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> {
                    val intent1 = Intent(this@ActivityBreak, ActivityHome::class.java)
                    startActivity(intent1)
                }
                R.id.ic_video -> {
                    val intent2 = Intent(this@ActivityBreak, ActivityVideosPage::class.java)
                    startActivity(intent2)
                }
                R.id.ic_onlineCode -> {
                    val intent3 = Intent(this@ActivityBreak, ActivityNotes::class.java)
                    startActivity(intent3)
                }
                R.id.ic_game -> {
                    val intent4 = Intent(this@ActivityBreak, ActivityGame::class.java)
                    startActivity(intent4)
                }
                R.id.ic_disclaimer-> {
                    val intent5 = Intent(this@ActivityBreak, ActivityDisclaimer::class.java)
                    startActivity(intent5)
                }
            }
            false
        }
    }
}
