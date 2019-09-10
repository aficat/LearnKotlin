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

class ActivityWhen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when)

        val whenQuiz = findViewById<Button>(R.id.when_quiz)
        whenQuiz.setOnClickListener {
            val myIntent = Intent(this, ActivityWhenQuiz::class.java)
            startActivity(myIntent)
        }

        val description1 = findViewById<TextView>(R.id.description1)
        description1.setTextColor(Color.BLACK)
        val spannable1 = SpannableStringBuilder(
            "In Kotlin, the when statement is used to check for multiple conditions.\n\n"
                    + "The basic syntax of the when statement is as follows:\n"
        )
        // bold red var
        spannable1.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 15, 19, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 15, 19, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        example1.setTextColor(Color.BLACK)
        val code1 = SpannableStringBuilder(
            "when (variable) {\n"
                    + "   condition -> statement\n"
                    + "}\n"
        )


        val description2 = findViewById<TextView>(R.id.description2)
        description2.setTextColor(Color.BLACK)
        val spannable2 =
            SpannableStringBuilder("when is the equivalent to the switch statement in other languages.\n\n"
                    + "when matches its argument against all branches sequentially until some branch condition is satisfied.\n")

        // bold red num
        spannable2.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        //switch
        spannable2.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 30, 37, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 30, 37, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        //when_2
        spannable2.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 67, 72, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 67, 72, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description2.text = spannable2


        val example2 = findViewById<TextView>(R.id.code_example2)
        example2.setTextColor(Color.BLACK)
        val code2 = SpannableStringBuilder(
            "val num = 15;\n"
                    + "when (num) {\n"
                    + "   10 -> println(\"Case 1\")\n"
                    + "   15 -> println(\"Case 2\")\n"
                    + "   20 -> println(\"Case 3\")\n"
                    + "   else -> println(\"Default case\")\n"
                    + "}\n"
        )

        // color red 10 and 12
        code2.setSpan(ForegroundColorSpan(Color.RED), 10, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example2.text = code2

        val description3 = findViewById<TextView>(R.id.description3)
        description3.setTextColor(Color.BLACK)
        val spannable3 =
            SpannableStringBuilder("when can also be used as a replacement for an if-else if chain. If no argument is supplied, the branch conditions are simply boolean expressions:\n")

        // bold red var
        spannable3.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 0, 5, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(StyleSpan(Typeface.BOLD), 0, 5, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description3.text = spannable3

        val example3 = findViewById<TextView>(R.id.code_example3)
        example3.setTextColor(Color.BLACK)
        val code3 = SpannableStringBuilder(
            "var age: Int = readLine()!!.toInt();\n\n"
                    + "when (age){\n"
                    + "   age < 22 -> println(“Too young”);\n"
                    + "   age > 50 -> println (“Too old”);\n"
                    + "   else -> println(\"Welcome\")\n"
                    + "}\n"
        )

        // color red 10 and 21
        code3.setSpan(ForegroundColorSpan(Color.BLACK), 9, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(StyleSpan(Typeface.BOLD), 9, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example3.text = code3

        val description4 = findViewById<TextView>(R.id.description4)
        description4.setTextColor(Color.BLACK)
        val spannable4=
            SpannableStringBuilder("The last else case is evaluated if all of the previous cases before it evaluated to false.\n\n"
                    + "Multiple conditions can be tested in one case as long as they are all separated by commas.\n")

        // bold red type inference
        spannable4.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 9, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(StyleSpan(Typeface.BOLD), 9, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)


        spannable4.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 84, 90, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(StyleSpan(Typeface.BOLD), 84, 90, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description4.text = spannable4

        val example4 = findViewById<TextView>(R.id.code_example4)
        example4.setTextColor(Color.BLACK)
        val code4 = SpannableStringBuilder(
            "var x = 5;\n\n"
                    + "when (x){\n"
                    + "   1,3,5,7,9 -> println(“Odd”);\n"
                    + "   2,4,6,8 -> println (“Even”);\n"
                    + "   else -> println(\"Unknown\")\n"
                    + "}\n"
        )

        // bold black Int
        code4.setSpan(ForegroundColorSpan(Color.RED), 8, 9, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        example4.text = code4

        val example5 = findViewById<TextView>(R.id.code_example5)
        example5.setTextColor(Color.BLACK)
        val code5 = SpannableStringBuilder(
            "Output:\n"
                    + "Odd\n"
        )

        // bold black Int
        code5.setSpan(ForegroundColorSpan(Color.BLACK), 0, 6, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code5.setSpan(StyleSpan(Typeface.BOLD), 0, 6, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        example5.text = code5

        val description5 = findViewById<TextView>(R.id.description5)
        description5.setTextColor(Color.BLACK)
        val spannable5 =
            SpannableStringBuilder("when can be also be used as an expression. If it is used as an expression, the value of the satisfied branch becomes the value of the overall expression.\n")

        // bold red num, Int, str, String
        spannable5.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 0, 5, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable5.setSpan(StyleSpan(Typeface.BOLD), 0, 5, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description5.text = spannable5

        val example6 = findViewById<TextView>(R.id.code_example6)
        example6.setTextColor(Color.BLACK)
        val code6 = SpannableStringBuilder(
            "var grade = 88;\n\n"
                    + "var result = when {\n"
                    + "   grade < 50 -> “Failed”;\n"
                    + "   grade > 50 && grade < 80 -> “Good”;\n"
                    + "   grade > 80 -> “Awesome!”;\n"
                    + "   else -> “Unknown”;\n"
                    + "}\n"
                    + "println(result);\n"
        )

        // bold black Int
        code6.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        example6.text = code6

        val description6 = findViewById<TextView>(R.id.description6)
        description6.setTextColor(Color.BLACK)
        val spannable6 =
            SpannableStringBuilder("If when is used as an expression, the else branch is mandatory.\n")

        // bold red num, Int, str, String
        spannable6.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 3, 7, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable6.setSpan(StyleSpan(Typeface.BOLD), 3, 7, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)


        spannable6.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 38, 42, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable6.setSpan(StyleSpan(Typeface.BOLD), 38, 42, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description6.text = spannable6

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
