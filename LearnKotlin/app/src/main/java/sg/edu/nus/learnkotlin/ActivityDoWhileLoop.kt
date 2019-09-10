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

class ActivityDoWhileLoop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_do_while_loop)

        val doWhileLoopQuiz = findViewById<Button>(R.id.dowhileloop_quiz)
        doWhileLoopQuiz.setOnClickListener {
            val myIntent = Intent(this, ActivityDoWhileLoopQuiz::class.java)
            startActivity(myIntent)
        }

        val description1 = findViewById<TextView>(R.id.description1)
        val spannable1 = SpannableStringBuilder(
            "The do-while loop first executes the loop statements before evaluating the expression.\n" +
                    "This means that the statements in a do-while loop will always run at least once, even if the condition evaluates to false.\n"
        )
        // bold red var and val
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 4, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 4, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 122, 131, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 122, 131, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        val code1 = SpannableStringBuilder(
            "do {\n"
                    + "   statements\n"
                    + "} while (condition);\n"
        )


        // color dark blue and bold do, if and while, break
        code1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 0, 2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 21, 26, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 21, 26, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example1.text = code1

        val example2 = findViewById<TextView>(R.id.code_example2)
        val code2 = SpannableStringBuilder(
            "var x = 5;\n"
                    + "do {\n"
                    + "   println(x);\n"
                    + "   x--;\n"
                    + "} while (x > 0);\n"
        )

        // color red 10 and 12
        code2.setSpan(ForegroundColorSpan(Color.RED), 8, 9, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(ForegroundColorSpan(Color.RED), 52, 53, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        // color dark blue and bold do, if and while, break
        code2.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 10, 13, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(StyleSpan(Typeface.BOLD), 10, 13, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 41, 47, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(StyleSpan(Typeface.BOLD), 41, 47, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example2.text = code2

        val description2 = findViewById<TextView>(R.id.description2)
        val spannable2 =
            SpannableStringBuilder("Notice the semicolon at the end of the while condition.\n" +
                    "Set a false condition and see how the do-while loop executes the statement once.\n")

        // bold red num and str
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 61, 67, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 61, 67, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
spannable2.setSpan(ForegroundColorSpan(Color.RED), 93, 102, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 93, 102, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description2.text = spannable2

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
