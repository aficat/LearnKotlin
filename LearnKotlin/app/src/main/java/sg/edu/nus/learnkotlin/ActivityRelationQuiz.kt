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
import android.widget.*
import kotlinx.android.synthetic.main.activity_relation_quiz.*

class ActivityRelationQuiz : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relation_quiz)
        val btncontinue = findViewById<Button>(R.id.continueToNextPage)
        btncontinue.visibility = View.GONE

        //QUESTION 1

        val question1 = findViewById<TextView>(R.id.question)

        val question = SpannableStringBuilder("Which of the following is the correct answer?\n\n")

        val line1 = SpannableStringBuilder(" fun main(args : Array<String>) { \n")
        line1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.setSpan((StyleSpan(Typeface.BOLD)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        question.append(line1)

        val line2 = SpannableStringBuilder("    var a = 23 \n")
        line2.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        question.append(line2)

        val line3 = SpannableStringBuilder("    var b = 23 \n")
        line3.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        question.append(line3)

        val line4 = SpannableStringBuilder("    if (a > b) {\n")
        line4.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 3, 7, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line4.setSpan((StyleSpan(Typeface.BOLD)), 3, 7, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        question.append(line4)

        val line5 = SpannableStringBuilder("        println(\"a is greater than b.\")\n")
        line5.setSpan(ForegroundColorSpan(Color.BLUE), 16, 38, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        question.append(line5)

        val line6 = SpannableStringBuilder("    } else {\n")
        line6.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 5, 10, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line6.setSpan((StyleSpan(Typeface.BOLD)), 5, 10, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        question.append(line6)

        val line7 = SpannableStringBuilder("        println(\"b is not greater than a.\")\n    }\n }\n")
        line7.setSpan(ForegroundColorSpan(Color.BLUE), 16, 40, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        question.append(line7)

        val display = SpannableStringBuilder(question)
        question1.text = display

        val optiona = findViewById<TextView>(R.id.option1)
        val option1 = SpannableStringBuilder("a is greater than b.")
        optiona.text = option1

        val optionb = findViewById<TextView>(R.id.option2)
        val option2 = SpannableStringBuilder("b is not greater than a.")
        optionb.text = option2

        val optionc = findViewById<TextView>(R.id.option3)
        val option3 = SpannableStringBuilder("a is equal to be")
        optionc.text = option3

        val optiond = findViewById<TextView>(R.id.option4)
        val option4 = SpannableStringBuilder("None of the above")
        optiond.text = option4


        // Get radio group selected item using on checked change listener
        radio_group.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                //Toast.makeText(applicationContext," On checked change : ${radio.text}", Toast.LENGTH_SHORT).show()
            })

        // Get radio group selected status and text using button click event
        relation_submit2.setOnClickListener {
            // Get the checked radio button id from radio group
            var id: Int = radio_group.checkedRadioButtonId
            if (id != -1) { // If radio button is selected
                val radio: RadioButton = findViewById(id)
                // if correct answer
                if (radio.text == option2) { //CORRECT ANSWER
                    Toast.makeText(
                        applicationContext, "Yay! You are right!", Toast.LENGTH_SHORT
                    ).show()
                    btncontinue.visibility = View.VISIBLE
                    btncontinue.setOnClickListener {
                        val myIntent = Intent(this, ActivityAssignment::class.java)
                        startActivity(myIntent)
                    }
                } else { //if wrong answer
                    Toast.makeText(
                        applicationContext, "Wrong answer. Try again!", Toast.LENGTH_SHORT
                    ).show()
                }
            } else {
                // If no radio button checked in this radio group
                Toast.makeText(
                    applicationContext, "On button click : nothing selected",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    // Get the selected radio button text using radio button on click listener
    fun radio_button_click(view: View) {
        // Get the clicked radio button instance
        val radio: RadioButton = findViewById(radio_group.checkedRadioButtonId)
        //Toast.makeText(applicationContext,"On click : ${radio.text}", Toast.LENGTH_SHORT).show()

    }
}

