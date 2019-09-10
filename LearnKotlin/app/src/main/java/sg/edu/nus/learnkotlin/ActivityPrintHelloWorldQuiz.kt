package sg.edu.nus.learnkotlin

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_print_hello_world_quiz.*

class ActivityPrintHelloWorldQuiz : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_hello_world_quiz)

        val btncontinue = findViewById<Button>(R.id.continueToNextPage)
        btncontinue.visibility = View.GONE

        val sub1question = findViewById<TextView>(R.id.question)
        val question = SpannableStringBuilder("Try it yourself! \nPrint \"Have a nice day!\"\n"
                + "Fill in the blanks.\n")
        sub1question.text = question

        val example1 = findViewById<TextView>(R.id.code_example1)
        val code1 = " main(args: Array<String>){\n + "
        example1.text = code1

        val example3 = findViewById<TextView>(R.id.code_example3)
        val code3 = "  println(\""
        example3.text = code3

        val example4 = findViewById<TextView>(R.id.code_example4)
        val code4 = "\");"
        example4.text = code4

        val example5 = findViewById<TextView>(R.id.code_example5)
        val code5 = "}\n"
        example5.text = code5

        printhelloworld_submit.setOnClickListener {
            var answer1 = et_answer1.text.toString()
            var answer2 = et_answer2.text.toString()

            this.et_answer1.setText("")
            this.et_answer2.setText("")

            //Toast.makeText(applicationContext, "answer1 = " + answer1, Toast.LENGTH_SHORT).show()
            //Toast.makeText(applicationContext, "answer2 = " + answer2, Toast.LENGTH_SHORT).show()

            if (answer1 == "fun" && answer2 == "Have a nice day!") {
                Toast.makeText(
                    applicationContext, "Yay! You are right!", Toast.LENGTH_SHORT
                ).show()
                btncontinue.visibility = View.VISIBLE
                btncontinue.setOnClickListener {
                    val myIntent = Intent(this, ActivityIntroToKotlin::class.java)
                    startActivity(myIntent)
                }

                val example2 = findViewById<TextView>(R.id.code_example2)
                val code2 = SpannableStringBuilder(
                    "fun main(args: Array<String>){\n"
                            + "  println(\"Have a nice day!\");\n"
                            + "}"
                )

                // color dark blue and bold fun
                code2.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
                code2.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

                // color BLUE Have a nice day!
                code2.setSpan(ForegroundColorSpan(Color.BLUE), 42, 58, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

                example2.text = code2
            } else if (answer1 == "" || answer2 == "") {
                Toast.makeText(
                    applicationContext, "Incomplete answer!", Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    applicationContext, "Wrong answer. Try again!", Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
