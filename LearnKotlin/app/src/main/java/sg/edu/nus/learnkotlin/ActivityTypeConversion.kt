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

class ActivityTypeConversion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type_conversion)
        val typeConversionQuiz = findViewById<Button>(R.id.typeconversion_quiz)
        typeConversionQuiz.setOnClickListener {
            val myIntent = Intent(this, ActivityTypeConversionQuiz::class.java)
            startActivity(myIntent)
        }

        val description1 = findViewById<TextView>(R.id.description1)
        val spannable1 = SpannableStringBuilder(
            "Type conversion is a process in which one data type variable is converted into another data type.\n\n"
                    + "In Kotlin, implicit conversion of smaller data type into larger data type is not supported (as it supports in Java). Int cannot be assigned into Long or Double.\n"
        )
      description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        val code1 = SpannableStringBuilder(
            "var value1 = 10;\n"
                    + "val value2: Long = value1;\n"
                    + "// Compile error, type mismatch\n"
        )

        // color red 10
        code1.setSpan(ForegroundColorSpan(Color.RED), 12, 15, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        // color green
        code1.setSpan(ForegroundColorSpan(Color.rgb(30, 105, 30)), 44, 76, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color black
        code1.setSpan(ForegroundColorSpan(Color.BLACK), 29, 33, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 29, 33, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example1.text = code1

        val description2 = findViewById<TextView>(R.id.description2)
        val spannable2 =
            SpannableStringBuilder("However in Kotlin, conversion is done by explicit in which smaller data type is converted into larger data type and vice-versa. This is done by using helper function.\n")

        description2.text = spannable2

        val example2 = findViewById<TextView>(R.id.code_example2)
        val code2 = SpannableStringBuilder(
            "var value1 = 10;\n"
                    + "val value2: Long = value1.toLong()\n"
        )

        // color red 10
        code2.setSpan(ForegroundColorSpan(Color.RED), 12, 15, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        //color black
        code2.setSpan(ForegroundColorSpan(Color.BLACK), 29, 33, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(StyleSpan(Typeface.BOLD), 29,33, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example2.text = code2

        val description3 = findViewById<TextView>(R.id.description3)
        val spannable3 =
            SpannableStringBuilder(
                "The list of helper functions used for numeric conversion in Kotlin is given below:\n"
                        + "•  toByte()\n"
                        + "•  toFloat()\n"
                        + "•  toLong()\n"
                        + "•  toInt()\n"
                        + "•  toShort()\n"
                        + "•  toChar()\n"
                        + "•  toByte()\n\n"
                        + "Let see an example to convert from Int to Long:\n"
            )

        // bold red var and mutable
        spannable3.setSpan(ForegroundColorSpan(Color.RED), 38, 56, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(StyleSpan(Typeface.BOLD), 38, 56, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description3.text = spannable3

        val example3 = findViewById<TextView>(R.id.code_example3)
        val code3 = SpannableStringBuilder("fun main(args: Array<String>){\n"
                + "  var value1 = 100\n"
                + "  val value2: Long = value1.toLong()\n"
                + "  println(value2)\n"
                + "}")

        // color red 100
        code3.setSpan(ForegroundColorSpan(Color.RED), 46, 50, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        //color dark blue and bold fun
        code3.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(StyleSpan(Typeface.BOLD), 0,3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        //color black
        code3.setSpan(ForegroundColorSpan(Color.BLACK), 64, 69, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(StyleSpan(Typeface.BOLD), 64,69, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example3.text = code3

        val description4 = findViewById<TextView>(R.id.description4)
        val spannable4=
            SpannableStringBuilder("We can also converse from larger data type to smaller data type.\n")

        description4.text = spannable4

        val example4 = findViewById<TextView>(R.id.code_example4)
        val code4 = SpannableStringBuilder("fun main(args: Array<String>){\n"
                + "  var value1: Long = 200\n"
                + "  val value2: Int = value1.toInt()\n"
                + "  println(value2)\n"
                + "}")

        // color red 10 and 21
        code4.setSpan(ForegroundColorSpan(Color.RED), 52, 56, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        //color dark blue and bold fun
        code4.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code4.setSpan(StyleSpan(Typeface.BOLD), 0,3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        //color black
        code4.setSpan(ForegroundColorSpan(Color.BLACK), 45, 50, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code4.setSpan(StyleSpan(Typeface.BOLD), 45,50, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code4.setSpan(ForegroundColorSpan(Color.BLACK), 70, 73, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code4.setSpan(StyleSpan(Typeface.BOLD), 70,73, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example4.text = code4
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
