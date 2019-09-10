package sg.edu.nus.learnkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableStringBuilder
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_type_conversion_quiz.*

class ActivityTypeConversionQuiz : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type_conversion_quiz)

        val btncontinue = findViewById<Button>(R.id.continueToNextPage)
        btncontinue.visibility = View.GONE

        //QUESTION 1

        val question1 = findViewById<TextView>(R.id.question)
        val question = SpannableStringBuilder("Which helper function helps to convert Long variables into Int variables?\n")
        question1.text = question

        val optiona = findViewById<TextView>(R.id.option1)
        val option1 = SpannableStringBuilder("toByte()")
        optiona.text = option1

        val optionb = findViewById<TextView>(R.id.option2)
        val option2 = SpannableStringBuilder("toShort()")
        optionb.text = option2

        val optionc = findViewById<TextView>(R.id.option3)
        val option3 = SpannableStringBuilder("toInt()")
        optionc.text = option3

        val optiond = findViewById<TextView>(R.id.option4)
        val option4 = SpannableStringBuilder("toLong()")
        optiond.text = option4

        //QUESTION 2

        val question2 = findViewById<TextView>(R.id.question1)
        val q1 = SpannableStringBuilder("Is implicit conversion of smaller data type into larger data type supported in Kotlin?\n")
        question2.text = q1

        val opta = findViewById<TextView>(R.id.option5)
        val opt1 = SpannableStringBuilder("Yes")
        opta.text = opt1

        val optb = findViewById<TextView>(R.id.option6)
        val opt2 = SpannableStringBuilder("No")
        optb.text = opt2


        // Get radio group selected item using on checked change listener
        radio_group.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                //Toast.makeText(applicationContext," On checked change : ${radio.text}", Toast.LENGTH_SHORT).show()
            })

        // Get radio group selected status and text using button click event
        typeconversion_submit1.setOnClickListener {
            // Get the checked radio button id from radio group
            var id: Int = radio_group.checkedRadioButtonId
            if (id != -1) { // If radio button is selected
                val radio: RadioButton = findViewById(id)
                // if correct answer
                if (radio.text == option3) { //CORRECT ANSWER
                    Toast.makeText(
                        applicationContext, "Yay! You are right!", Toast.LENGTH_SHORT
                    ).show()

                    // Get radio group selected item using on checked change listener
                    radio_group1.setOnCheckedChangeListener(
                        RadioGroup.OnCheckedChangeListener { group, checkedId ->
                            val radio: RadioButton = findViewById(checkedId)
                            //Toast.makeText(applicationContext," On checked change : ${radio.text}", Toast.LENGTH_SHORT).show()
                        })

                    // Get radio group selected status and text using button click event
                    typeconversion_submit2.setOnClickListener {
                        // Get the checked radio button id from radio group
                        var id: Int = radio_group1.checkedRadioButtonId
                        if (id != -1) { // If radio button is selected
                            val radio1: RadioButton = findViewById(id)
                            // if correct answer
                            if (radio1.text == opt2) { //CORRECT ANSWER
                                Toast.makeText(
                                    applicationContext, "Yay! You are right!", Toast.LENGTH_SHORT
                                ).show()
                                btncontinue.visibility = View.VISIBLE
                                btncontinue.setOnClickListener {
                                    val myIntent = Intent(this, ActivityIntroToKotlin::class.java)
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
        //val radio: RadioButton = findViewById(radio_group.checkedRadioButtonId)
        //Toast.makeText(applicationContext,"On click : ${radio.text}", Toast.LENGTH_SHORT).show()

    }
}
