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

class ActivityArray : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array)

        val arrayQuiz = findViewById<Button>(R.id.array_quiz)
        arrayQuiz.setOnClickListener {
            val myIntent = Intent(this, ActivityArrayQuiz::class.java)
            startActivity(myIntent)
        }

        val description1 = findViewById<TextView>(R.id.description1)
        val spannable1 = SpannableStringBuilder(
            "An array is a collection of values of the same type.\n"
                    + "When you need to store a list of values, such as numbers, you can store them in an array, instead of declaring separate variables for each number.\n\n"
                    + "To create an array, we can use a library function arrayOf() and pass the item value to it:"
        )
        // bold red array and arrayOf()
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 3, 8, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 3, 8, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(ForegroundColorSpan(Color.RED), 250, 259, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable1.setSpan(StyleSpan(Typeface.BOLD), 250, 259, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description1.text = spannable1

        val example1 = findViewById<TextView>(R.id.code_example1)
        val code1 = SpannableStringBuilder(
            "var arr = arrayOf(1, 2, 3);\n"
        )

        // color and bold black arrayOf
        code1.setSpan(ForegroundColorSpan(Color.BLACK), 10, 17, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(StyleSpan(Typeface.BOLD), 10, 17, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color RED 1,2,3
        code1.setSpan(ForegroundColorSpan(Color.RED), 18, 19, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.RED), 21, 22, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code1.setSpan(ForegroundColorSpan(Color.RED), 24, 25, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example1.text = code1

        val description2 = findViewById<TextView>(R.id.description2)
        val spannable2 =
            SpannableStringBuilder("In an array the elements are ordered and each has a specific and constant position, which is called an index. To access an array element by its index, the index operator [] should be used.\n")

        // bold red index and index operator []
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 103, 108, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 103, 108, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(ForegroundColorSpan(Color.RED), 155, 172, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable2.setSpan(StyleSpan(Typeface.BOLD), 155, 172, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description2.text = spannable2

        val example2 = findViewById<TextView>(R.id.code_example2)
        val code2 = SpannableStringBuilder(
            "var arr = arrayOf(1, 2, 3);\n"
                    + "println(arr[0]);\n"
                    + "println(arr[1]);\n"
                    + "println(arr[2]);\n"
        )
        // color and bold black arrayOf,
        code2.setSpan(ForegroundColorSpan(Color.BLACK), 10, 17, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(StyleSpan(Typeface.BOLD), 10, 17, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color red 1,2,3, 0,1,2
        code2.setSpan(ForegroundColorSpan(Color.RED), 18, 19, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(ForegroundColorSpan(Color.RED), 21, 22, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(ForegroundColorSpan(Color.RED), 24, 25, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(ForegroundColorSpan(Color.RED), 40, 41, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(ForegroundColorSpan(Color.RED), 57, 58, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code2.setSpan(ForegroundColorSpan(Color.RED), 74, 75, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        example2.text = code2

        val description3 = findViewById<TextView>(R.id.description3)
        val spannable3 =
            SpannableStringBuilder("Kotlin supports specialised classes to represent arrays of primitive types. ByteArray, ShortArray, IntArray and so on.\n"
                    + "Here’s an example of declaring an IntArray array. Note the intArrayOf() library function that creates and returns an intArray:\n")

        // bold red ByteArray ... IntArray, inArrayOf(), intArray
        spannable3.setSpan(ForegroundColorSpan(Color.RED), 76, 107, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(StyleSpan(Typeface.BOLD), 76, 107, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(ForegroundColorSpan(Color.RED), 177, 189, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(StyleSpan(Typeface.BOLD), 177, 189, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(ForegroundColorSpan(Color.RED), 235, 243, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable3.setSpan(StyleSpan(Typeface.BOLD), 235, 243, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description3.text = spannable3

        val example3 = findViewById<TextView>(R.id.code_example3)
        val code3 = SpannableStringBuilder(
            "var nums: IntArray = intArrayOf(4, 13, 25, 6, -2);\n"
                    + "println(“Printing 1st and last elements”);\n"
                    + "println(nums[0]);\n"
                    + "println(nums[4]);\n"
        )

        // color and bold black intArray, intArrayOf
        code3.setSpan(ForegroundColorSpan(Color.BLACK), 10, 18, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(StyleSpan(Typeface.BOLD), 10, 18, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(ForegroundColorSpan(Color.BLACK), 21, 31, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(StyleSpan(Typeface.BOLD), 21, 31, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color blue "Printing 1st and last elements"
        code3.setSpan(ForegroundColorSpan(Color.BLUE), 59, 91, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        // color RED numbers
        code3.setSpan(ForegroundColorSpan(Color.RED), 32, 33, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(ForegroundColorSpan(Color.RED), 35, 37, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(ForegroundColorSpan(Color.RED), 39, 41, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(ForegroundColorSpan(Color.RED), 43, 44, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(ForegroundColorSpan(Color.RED), 46, 48, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(ForegroundColorSpan(Color.RED), 107, 108, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        code3.setSpan(ForegroundColorSpan(Color.RED), 125, 126, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        example3.text = code3

        val description4 = findViewById<TextView>(R.id.description4)
        val spannable4=
            SpannableStringBuilder("Note that elements in the array are identified with zero-based index numbers, meaning that the first element’s index is 0  rather than one.\n"
                    + "Thus, the maximum index of the 5-element array is 4.\n")

        // bold red
        spannable4.setSpan(ForegroundColorSpan(Color.RED), 52, 62, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(StyleSpan(Typeface.BOLD), 52, 62, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(ForegroundColorSpan(Color.RED), 120, 121, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(StyleSpan(Typeface.BOLD), 120, 121, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(ForegroundColorSpan(Color.RED), 190, 191, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        spannable4.setSpan(StyleSpan(Typeface.BOLD), 190, 191, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        description4.text = spannable4

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView_Bar)
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(0)
        menuItem.isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> {
                    val intent1 = Intent(this@ActivityArray, ActivityHome::class.java)
                    startActivity(intent1)
                }
                R.id.ic_video -> {
                    val intent2 = Intent(this@ActivityArray, ActivityVideosPage::class.java)
                    startActivity(intent2)
                }
                R.id.ic_onlineCode -> {
                    val intent3 = Intent(this@ActivityArray, ActivityNotes::class.java)
                    startActivity(intent3)
                }
                R.id.ic_game -> {
                    val intent4 = Intent(this@ActivityArray, ActivityGame::class.java)
                    startActivity(intent4)
                }
                R.id.ic_disclaimer-> {
                    val intent5 = Intent(this@ActivityArray, ActivityDisclaimer::class.java)
                    startActivity(intent5)
                }
            }
            false
        }
    }
}
