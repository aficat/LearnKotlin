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

class ActivityComment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment)

        val commentQuiz = findViewById<Button>(R.id.comment_quiz)
        commentQuiz.setOnClickListener {
            val myIntent = Intent(this, ActivityCommentQuiz::class.java)
            startActivity(myIntent)
        }

        val description1 = findViewById<TextView>(R.id.description1)
        val spannable1 = SpannableStringBuilder(
            "Commenting code is a good practice, helping you and your fellow programmers understand and maintain the code.\n"
                    + "There are two types of comments in Kotlin: single-line comments and multi-line comments.\n\n"
                    + "Single-line comments start with two forward slashes (//). Everything after them is ignored by the compiler:\n"
        )
        // bold red single-line and multi-line
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 152, 164, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 152, 164, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 177, 188, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 177, 188, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // bold single-line comments
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 198, 220, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 198, 220, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        val code1 = SpannableStringBuilder(
            "// This is a single-line comment\n"
                    + "fun main(args: Array<String>){\n"
                    + "  println(\"Hello World!\");\n"
                    + "}"
        )

// color dark blue and bold fun
        code1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 33, 36, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 33, 36, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

// color BLUE Hello, world!
        code1.setSpan(ForegroundColorSpan(Color.BLUE), 74, 88, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

// color green
        code1.setSpan(ForegroundColorSpan(Color.rgb(30, 105, 30)), 0, 31, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example1.text = code1

        val description2 = findViewById<TextView>(R.id.description2)
        val spannable2 =
            SpannableStringBuilder("\n\nMulti-line comments can span multiple lines. They start with a forward slash and an asterisk, end with an asterisk and forward slash (/* */):\n")

// bold red multi-line comment
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 0, 21, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 0, 21, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description2.text = spannable2

        val example2 = findViewById<TextView>(R.id.code_example2)
        val code2 = SpannableStringBuilder(
            "/* This is a \n"
                    + "multi-line comment */\n"
                    + "fun main(args: Array<String>){\n"
                    + "  println(\"Hello World!\");\n"
                    + "/* Multi-line comments\n"
                    + "can span\n"
                    + "over multiple lines */\n"
                    + "}"
        )

        // color green /* This is a multi-line comment */
        code2.setSpan(ForegroundColorSpan(Color.rgb(30, 105, 30)), 0, 35, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        // color green /* Multi-line comments can span over multiple lines */
        code2.setSpan(ForegroundColorSpan(Color.rgb(30, 105, 30)), 94, 148, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        //color dark blue and bold fun
        code2.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 36, 39, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(StyleSpan(Typeface.BOLD), 36, 39, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color BLUE "Hello World!"
        code2.setSpan(ForegroundColorSpan(Color.BLUE), 77, 91, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example2.text = code2
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView_Bar)
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(0)
        menuItem.isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> {
                    val intent1 = Intent(this@ActivityComment, ActivityHome::class.java)
                    startActivity(intent1)
                }
                R.id.ic_video -> {
                    val intent2 = Intent(this@ActivityComment, ActivityVideosPage::class.java)
                    startActivity(intent2)
                }
                R.id.ic_onlineCode -> {
                    val intent3 = Intent(this@ActivityComment, ActivityNotes::class.java)
                    startActivity(intent3)
                }
                R.id.ic_game -> {
                    val intent4 = Intent(this@ActivityComment, ActivityGame::class.java)
                    startActivity(intent4)
                }
                R.id.ic_disclaimer-> {
                    val intent5 = Intent(this@ActivityComment, ActivityDisclaimer::class.java)
                    startActivity(intent5)
                }
            }
            false
        }

    }
}
