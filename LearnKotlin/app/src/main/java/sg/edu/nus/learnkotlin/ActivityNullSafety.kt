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
import android.widget.TextView

class ActivityNullSafety : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val description1 = findViewById<TextView>(R.id.description1)
        val spannable1 = SpannableStringBuilder(
            "In programming languages, null is the absence of value.\n"
                    + "To allow nulls, we can declare a variable as nullable using the question mark as shown below:\n"
        )
        // bold red var and val
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 26, 30, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 26, 30, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        val code1 = SpannableStringBuilder(
            "var str: String? = “Learn Kotlin”;\n"
            + "str = null;\n"
        )

        // bold black var and val
        code1.setSpan(ForegroundColorSpan(Color.BLACK), 9, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 9, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color BLUE "Hello"
        code1.setSpan(ForegroundColorSpan(Color.BLUE), 19, 33, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example1.text = code1

        val description2 = findViewById<TextView>(R.id.description2)
        val spannable2 =
            SpannableStringBuilder("The code above will work without any errors.\n"
                    + "However, now, trying to access a property on nullable str, causes a compile-time error, as now str can be null:")

        // bold red num and str
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 98, 102, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 98, 102, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
spannable2.setSpan(ForegroundColorSpan(Color.RED), 139, 143, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 139, 143,  Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description2.text = spannable2

        val example2 = findViewById<TextView>(R.id.code_example2)
        val code2 = SpannableStringBuilder(
            "Var str: String? = “Learn Kotlin”;\n"
                    + "println(str.length);\n"
        )

        // bold black var and val
        code2.setSpan(ForegroundColorSpan(Color.BLACK), 9, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(StyleSpan(Typeface.BOLD), 9, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color BLUE "Hello"
        code2.setSpan(ForegroundColorSpan(Color.BLUE), 19, 33, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example2.text = code2

        val description3 = findViewById<TextView>(R.id.description3)
        val spannable3 =
            SpannableStringBuilder("To safely access nullable values, we have to use the ? operator (called the safe call operator).\n")

        // bold red var
        spannable3.setSpan(ForegroundColorSpan(Color.RED), 10, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(StyleSpan(Typeface.BOLD), 10, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
spannable3.setSpan(ForegroundColorSpan(Color.RED), 53, 54, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(StyleSpan(Typeface.BOLD), 53, 54, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
spannable3.setSpan(ForegroundColorSpan(Color.RED), 76, 95, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(StyleSpan(Typeface.BOLD), 76, 95, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description3.text = spannable3

        val example3 = findViewById<TextView>(R.id.code_example3)
        val code3 = SpannableStringBuilder(
            "println(str?.length);\n"
        )

        // color red 10 and 21
        code3.setSpan(ForegroundColorSpan(Color.RED), 11, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example3.text = code3

        val description4 = findViewById<TextView>(R.id.description4)
        val spannable4=
            SpannableStringBuilder("The ? can be used with any type to make it nullable.\n")

        // bold red
        spannable4.setSpan(ForegroundColorSpan(Color.RED), 4, 5, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(StyleSpan(Typeface.BOLD), 4, 5, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description4.text = spannable4

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
