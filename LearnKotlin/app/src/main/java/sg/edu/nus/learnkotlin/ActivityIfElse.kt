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

class ActivityIfElse : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_if_else)

        val ifelseQuiz = findViewById<Button>(R.id.ifelse_quiz)
        ifelseQuiz.setOnClickListener {
            val myIntent = Intent(this, ActivityIfElseQuiz::class.java)
            startActivity(myIntent)
        }

        val description1 = findViewById<TextView>(R.id.description1)
        description1.setTextColor(Color.BLACK)
        val spannable1 = SpannableStringBuilder(
            "In Kotlin, \"if\" is an expression is which returns a value. It is used for control the flow of program structure. There are various types of if expression in Kotlin.\n"
                    + "•  if statement\n"
                    + "•  if-else expression\n"
                    + "•  if-else ladder expression\n\n")

        spannable1.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val spannable1_2 = SpannableStringBuilder("Syntax of traditional if statement:\n")
        spannable1.append(spannable1_2)
        description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        example1.setTextColor(Color.BLACK)
        val code1 = SpannableStringBuilder(
            "if (condition){ \n")
        code1.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 0, 3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 0, 3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)


        val code1_2 = SpannableStringBuilder("//code statement\n"
                + "}\n")
        code1_2.setSpan(ForegroundColorSpan(Color.rgb(30,105,30)), 0, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.append(code1_2)
        example1.text = code1

        val description2 = findViewById<TextView>(R.id.description2)
        description2.setTextColor(Color.BLACK)
        val spannable2 =
            SpannableStringBuilder("Syntax of traditional if else statement:\n")

        // bold red num
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 22, 29, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 22, 29, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description2.text = spannable2

        val example2 = findViewById<TextView>(R.id.code_example2)
        example2.setTextColor(Color.BLACK)
        val code2 = SpannableStringBuilder(
            "if (condition){ \n")
        code2.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 0, 3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(StyleSpan(Typeface.BOLD), 0, 3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val code2_2 = SpannableStringBuilder("//code statement\n")
        code2_2.setSpan(ForegroundColorSpan(Color.rgb(30,105,30)), 0, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.append(code2_2)

        val code2_3 = SpannableStringBuilder(
            "} else { \n")
        code2_3.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 1, 6, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2_3.setSpan(StyleSpan(Typeface.BOLD), 1, 6, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.append(code2_3)

        val code2_4 = SpannableStringBuilder("//code statement\n"
                + "}\n")
        code2_4.setSpan(ForegroundColorSpan(Color.rgb(30,105,30)), 0, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.append(code2_4)

        example2.text = code2

        val description3 = findViewById<TextView>(R.id.description3)
        description3.setTextColor(Color.BLACK)
        val spannable3 = SpannableStringBuilder("Let's see an example of if-else expression.\n")
        spannable3.setSpan(ForegroundColorSpan(Color.RED), 24, 31, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(StyleSpan(Typeface.BOLD), 24, 31, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description3.text = spannable3

        val example3 = findViewById<TextView>(R.id.code_example3)
        example3.setTextColor(Color.BLACK)
        val code3 = SpannableStringBuilder("fun main(args: Array<String>){\n"
                + "   val num1 = 10\n"
                + "   val num2 = 20\n"
                + "   val result = if (num1 > num2) {\n"
                + "      \"\$num1 is greater than \$num2\"\n"
                + "   } else {\n"
                + "      \"\$num1 is smaller than \$num2\"\n"
                + "   }\n"
                + "   println(result)\n"
                + "}")

        // color red 10 and 21
        code3.setSpan(ForegroundColorSpan(Color.RED), 45, 47, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(ForegroundColorSpan(Color.RED), 61, 64, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color dark blue and bold fun
        code3.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 80, 83, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(StyleSpan(Typeface.BOLD), 80, 83, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        //default blue
        code3.setSpan(ForegroundColorSpan(Color.BLUE), 107, 135, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(ForegroundColorSpan(Color.BLUE), 155, 182, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)


        example3.text = code3

        val example4 = findViewById<TextView>(R.id.code_example4)
        example4.setTextColor(Color.BLACK)
        val code4 = SpannableStringBuilder(
            "Output:\n"
                    + "10 is smaller than 20\n"
        )

        code4.setSpan(ForegroundColorSpan(Color.BLACK),0,7,Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code4.setSpan(StyleSpan(Typeface.BOLD), 0, 7, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)


        example4.text = code4

        val description4 = findViewById<TextView>(R.id.description4)
        description4.setTextColor(Color.BLACK)
        val spannable4=
            SpannableStringBuilder("Let's see an example of if-else ladder expression.\n")

        spannable4.setSpan(ForegroundColorSpan(Color.RED), 24, 31, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(StyleSpan(Typeface.BOLD), 24, 31, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description4.text = spannable4

        val example5 = findViewById<TextView>(R.id.code_example5)
        example5.setTextColor(Color.BLACK)
        val code5 = SpannableStringBuilder("fun main(args: Array<String>){\n"
                + "   val num1 = 10\n"
                + "   val result = if (num1 > 0) {\n"
                + "      \"\$num is positive\"\n"
                + "   } else if (num < 0) {\n"
                + "      \"\$num is negative\"\n"
                + "   } else {\n"
                + "      \"\$num is zero\"\n"
                + "   }\n"
                + "   println(result)\n"
                + "}")

        // color red 10 and 21
        //10
        code5.setSpan(ForegroundColorSpan(Color.RED), 45, 47, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code5.setSpan(ForegroundColorSpan(Color.RED), 75, 76, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color dark blue and bold fun
        //fun
        code5.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code5.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        //if
        code5.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 64, 67, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code5.setSpan(StyleSpan(Typeface.BOLD), 64, 67, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        //else if
        code5.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 110, 117, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code5.setSpan(StyleSpan(Typeface.BOLD), 110, 117, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        //else
        code5.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 159, 164, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code5.setSpan(StyleSpan(Typeface.BOLD), 159, 164, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        //default blue
        //positive
        code5.setSpan(ForegroundColorSpan(Color.BLUE), 87, 103, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        //negative
        code5.setSpan(ForegroundColorSpan(Color.BLUE), 136, 153, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        //zero
        code5.setSpan(ForegroundColorSpan(Color.BLUE), 174, 186, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)



        example5.text = code5

        val example6 = findViewById<TextView>(R.id.code_example6)
        example6.setTextColor(Color.BLACK)
        val code6 = SpannableStringBuilder(
            "Output:\n"
                    + "10 is positive\n"
        )

        code6.setSpan(ForegroundColorSpan(Color.BLACK),0,7,Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code6.setSpan(StyleSpan(Typeface.BOLD), 0, 7, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example6.text = code6

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
