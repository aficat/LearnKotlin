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

class ActivityVariableDeclaration : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variable_declaration)

        val variableDeclarationQuiz = findViewById<Button>(R.id.variabledeclaration_quiz)
        variableDeclarationQuiz.setOnClickListener {
            val myIntent = Intent(this, ActivityVariableDeclarationQuiz::class.java)
            startActivity(myIntent)
        }

        val description1 = findViewById<TextView>(R.id.description1)
        val spannable1 = SpannableStringBuilder(
            "Declaring variables is done using either var or val. \n\n"
                    + "Val declarations cannot be reassigned (they are called immutable).\nFor example:\n"
        )
        // bold red var and val
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 41, 44, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 41, 44, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 48, 52, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 48, 52, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // bold red val
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 53, 58, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 53, 58, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // bold red immutable
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 110, 119, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 110, 119, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        val code1 = SpannableStringBuilder(
            "val num = 10;\n"
                    + "println(num);\n"
                    + "val str = \"Hello\";\n"
                    + "println(str);\n"
        )

        // color red 10
        code1.setSpan(ForegroundColorSpan(Color.RED), 10, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color BLUE "Hello"
        code1.setSpan(ForegroundColorSpan(Color.BLUE), 38, 45, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example1.text = code1

        val description2 = findViewById<TextView>(R.id.description2)
        val spannable2 =
            SpannableStringBuilder("Assigning a new value to num or str leads to a compile error.\n The following code will not compile:\n")

        // bold red num and str
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 25, 28, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 25, 28, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 32, 35, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 32, 35, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description2.text = spannable2

        val example2 = findViewById<TextView>(R.id.code_example2)
        val code2 = SpannableStringBuilder(
            "val num = 10;\n"
                    + "num = 12;\n"
        )

        // color red 10 and 12
        code2.setSpan(ForegroundColorSpan(Color.RED), 10, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(ForegroundColorSpan(Color.RED), 20, 22, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example2.text = code2

        val description3 = findViewById<TextView>(R.id.description3)
        val spannable3 =
            SpannableStringBuilder("The var keyword allows to declare variables that can be reassigned (they are called mutable):\n")

        // bold red var and mutable
        spannable3.setSpan(ForegroundColorSpan(Color.RED), 4, 7, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(StyleSpan(Typeface.BOLD), 4, 7, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(ForegroundColorSpan(Color.RED), 84, 91, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(StyleSpan(Typeface.BOLD), 84, 91, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description3.text = spannable3

        val example3 = findViewById<TextView>(R.id.code_example3)
        val code3 = SpannableStringBuilder(
            "var num = 10;\n"
                    + "num = 12;\n"
        )

        // color red 10 and 21
        code3.setSpan(ForegroundColorSpan(Color.RED), 10, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(ForegroundColorSpan(Color.RED), 20, 22, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example3.text = code3

        val description4 = findViewById<TextView>(R.id.description4)
        val spannable4=
            SpannableStringBuilder("As you can see, we did not explicitly set the type of the variables. The variables get their corresponding type thanks to Kotlin’s type inference, where the type gets automatically inferred from the value you have assigned to the variable.\n\n"
            + "To explicitly declare the type of a variable, use the following syntax:\n")

        // bold red type inference
        spannable4.setSpan(ForegroundColorSpan(Color.RED), 131, 145, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(StyleSpan(Typeface.BOLD), 131, 145, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description4.text = spannable4

        val example4 = findViewById<TextView>(R.id.code_example4)
        val code4 = SpannableStringBuilder(
            "var num: Int = 42;\n"
                    + "Val str: String = \"Won't change\";\n"
        )

        // bold black Int and String
        code4.setSpan(ForegroundColorSpan(Color.BLACK), 9, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code4.setSpan(StyleSpan(Typeface.BOLD), 9, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code4.setSpan(ForegroundColorSpan(Color.BLACK), 27, 34, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code4.setSpan(StyleSpan(Typeface.BOLD), 27, 34, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color red 42 and "Won't change"
        code4.setSpan(ForegroundColorSpan(Color.RED), 15, 17, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code4.setSpan(ForegroundColorSpan(Color.RED), 36, 51, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example4.text = code4

        val description5 = findViewById<TextView>(R.id.description5)
        val spannable5 =
            SpannableStringBuilder("The code above declares a num variable of type Int and a str variable of type String.\n")

        // bold red num, Int, str, String
        spannable5.setSpan(ForegroundColorSpan(Color.RED), 26, 29, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable5.setSpan(StyleSpan(Typeface.BOLD), 26, 29, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable5.setSpan(ForegroundColorSpan(Color.RED), 47, 50, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable5.setSpan(StyleSpan(Typeface.BOLD), 47, 50, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable5.setSpan(ForegroundColorSpan(Color.RED), 57, 60, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable5.setSpan(StyleSpan(Typeface.BOLD), 57, 60, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable5.setSpan(ForegroundColorSpan(Color.RED), 78, 84, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable5.setSpan(StyleSpan(Typeface.BOLD), 78, 84, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description5.text = spannable5

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
