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
import android.widget.Button
import android.widget.TextView
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_assignment_quiz.*

class ActivityAssignmentQuiz : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment_quiz)

        val btncontinue = findViewById<Button>(R.id.continueToNextPage)
        btncontinue.visibility = View.GONE

        val sub1question = findViewById<TextView>(R.id.question)
        val question = SpannableStringBuilder("Fill in the correct answer! \n")
        sub1question.setTextColor(Color.BLACK)
        sub1question.text = question

        val example1 = findViewById<TextView>(R.id.code_example1)
        val line1 = SpannableStringBuilder(" fun main(args : Array<String>) {")
        line1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        example1.text = line1

        val example2 = findViewById<TextView>(R.id.code_example2)
        val line2 = SpannableStringBuilder("    var a = 20 \n")
        line2.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        example2.text = line2

        val example3 = findViewById<TextView>(R.id.code_example3)
        val line3 = SpannableStringBuilder("    var b = 13 \n")
        line3.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        example3.text = line3


        val example4 = findViewById<TextView>(R.id.code_example4)
        val line4 = SpannableStringBuilder("    print(a \n")
        example4.text = line4


        val example5 = findViewById<TextView>(R.id.code_example6)
        val line5 = SpannableStringBuilder("    b) \n")
        example5.text = line5

        val example6 = findViewById<TextView>(R.id.code_example7)
        val line6 = SpannableStringBuilder("  }")
        example6.text = line6

        val example8 = findViewById<TextView>(R.id.code_example8)
        val line7 = SpannableStringBuilder("Output: 1")
        example8.text = line7
        example8.setTextColor(Color.BLACK)

        submit.setOnClickListener {
            val answer2 = et_answer2.text.toString()

            this.et_answer2.setText("")

            //Toast.makeText(applicationContext, "answer1 = " + answer1, Toast.LENGTH_SHORT).show()
            //Toast.makeText(applicationContext, "answer2 = " + answer2, Toast.LENGTH_SHORT).show()

            if (answer2 == "/=") {
                Toast.makeText(
                    applicationContext, "Yay! You are right!", Toast.LENGTH_SHORT
                ).show()
                btncontinue.visibility = View.VISIBLE
                btncontinue.setOnClickListener {
                    val myIntent = Intent(this, ActivityLogical::class.java)
                    startActivity(myIntent)
                }

                val answer = findViewById<TextView>(R.id.code_example5)

                val line1_ans = SpannableStringBuilder(" fun main(args : Array<String>) { \n")
                line1_ans.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
                line1_ans.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

                val line2_ans = SpannableStringBuilder("    var a = 20 \n")
                line2_ans.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
                line1_ans.append(line2_ans)

                val line3_ans = SpannableStringBuilder("    var b = 13 \n ")
                line3_ans.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
                line1_ans.append(line3_ans)

                val line6_ans = SpannableStringBuilder("    print(a/=b)\n }\n\n")
                line6_ans.setSpan(ForegroundColorSpan(Color.BLUE), 10, 13, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
                line1_ans.append(line6_ans)

                val line7_ans = SpannableStringBuilder("Output: 1")
                line1_ans.append(line7_ans)

                answer.text = line1_ans
            } else if (answer2 == "") {
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
