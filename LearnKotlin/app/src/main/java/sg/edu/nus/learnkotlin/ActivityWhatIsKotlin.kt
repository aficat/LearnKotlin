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

class ActivityWhatIsKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_what_is_kotlin)

        val whatIsKotlinQuiz = findViewById<Button>(R.id.whatiskotlin_quiz)
        whatIsKotlinQuiz.setOnClickListener {
            val myIntent = Intent(this, ActivityWhatIsKotlinQuiz::class.java)
            startActivity(myIntent)
        }

        val description = findViewById<TextView>(R.id.description1)
        val spannable1 = SpannableStringBuilder("Kotlin is a general-purpose, statically-typed, and open-source programming language. "
                + "It runs on Java Virtual Machine and can be used to develop Android apps, server-side apps and much more."
                + "\n\n" + "It is a fully supported programming language by Google on the Android Operating System. Kotlin can be used for backend development."
                + "\n\n" + "Kotlin uses aggressive type inference to determine the type of values and expressions where type has been"
                + " left unstated. This reduces language verbosity compared to Java.")

        //bold red statically-typed
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 29, 45, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 29, 45, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        //bold red open-source
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 51, 62, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 51, 62, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // bold red Java Virtual Machine
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 96, 116, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 96, 116, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // bold red Google
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 238, 245, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 238, 245, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description.text = spannable1

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView_Bar)
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(0)
        menuItem.isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> {
                    val intent1 = Intent(this@ActivityWhatIsKotlin, ActivityHome::class.java)
                    startActivity(intent1)
                }
                R.id.ic_video -> {
                    val intent2 = Intent(this@ActivityWhatIsKotlin, ActivityVideosPage::class.java)
                    startActivity(intent2)
                }
                R.id.ic_onlineCode -> {
                    val intent3 = Intent(this@ActivityWhatIsKotlin, ActivityNotes::class.java)
                    startActivity(intent3)
                }
                R.id.ic_game -> {
                    val intent4 = Intent(this@ActivityWhatIsKotlin, ActivityGame::class.java)
                    startActivity(intent4)
                }
                R.id.ic_disclaimer-> {
                    val intent5 = Intent(this@ActivityWhatIsKotlin, ActivityDisclaimer::class.java)
                    startActivity(intent5)
                }
            }
            false
        }
    }
}
