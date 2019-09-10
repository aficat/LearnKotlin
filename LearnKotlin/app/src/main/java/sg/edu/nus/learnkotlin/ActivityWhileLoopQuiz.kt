package sg.edu.nus.learnkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableStringBuilder
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_while_loop_quiz.*

class ActivityWhileLoopQuiz : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_while_loop_quiz)

        val btncontinue = findViewById<Button>(R.id.continueToNextPage)
        btncontinue.visibility = View.GONE

        //QUESTION 1

        val question1 = findViewById<TextView>(R.id.question)
        val question = SpannableStringBuilder("What is a loop?")
        question1.text = question.toString()

        val optiona = findViewById<TextView>(R.id.option1)
        val option1 = SpannableStringBuilder("A superclass function.")
        optiona.text = option1

        val optionb = findViewById<TextView>(R.id.option2)
        val option2 = SpannableStringBuilder("A repeated method call.")
        optionb.text = option2

        val optionc = findViewById<TextView>(R.id.option3)
        val option3 = SpannableStringBuilder("A block of code that will repeatedly run until a certain condition is true.")
        optionc.text = option3

        val optiond = findViewById<TextView>(R.id.option4)
        val option4 = SpannableStringBuilder("A block of code that does not repeat.")
        optiond.text = option4

        //QUESTION 2

        val question2 = findViewById<TextView>(R.id.question1)
        val q1 = SpannableStringBuilder("What is the output of this code snippet?")
        question2.text = q1

        val example2 = findViewById<TextView>(R.id.code_example1)
        val code2 = SpannableStringBuilder(
            "var x = 0 ;\n" +
                    "while(x <= 5) {\n" +
                    "print(x + \" \");\n" +
                    "x++;\n" +
                    "}\n"
        )
        example2.text = code2

        val opta = findViewById<TextView>(R.id.option5)
        val opt1 = SpannableStringBuilder("1 2 3 4")
        opta.text = opt1

        val optb = findViewById<TextView>(R.id.option6)
        val opt2 = SpannableStringBuilder("0 1 2 3 4 5")
        optb.text = opt2

        val optc = findViewById<TextView>(R.id.option7)
        val opt3 = SpannableStringBuilder("0 1 2 3 4")
        optc.text = opt3

        val optd = findViewById<TextView>(R.id.option8)
        val opt4 = SpannableStringBuilder("2 3 4 5")
        optd.text = opt4

        // Get radio group selected item using on checked change listener
        radio_group.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                //Toast.makeText(applicationContext," On checked change : ${radio.text}", Toast.LENGTH_SHORT).show()
            })

        // Get radio group selected status and text using button click event
        whileloop_submit1.setOnClickListener {
            // Get the checked radio button id from radio group
            var id: Int = radio_group.checkedRadioButtonId
            if (id != -1) { // If radio button is selected
                val radio: RadioButton = findViewById(id)
                // if correct answer
                if (radio.text == option3) { //CORRECT ANSWER
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
                    whileloop_submit2.setOnClickListener {
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
                                    val myIntent = Intent(this, ActivityControlFlow::class.java)
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
