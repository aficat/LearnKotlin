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

class ActivityArithmetic : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arithmetic)

        val intro = findViewById<TextView>(R.id.intro)
        intro.setTextColor(Color.BLACK)
        val spannable = SpannableStringBuilder("Arithmetic operators are used to perform basic mathematical " +
                "operations such as addition (+), subtraction (-), multiplication (*), division (/) etc.")

        spannable.setSpan(ForegroundColorSpan(Color.RED), 0, 20, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        intro.setText(spannable)

        val input = findViewById<TextView>(R.id.input)
        input.setTextColor(Color.BLACK)
        val line1 = SpannableStringBuilder(" fun main(args : Array<String>) { \n")
        line1.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)),0,4,Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        val line2 = SpannableStringBuilder("    var a = 10 \n")
        line2.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line2)

        val line3 = SpannableStringBuilder("    var b = 5 \n")
        line3.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        line1.append(line3)

        val line4 = "    println(a+b) \n    println(a-b) \n    println(a*b) \n    println(a/b) \n    println(a%b) \n }"

        line1.append(line4)

        input.setText(line1)

        val output = findViewById<TextView>(R.id.output)
        output.setTextColor(Color.BLACK)
        val show = " 15 \n 5 \n 50 \n 2 \n 0"

        output.setText(show)


        /*val back = findViewById<Button>(R.id.back)
        back.setOnClickListener {
            val prevPage = Intent(this, ActivityArithmeticQuiz::class.java)
            startActivity(prevPage)
        }*/

        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener{
            val nextPage = Intent(this, ActivityArithmeticQuiz::class.java)
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
