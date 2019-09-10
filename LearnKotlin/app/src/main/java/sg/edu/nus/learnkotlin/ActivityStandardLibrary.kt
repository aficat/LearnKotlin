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

class ActivityStandardLibrary : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard_library)

        val intro = findViewById<TextView>(R.id.intro)
        val spannable = SpannableStringBuilder("Kotlin Standard library function is built-in library functions " +
                "which are implicitly present in library and available for use.")
        spannable.setSpan(ForegroundColorSpan(Color.RED), 7, 23, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        intro.setTextColor(Color.BLACK)
        intro.setText(spannable)

        val input = findViewById<TextView>(R.id.input)
        input.setTextColor(Color.BLACK)
        val line1 = SpannableStringBuilder(" fun main(args : Array<String> { \n")
        line1.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)),0,4,Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val line2 = SpannableStringBuilder("    var number=10 \n")
        line2.setSpan(ForegroundColorSpan(Color.RED), 15, 17, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line2)

        val line3 = SpannableStringBuilder("    var result = Math.sqrt(number.toDouble())\n")
        line1.append(line3)

        val line4 = SpannableStringBuilder("    print(\"Square root of \$number is \$result\")  \n }")
        line4.setSpan(ForegroundColorSpan(Color.BLUE), 10, 45, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line4)

        input.setText(line1)

        val output = findViewById<TextView>(R.id.output)
        output.setTextColor(Color.BLACK)
        val show = " Square root of 25 is 5.0"
        output.setText(show)


        val remark = findViewById<TextView>(R.id.remark)
        val remarkSpannable1 = SpannableStringBuilder("\u2022 Here, sqrt() is a library function which returns square root of a number (Double value).\n")
        remarkSpannable1.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 8, 15, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        remarkSpannable1.setSpan(StyleSpan(Typeface.BOLD), 8, 15, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val remarkSpannable2 = SpannableStringBuilder("\u2022 print() library function which prints a message to standard output stream.")
        remarkSpannable2.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 2, 9, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        remarkSpannable2.setSpan(StyleSpan(Typeface.BOLD), 2, 9, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        remarkSpannable1.append(remarkSpannable2)

        remark.setTextColor(Color.BLACK)
        remark.setText(remarkSpannable1)


        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener{
            val nextPage = Intent(this, ActivityUserDefined::class.java)
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
