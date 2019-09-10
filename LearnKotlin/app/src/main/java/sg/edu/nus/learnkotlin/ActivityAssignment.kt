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

class ActivityAssignment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment)

        val intro = findViewById<TextView>(R.id.intro)

        val spannable = SpannableStringBuilder("Assignment operator \"=\" is used to assign a value to another variable. The assignment of value takes from right to left.")

        spannable.setSpan(ForegroundColorSpan(Color.RED), 0, 10, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        intro.setTextColor(Color.BLACK)
        intro.setText(spannable)


        val input = findViewById<TextView>(R.id.input)
        input.setTextColor(Color.BLACK)
        val line1 = SpannableStringBuilder(" fun main(args : Array<String>) { \n")
        line1.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)),0,4,Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val line2 = SpannableStringBuilder("    var a = 20 \n")
        line2.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line2)

        val line3 = SpannableStringBuilder("    var b = 5 \n    a+=b\n ")
        line3.setSpan(ForegroundColorSpan(Color.RED), 12, 13, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line3)

        val line4 = SpannableStringBuilder( "   println(\"a+=b :\" + a)\n    a*=b\n")
        line4.setSpan(ForegroundColorSpan(Color.BLUE), 11, 19, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line4)

        val line5 = SpannableStringBuilder( "   println(\"a-=b :\" + a)\n    a*=b\n")
        line5.setSpan(ForegroundColorSpan(Color.BLUE), 11, 19, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line5)

        val line6 = SpannableStringBuilder( "    println(\"a*=b :\" + a)\n    a/=b\n")
        line6.setSpan(ForegroundColorSpan(Color.BLUE), 12, 20, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line6)

        val line7 = SpannableStringBuilder( "    println(\"a/=b :\" + a)\n    a%=b\n")
        line7.setSpan(ForegroundColorSpan(Color.BLUE), 12, 20, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line7)

        val line8 = SpannableStringBuilder( "    println(\"a%=b :\" + a)\n\n }")
        line8.setSpan(ForegroundColorSpan(Color.BLUE), 12, 20, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line8)

        input.setText(line1)


        val output = findViewById<TextView>(R.id.output)
        output.setTextColor(Color.BLACK)
        val show = " a+=b :25\n" +
                " a-=b :20\n" +
                " a*=b :100\n" +
                " a/=b :20\n" +
                " a%=b :0"
        output.setText(show)

        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            val nextPage = Intent(this, ActivityAssignmentQuiz::class.java)
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
