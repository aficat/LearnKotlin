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



class ActivityDataType : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_type)

        val dataTypeQuiz = findViewById<Button>(R.id.datatype_quiz)
        dataTypeQuiz.setOnClickListener {
            val myIntent = Intent(this, ActivityDataTypeQuiz::class.java)
            startActivity(myIntent)
        }

        val description1 = findViewById<TextView>(R.id.description1)
        val spannable1 = SpannableStringBuilder(
            "Kotlin is a statically typed programming language with basic data types support such as Numbers, Characters, Booleans, Arrays, and Strings. \n\n"
                    + "Numbers are represented by the following built-in types:\n"
                    + "•  Double\n"
                    + "•  Float\n"
                    + "•  Long\n"
                    + "•  Int\n"
                    + "•  Short\n"
                    + "•  Byte\n\n"
                    + "Let’s declare an Integer and print its value:\n"
        )

        // bold red var
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 88, 138, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 88, 138, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 268, 275, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 268, 275, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        val code1 = SpannableStringBuilder(
            "var num: Int = 42;\n"
                    + "println(num);\n"
        )

        // color red 42
        code1.setSpan(ForegroundColorSpan(Color.RED), 15, 17, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color bold black
        code1.setSpan(ForegroundColorSpan(Color.BLACK), 9, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 9, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        example1.text = code1

        val description2 = findViewById<TextView>(R.id.description2)
        val spannable2 =
            SpannableStringBuilder("The number types differ by the memory size they allocate :\n\n"
                    + "Byte allocates 1 byte of memory.\n"
                    + "Short is 2 bytes.\n"
                    + "Int is 4 bytes.\n"
                    + "Long allows to store 8 bytes of data.\n\n"
                    + "If you need to store a floating point value, for instance, 3.14, you can use Float or Double.\n")

        // bold red
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 75, 81, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 75, 81, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 93, 98, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 93, 98, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 110, 114, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 110, 114, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 126, 131, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 126, 131, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 189, 204, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 189, 204, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 242, 248, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 242, 248, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 252, 258, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 252, 258, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description2.text = spannable2

        val example3 = findViewById<TextView>(R.id.code_example3)
        val code3 = SpannableStringBuilder(
            "val pi: Float = 3.14f;\n"
                    + "val e: Double = 2.71828;\n\n"
        )

        //color red
        code3.setSpan(ForegroundColorSpan(Color.RED), 16, 21, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(ForegroundColorSpan(Color.RED), 38, 46, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color bold BLACK
        code3.setSpan(ForegroundColorSpan(Color.BLACK), 8, 13, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(StyleSpan(Typeface.BOLD), 8, 13, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(ForegroundColorSpan(Color.BLACK), 29, 36, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(StyleSpan(Typeface.BOLD), 29, 36, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        example3.text = code3

        val description4 = findViewById<TextView>(R.id.description4)
        val spannable4=
            SpannableStringBuilder("Notice the “f” after 3.14. Kotlin, by default, interprets floating point numbers as Doubles, which have higher precision compared to Floats. To declare a Float literal, you should explicitly tell the compiler that your value is Float by adding f at the end of the value.\n")

        // bold red
        spannable4.setSpan(ForegroundColorSpan(Color.RED), 12, 13, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(StyleSpan(Typeface.BOLD), 12, 13, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(ForegroundColorSpan(Color.RED), 84, 91, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(StyleSpan(Typeface.BOLD), 84, 91, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(ForegroundColorSpan(Color.RED), 133, 139, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(StyleSpan(Typeface.BOLD), 133, 139, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(ForegroundColorSpan(Color.RED), 244, 245, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(StyleSpan(Typeface.BOLD), 244, 245, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description4.text = spannable4

        val description5 = findViewById<TextView>(R.id.description5)
        val spannable5 =
            SpannableStringBuilder("Characters are represented using the keyword Char. Char types are declared using single quotes ('').\n")

        // bold red Char
        spannable5.setSpan(ForegroundColorSpan(Color.RED), 46, 50, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable5.setSpan(StyleSpan(Typeface.BOLD), 46, 50, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description5.text = spannable5

        val example4 = findViewById<TextView>(R.id.code_example4)
        val code4 = SpannableStringBuilder(
            "val value1 = 'A'\n"
                    + "//or\n"
                    + "val value2: Char\n"
                    + "value2 = 'A'\n"
        )

        // color BLUE
        code4.setSpan(ForegroundColorSpan(Color.BLUE), 14, 16, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code4.setSpan(ForegroundColorSpan(Color.BLUE), 49, 51, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color green
        code4.setSpan(ForegroundColorSpan(Color.rgb(30, 105, 30)), 18, 21, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color black
        code4.setSpan(ForegroundColorSpan(Color.BLACK), 34, 38, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code4.setSpan(StyleSpan(Typeface.BOLD), 34, 38, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example4.text = code4

        val description6 = findViewById<TextView>(R.id.description6)
        val spannable6 =
            SpannableStringBuilder("Boolean data is represented using the type Boolean. To represent boolean values (true, false) the type Boolean is used.\n")

        // bold red Char
        spannable6.setSpan(ForegroundColorSpan(Color.RED), 103, 110, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable6.setSpan(StyleSpan(Typeface.BOLD), 103, 110, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        description6.text = spannable6

        val example5 = findViewById<TextView>(R.id.code_example5)
        val code5 = SpannableStringBuilder("val flag = true\n")

        //color dark blue and bold fun
        code5.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 11, 15, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code5.setSpan(StyleSpan(Typeface.BOLD), 11,15, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        example5.text = code5

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView_Bar)
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(0)
        menuItem.isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> {
                    val intent1 = Intent(this@ActivityDataType, ActivityHome::class.java)
                    startActivity(intent1)
                }
                R.id.ic_video -> {
                    val intent2 = Intent(this@ActivityDataType, ActivityVideosPage::class.java)
                    startActivity(intent2)
                }
                R.id.ic_onlineCode -> {
                    val intent3 = Intent(this@ActivityDataType, ActivityNotes::class.java)
                    startActivity(intent3)
                }
                R.id.ic_game -> {
                    val intent4 = Intent(this@ActivityDataType, ActivityGame::class.java)
                    startActivity(intent4)
                }
                R.id.ic_disclaimer-> {
                    val intent5 = Intent(this@ActivityDataType, ActivityDisclaimer::class.java)
                    startActivity(intent5)
                }
            }
            false
        }
    }
}
