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

class ActivityRelation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relation)

        val intro = findViewById<TextView>(R.id.intro)

        val spannable = SpannableStringBuilder("Relation operator shows the relation and compares between operands.")

        spannable.setSpan(ForegroundColorSpan(Color.RED), 0, 9, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        intro.setTextColor(Color.BLACK)
        intro.setText(spannable)

        val input = findViewById<TextView>(R.id.input)
        input.setTextColor(Color.BLACK)
        val line1 = SpannableStringBuilder(" fun main(args : Array<String>) { \n")
        line1.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)),0,4,Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.setSpan((StyleSpan(Typeface.BOLD)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        val line2 = SpannableStringBuilder("    var a = 10 \n")
        line2.setSpan(ForegroundColorSpan(Color.RED), 12, 14, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line2)

        val line3 = SpannableStringBuilder("    var b = 5 \n")
        line3.setSpan(ForegroundColorSpan(Color.RED), 12, 13, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line3)

        val line4 = SpannableStringBuilder("    if (a > b) {\n")
        line4.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)), 3, 7, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line4.setSpan((StyleSpan(Typeface.BOLD)), 3, 7, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line4)

        val line5 = SpannableStringBuilder( "        println(\"a is greater than b.\")\n")
        line5.setSpan(ForegroundColorSpan(Color.BLUE), 16, 38, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line5)

        val line6 = SpannableStringBuilder( "    } else {\n")
        line6.setSpan(ForegroundColorSpan(Color.rgb(40,90,165)),5,10,Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line6.setSpan((StyleSpan(Typeface.BOLD)), 5, 10, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line6)

        val line7 = SpannableStringBuilder( "        println(\"b is greater than a.\")\n    }\n }\n")
        line7.setSpan(ForegroundColorSpan(Color.BLUE), 16, 38, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line7)


        input.setText(line1)

        val output = findViewById<TextView>(R.id.output)
        output.setTextColor(Color.BLACK)
        val show = " a is greater than b.\n"
        output.setText(show)

        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener{
            val nextPage = Intent(this, ActivityRelationQuiz::class.java)
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
