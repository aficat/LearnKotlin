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

class ActivityInput : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        val intro = findViewById<TextView>(R.id.intro)
        val spannable1 = SpannableStringBuilder(
            "Kotlin has standard library function readLine() which is used for reads line of string " +
                    "input from standard input stream. It returns the line read or null."
        )
        spannable1.setSpan(ForegroundColorSpan(Color.rgb(1, 105, 20)), 37, 47, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 37, 47, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        intro.setTextColor(Color.BLACK)
        intro.setText(spannable1)

        val input = findViewById<TextView>(R.id.input)
        input.setTextColor(Color.BLACK)
        val line1 = SpannableStringBuilder(" fun main(args: Array<String>) { \n")
        line1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val line2 = SpannableStringBuilder("    println(\"Enter your name\") \n    val name = readLine()\n")
        line2.setSpan(ForegroundColorSpan(Color.BLUE), 12, 29, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line2)

        val line3 =
            SpannableStringBuilder("    println(\"Enter your age\") \n    var age: Int =Integer.valueOf(readLine())\n")
        line3.setSpan(ForegroundColorSpan(Color.BLUE), 12, 28, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line3)

        val line4 = SpannableStringBuilder("    println(\"Your name is \$name and your age is \$age\") \n }")
        line4.setSpan(ForegroundColorSpan(Color.BLUE), 12, 53, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line4)

        input.setText(line1)

        val output = findViewById<TextView>(R.id.output)
        output.setTextColor(Color.BLACK)
        val show = " Enter your name\n" +
                " Johnathan\n" +
                " Enter your age\n" +
                " 25\n" +
                " Your name is Johnathan and your age is 25"
        output.setText(show)

        val remark = findViewById<TextView>(R.id.remark)
        remark.setTextColor(Color.BLACK)
        val display =
            "\nWhile using the readLine() function, input lines other than String are explicitly converted into their corresponding types.\n" +
                    "\n" +
                    "To input other data type rather than String, we need to use Scanner object of java.util.Scanner class from Java standard library.\n"
        remark.setText(display)


        val input2 = findViewById<TextView>(R.id.input2)
        input2.setTextColor(Color.BLACK)
        val input2line1 = SpannableStringBuilder(" import java.util.Scanner \n")
        input2line1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 8, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2line1.setSpan(StyleSpan(Typeface.BOLD), 0, 8, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val input2line2 = SpannableStringBuilder(" fun main(args : Array<String>) { \n")
        input2line1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2line1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2line1.append(input2line2)

        val input2line3 = SpannableStringBuilder("   val read = Scanner(System.`in`)  \n")
        input2line1.append(input2line3)

        val input2line4 = SpannableStringBuilder("   println(\"Enter your age\")\n   var age = read.nextInt()  \n")
        input2line4.setSpan(ForegroundColorSpan(Color.BLUE), 11, 27, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2line1.append(input2line4)

        val input2line5 = SpannableStringBuilder("   println(\"Your input age is \"+age)  \n }")
        input2line4.setSpan(ForegroundColorSpan(Color.BLUE), 10, 23, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2line1.append(input2line5)

        input2.setText(input2line1)

        val output2 = findViewById<TextView>(R.id.output2)
        output2.setTextColor(Color.BLACK)
        val show3 = " Enter your age\n" +
                " 25\n" +
                " Your input age is 25"
        output2.setText(show3)

        val remark2 = findViewById<TextView>(R.id.remark2)
        val show4 = "\nHere nextInt() is a method which takes integer input and stores in integer variable. " +
                "The other data types Boolean, Float, Long and Double uses nextBoolean(), nextFloat(), " +
                "nextLong() and nextDouble() to get input from user.\n"

        remark2.setTextColor(Color.BLACK)
        remark2.setText(show4)
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
