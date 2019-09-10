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

class ActivityPrintHelloWorld : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_hello_world)

        val printhelloworldQuiz = findViewById<Button>(R.id.printhelloworld_quiz)
        printhelloworldQuiz.setOnClickListener {
            val myIntent = Intent(this, ActivityPrintHelloWorldQuiz::class.java)
            startActivity(myIntent)
        }

        val description1 = findViewById<TextView>(R.id.description1)
        val spannable1 = SpannableStringBuilder("Let's start with an example on how to print a 'Hello, World!' message: \n")
        description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        val code1 = SpannableStringBuilder("fun main(args: Array<String>){\n"
                + "  println(\"Hello, world!\");\n"
                + "}")

        // color dark blue and bold fun
        code1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

         // color BLUE "Hello, world!"
        code1.setSpan(ForegroundColorSpan(Color.BLUE), 41, 56, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color green
        //code1.setSpan(ForegroundColorSpan(Color.rgb(30, 105, 30)), 41, 54, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example1.text = code1

        val description2 = findViewById<TextView>(R.id.description2)
        val spannable2 = SpannableStringBuilder("\n\nLet's break down the code: \n"
                + "Every Kotlin program must have the main function defined, which is the starting point of the program and is done with the fun keyword. \n\n"
                + "The println() function is used to generate output. In our case, we passed the message to print in double quotes to the function. \n\n"
                + "You can also print your name!\n")

        // bold red main
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 65, 69, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 65, 69, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        // bold red fun
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 152, 155, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 152, 155, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        // bold red println()
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 171, 180, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 171, 180, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description2.text = spannable2

        val example2 = findViewById<TextView>(R.id.code_example2)
        val code2 = SpannableStringBuilder("fun main(args: Array<String>){\n"
                + "  println(\"*insert your name here*\");\n"
                + "}")

        // color dark blue and bold fun
        code2.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color BLUE "*insert your name here*"
        code2.setSpan(ForegroundColorSpan(Color.BLUE), 41, 66, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example2.text = code2

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView_Bar)
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(0)
        menuItem.isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> {
                    val intent1 = Intent(this@ActivityPrintHelloWorld, ActivityHome::class.java)
                    startActivity(intent1)
                }
                R.id.ic_video -> {
                    val intent2 = Intent(this@ActivityPrintHelloWorld, ActivityVideosPage::class.java)
                    startActivity(intent2)
                }
                R.id.ic_onlineCode -> {
                    val intent3 = Intent(this@ActivityPrintHelloWorld, ActivityNotes::class.java)
                    startActivity(intent3)
                }
                R.id.ic_game -> {
                    val intent4 = Intent(this@ActivityPrintHelloWorld, ActivityGame::class.java)
                    startActivity(intent4)
                }
                R.id.ic_disclaimer-> {
                    val intent5 = Intent(this@ActivityPrintHelloWorld, ActivityDisclaimer::class.java)
                    startActivity(intent5)
                }
            }
            false
        }
    }
}
