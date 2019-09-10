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
import kotlinx.android.synthetic.main.activity_arithmetic_quiz.*

class ActivityArithmeticQuiz : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arithmetic_quiz)

        val btncontinue = findViewById<Button>(R.id.continueToNextPage)
        btncontinue.visibility = View.GONE

        //QUESTION 1

        val question1 = findViewById<TextView>(R.id.question)

        val question = SpannableStringBuilder("Which of the following is the correct answer?\n\n")

        val line1 = SpannableStringBuilder(" fun main(args : Array<String>) { \n")
        line1.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)),0,4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        question.append(line1)

        val line2 = SpannableStringBuilder("    var a = 20 \n")
        line2.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        question.append(line2)

        val line3 = SpannableStringBuilder("    var b = 5 \n")
        line3.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        question.append(line3)

        val line4 = "    println(a%b) \n }\n"

        question.append(line4)

        val display = SpannableStringBuilder(question)
        question1.text = display

        val optiona = findViewById<TextView>(R.id.option1)
        val option1 = SpannableStringBuilder("25")
        optiona.text = option1

        val optionb = findViewById<TextView>(R.id.option2)
        val option2 = SpannableStringBuilder("4")
        optionb.text = option2

        val optionc = findViewById<TextView>(R.id.option3)
        val option3 = SpannableStringBuilder("20")
        optionc.text = option3

        val optiond = findViewById<TextView>(R.id.option4)
        val option4 = SpannableStringBuilder("0")
        optiond.text = option4

        //QUESTION 2

        val question2 = findViewById<TextView>(R.id.question1)

        val question_2 = SpannableStringBuilder("Which of the following is the correct answer?\n\n")

        val line1_2 = SpannableStringBuilder(" fun main(args : Array<String>) { \n")
        line1_2.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)),0,4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1_2.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        question_2.append(line1_2)

        val line2_2 = SpannableStringBuilder("    var a = 30 \n")
        line2_2.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        question_2.append(line2_2)

        val line3_2 = SpannableStringBuilder("    var b = 4 \n")
        line3_2.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        question_2.append(line3_2)

        val line4_2 = "    println(a/b) \n }\n"

        question_2.append(line4_2)

        val display_2 = SpannableStringBuilder(question_2)
        question2.text = display_2


        val opta = findViewById<TextView>(R.id.option5)
        val opt1 = SpannableStringBuilder("6")
        opta.text = opt1

        val optb = findViewById<TextView>(R.id.option6)
        val opt2 = SpannableStringBuilder("2")
        optb.text = opt2

        val optc = findViewById<TextView>(R.id.option7)
        val opt3 = SpannableStringBuilder("7")
        optc.text = opt3

        val optd = findViewById<TextView>(R.id.option8)
        val opt4 = SpannableStringBuilder("4")
        optd.text = opt4

        // Get radio group selected item using on checked change listener
        radio_group.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                //Toast.makeText(applicationContext," On checked change : ${radio.text}", Toast.LENGTH_SHORT).show()
            })

        // Get radio group selected status and text using button click event
        arithmetic_submit1.setOnClickListener {
            // Get the checked radio button id from radio group
            var id: Int = radio_group.checkedRadioButtonId
            if (id != -1) { // If radio button is selected
                val radio: RadioButton = findViewById(id)
                // if correct answer
                if (radio.text == option4) { //CORRECT ANSWER
                    Toast.makeText(
                        applicationContext, "Yay! You are right!", Toast.LENGTH_SHORT
                    ).show()

                    //QUESTION 2

                    // Get radio group selected item using on checked change listener
                    radio_group1.setOnCheckedChangeListener(
                        RadioGroup.OnCheckedChangeListener { group, checkedId ->
                            val radio: RadioButton = findViewById(checkedId)
                            //Toast.makeText(applicationContext," On checked change : ${radio.text}", Toast.LENGTH_SHORT).show()
                        })

                    // Get radio group selected status and text using button click event
                    arithmetic_submit2.setOnClickListener {
                        // Get the checked radio button id from radio group
                        var id: Int = radio_group1.checkedRadioButtonId
                        if (id != -1) { // If radio button is selected
                            val radio1: RadioButton = findViewById(id)
                            // if correct answer
                            if (radio1.text == opt3) { //CORRECT ANSWER
                                Toast.makeText(
                                    applicationContext, "Yay! You are right!", Toast.LENGTH_SHORT
                                ).show()
                                btncontinue.visibility = View.VISIBLE
                                btncontinue.setOnClickListener {
                                    val myIntent = Intent(this, ActivityRelation::class.java)
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
