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
import kotlinx.android.synthetic.main.activity_comment_quiz.*

class ActivityCommentQuiz : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment_quiz)

        val btncontinue = findViewById<Button>(R.id.continueToNextPage)
        btncontinue.visibility = View.GONE

        val sub1question = findViewById<TextView>(R.id.question)
        val question = SpannableStringBuilder("Try it yourself!\n"
                + "Fill in the blanks to comment a single-line and multi-line comment.\n")
        sub1question.text = question

        val example1 = findViewById<TextView>(R.id.code_example1)
        val code1 = "fun main(args: Array<String>){\n + "
        example1.text = code1

        val example2 = findViewById<TextView>(R.id.code_example2)
        val code2 = "single-line comment"
        example2.text = code2

        val example3 = findViewById<TextView>(R.id.code_example3)
        val code3 = "  println(\"Hello World!\")\n }"
        example3.text = code3

        val example4 = findViewById<TextView>(R.id.code_example4)
        val code4 = "This is a \n"
        example4.text = code4

        val example6 = findViewById<TextView>(R.id.code_example6)
        val code6 = "multiple-line comment."
        example6.text = code6

        comment_submit.setOnClickListener {
            var answer1 = et_answer3.text.toString()
            var answer2 = et_answer4.text.toString()
            var answer3 = et_answer5.text.toString()

            this.et_answer3.setText("")
            this.et_answer4.setText("")
            this.et_answer5.setText("")

            if (answer1 == "//" && answer2 == "/*" && answer3 == "*/") {
                Toast.makeText(
                    applicationContext, "Yay! You are right!", Toast.LENGTH_SHORT
                ).show()
                btncontinue.visibility = View.VISIBLE
                btncontinue.setOnClickListener {
                    val myIntent = Intent(this, ActivityIntroToKotlin::class.java)
                    startActivity(myIntent)
                }

                val example5 = findViewById<TextView>(R.id.code_example5)
                val code5 = SpannableStringBuilder(
                    "fun main(args: Array<String>){\n"
                            + "// \"single-line comment\"\n"
                            + "  println(\"Hello World!\")\n"
                            + " }\n"
                            + "/*This is a \n"
                            + "multiple-line comment.*/"
                )

                // color dark blue and bold fun
                code5.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
                code5.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

                example5.text = code5

            } else if (answer1 == "" || answer2 == "" || answer3 == "") {
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
