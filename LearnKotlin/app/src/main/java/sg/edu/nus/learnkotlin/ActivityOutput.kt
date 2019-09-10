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

class ActivityOutput : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        val intro = findViewById<TextView>(R.id.intro)

        val spannable1 = SpannableStringBuilder("Kotlin output operation is performed using the standard methods print() ")
        spannable1.setSpan(ForegroundColorSpan(Color.rgb(1, 105,20)), 64, 71, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 64,71, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val spannable2 = SpannableStringBuilder("and println().")
        spannable2.setSpan(ForegroundColorSpan(Color.rgb(1, 105,20)), 4, 13, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 4,13, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        spannable1.append(spannable2)

        intro.setTextColor(Color.BLACK)
        intro.setText(spannable1)

        val input = findViewById<TextView>(R.id.input)
        input.setTextColor(Color.BLACK)
        val line1 = SpannableStringBuilder(" fun main(args: Array<String>) { \n")
        line1.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)),0,4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val line2 = SpannableStringBuilder("    println(\"Hello World\") \n")
        line2.setSpan(ForegroundColorSpan(Color.BLUE), 12, 25, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line2)

        val line3 = SpannableStringBuilder("    print(\"Let's Learn Kotlin\") \n }")
        line3.setSpan(ForegroundColorSpan(Color.BLUE), 11, 32, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line3)

        input.setText(line1)

        val output = findViewById<TextView>(R.id.output)
        output.setTextColor(Color.BLACK)
        val show = " Hello World!\n Let's Learn Kotlin"
        output.setText(show)

        val remark = findViewById<TextView>(R.id.remark)
        remark.setTextColor(Color.BLACK)
        val display = "\nThe methods print() and println() are internally call System.out.print() and System.out.println() respectively."
        remark.setText(display)

        val differences = findViewById<TextView>(R.id.differences)
        val display2 = "\nDifference between print() and println() methods:\n"
        differences.setText(display2)

        val points = findViewById<TextView>(R.id.remarkPoints)
        val display3 = SpannableStringBuilder(" \u2002 print(): print() method is used to print values provided inside the method \"().\"\n")
        display3.setSpan(ForegroundColorSpan(Color.rgb(1,105,20)),3,10, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        display3.setSpan(StyleSpan(Typeface.BOLD), 3, 10, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val display4 = SpannableStringBuilder(" \u2002 println(): println() method is used to print values provided inside the method \"()\" and moves cursor to the beginning of next line.")
        display4.setSpan(ForegroundColorSpan(Color.rgb(1, 105, 20)), 3, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        display4.setSpan(StyleSpan(Typeface.BOLD), 3, 12, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        display3.append(display4)

        points.setText(display3)


        val input2 = findViewById<TextView>(R.id.input2)
        input2.setTextColor(Color.BLACK)
        val input2line1 = SpannableStringBuilder(" fun main(args: Array<String>) { \n")
        input2line1.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)),0,4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2line1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val input2line2 = SpannableStringBuilder("   println(10)\n")
        input2line2.setSpan(ForegroundColorSpan(Color.RED),11,13, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2line1.append(input2line2)

        val input2line3 = SpannableStringBuilder("   println(\"Let's Learn Kotlin\")\n")
        input2line3.setSpan(ForegroundColorSpan(Color.BLUE),11,31, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2line1.append(input2line3)

        val input2line4 = SpannableStringBuilder("   print(20)\n")
        input2line4.setSpan(ForegroundColorSpan(Color.RED),9,11, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2line1.append(input2line4)

        val input2line5 = SpannableStringBuilder("   println(\"Hello\")\n }")
        input2line5.setSpan(ForegroundColorSpan(Color.BLUE),11,18, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2line1.append(input2line5)

        input2.setText(input2line1)


        val output2 = findViewById<TextView>(R.id.output2)
        output2.setTextColor(Color.BLACK)
        val show2 = " 10\n" +
                " Let's Learn Kotlin\n" +
                " 20Hello"
        output2.setText(show2)

        val next = findViewById<Button>(R.id.nextInput)
        next.setOnClickListener{
            val nextPage = Intent(this, ActivityInput::class.java)
            startActivity(nextPage)
        }
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
