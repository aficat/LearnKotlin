package sg.edu.nus.learnkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableStringBuilder
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_what_is_kotlin_quiz.*

class ActivityWhatIsKotlinQuiz : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_what_is_kotlin_quiz)

        val btncontinue = findViewById<Button>(R.id.continueToNextPage)
        btncontinue.visibility = View.GONE

        val sub1question = findViewById<TextView>(R.id.question)
        val question = SpannableStringBuilder("Kotlin is a fully supported programming language by ___________ on the Android Operating System." + "\n")
        sub1question.text = question

        val optiona = findViewById<TextView>(R.id.option1)
        val option1 = SpannableStringBuilder("Facebook")
        optiona.text = option1

        val optionb = findViewById<TextView>(R.id.option2)
        val option2 = SpannableStringBuilder("Microsoft")
        optionb.text = option2

        val optionc = findViewById<TextView>(R.id.option3)
        val option3 = SpannableStringBuilder("JetBrains")
        optionc.text = option3

        val optiond = findViewById<TextView>(R.id.option4)
        val option4 = SpannableStringBuilder("Visual Studio")
        optiond.text = option4

        // Get radio group selected item using on checked change listener
        radio_group.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                //Toast.makeText(applicationContext," On checked change : ${radio.text}", Toast.LENGTH_SHORT).show()
            })

        // Get radio group selected status and text using button click event
        whatiskotlin_submit.setOnClickListener {
            // Get the checked radio button id from radio group
            var id: Int = radio_group.checkedRadioButtonId
            if (id != -1) { // If radio button is selected
                val radio: RadioButton = findViewById(id)
                // if correct answer
                if (radio.text == option3) { //CORRECT ANSWER
                Toast.makeText(
                    applicationContext, "Yay! You are right!", Toast.LENGTH_SHORT).show()
                    btncontinue.visibility = View.VISIBLE
                    btncontinue.setOnClickListener {
                        val myIntent = Intent(this, ActivityIntroToKotlin::class.java)
                        startActivity(myIntent)
                    }
            } else { //if wrong answer
                    Toast.makeText(
                        applicationContext, "Wrong answer. Try again!", Toast.LENGTH_SHORT).show()
            }
        }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click : nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }


    // Get the selected radio button text using radio button on click listener
    fun radio_button_click(view: View){
        // Get the clicked radio button instance
        val radio: RadioButton = findViewById(radio_group.checkedRadioButtonId)
        //Toast.makeText(applicationContext,"On click : ${radio.text}", Toast.LENGTH_SHORT).show()
    }
}
