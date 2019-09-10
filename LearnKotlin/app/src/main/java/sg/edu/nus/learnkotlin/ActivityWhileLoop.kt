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

class ActivityWhileLoop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_while_loop)

        val whileLoopQuiz = findViewById<Button>(R.id.whileloop_quiz)
        whileLoopQuiz.setOnClickListener {
            val myIntent = Intent(this, ActivityWhileLoopQuiz::class.java)
            startActivity(myIntent)
        }

        val description1 = findViewById<TextView>(R.id.description1)
        val spannable1 = SpannableStringBuilder(
            "A loop is a block of code that will repeatedly run until a certain condition is true.\n"
                    + "The while statement executes statements repeatedly while an expression is true.\n" +
                    "It takes the form:\n"
        )
        // bold red var and val
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 2, 6, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 2, 6, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 89, 95, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 89, 95, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        val code1 = SpannableStringBuilder(
            "while(condition){\n"
                    + "   statement(s)\n"
                    + "}\n"
        )

        // color dark blue and bold do, if and while, break
        code1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 5, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 0, 5, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example1.text = code1

        val description2 = findViewById<TextView>(R.id.description2)
        val spannable2 =
            SpannableStringBuilder("The statements within the curly brackets will repeatedly execute until the given condition is satisfied.\n")

        description2.text = spannable2

        val example2 = findViewById<TextView>(R.id.code_example2)
        val code2 = SpannableStringBuilder(
            "var x = 0;\n"
                    + "while(x <= 5) {\n"
                    + "   println(x);\n"
                    + "   x++;\n"
                    + "}\n"
        )

        // color red
        code2.setSpan(ForegroundColorSpan(Color.RED), 8, 9, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(ForegroundColorSpan(Color.RED), 22, 23, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
// color dark blue and bold do, if and while, break
        code1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 11, 15, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 11, 15, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example2.text = code2

        val description3 = findViewById<TextView>(R.id.description3)
        val spannable3 =
            SpannableStringBuilder("It is important to ensure that the condition eventually evaluates to false. Otherwise we will encounter an infinite loop.\n")

        // bold red var and mutable
        spannable3.setSpan(ForegroundColorSpan(Color.RED), 107, 120, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(StyleSpan(Typeface.BOLD), 107, 120, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description3.text = spannable3

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
