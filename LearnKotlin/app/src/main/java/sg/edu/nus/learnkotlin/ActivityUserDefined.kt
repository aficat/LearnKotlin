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

class ActivityUserDefined : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_defined)
        val intro = findViewById<TextView>(R.id.intro)
        val spannable1 = SpannableStringBuilder(
            "User defined function is a function which is created by user. User defined function takes " +
                    "the parameter(s), perform an action and return the result of that action as a value.\n" +
                    "\n" +
                    "Kotlin functions are declared using the fun keyword."
        )

        intro.setTextColor(Color.BLACK)
        intro.setText(spannable1)

        val input = findViewById<TextView>(R.id.input)
        input.setTextColor(Color.BLACK)
        val line1 = SpannableStringBuilder(" fun functionName() { \n")
        line1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val line2 = SpannableStringBuilder(" // body of function \n }")
        line2.setSpan(ForegroundColorSpan(Color.rgb(30, 105, 30)), 0, 20, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        line1.append(line2)

        input.setText(line1)

        val remark = findViewById<TextView>(R.id.remark)
        val display = "We have to call the function to run codes inside the body of the function."
        remark.setTextColor(Color.BLACK)
        remark.setText(display)

        val callFunction = findViewById<TextView>(R.id.callFunction)
        callFunction.setTextColor(Color.BLACK)
        val line = " functionName()"
        callFunction.setText(line)

        val simpleExample = findViewById<TextView>(R.id.simpleExample)
        val showSimpleExample = "\nKotlin simple function example"
        simpleExample.setText(showSimpleExample)

        val input2 = findViewById<TextView>(R.id.input2)
        input2.setTextColor(Color.BLACK)
        val input2Line1 = SpannableStringBuilder(" fun main(args: Array<String>) { \n   sum()\n")
        input2Line1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2Line1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val input2Line2 = SpannableStringBuilder("   print(\"code after sum\")\n }\n")
        input2Line2.setSpan(ForegroundColorSpan(Color.BLUE), 9, 25, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2Line1.append(input2Line2)

        val input2Line3 = SpannableStringBuilder(" fun sum() {\n")
        input2Line3.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2Line3.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2Line1.append(input2Line3)

        val input2Line4 = SpannableStringBuilder("   var num1 = 5 \n")
        input2Line4.setSpan(ForegroundColorSpan(Color.RED), 13, 15, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2Line1.append(input2Line4)

        val input2Line5 = SpannableStringBuilder("   var num2 = 6 \n ")
        input2Line5.setSpan(ForegroundColorSpan(Color.RED), 13, 15, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2Line1.append(input2Line5)

        val input2Line6 = SpannableStringBuilder("  println(\"sum = \" + (num1 + num2))\n }")
        input2Line6.setSpan(ForegroundColorSpan(Color.BLUE), 10, 19, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input2Line1.append(input2Line6)

        input2.setText(input2Line1)

        val output2 = findViewById<TextView>(R.id.output2)
        output2.setTextColor(Color.BLACK)
        val show = " sum = 11\n" +
                " code after sum"
        output2.setText(show)

        val parameterizeReturn = findViewById<TextView>(R.id.parameterizeAndReturn)
        val pshow = "\nKotlin Parameterize Function and Return Value\n"
        parameterizeReturn.setText(pshow)

        val pintro = findViewById<TextView>(R.id.pintro)
        pintro.setTextColor(Color.BLACK)
        val pintro1 = SpannableStringBuilder(
            "Functions are also takes parameter as arguments and return value. Kotlin functions are defined using Pascal " +
                    "notation, i.e. name:type (name of parameter and its type). Parameters in function are separated using commas.\n"
        )
        pintro1.setSpan(StyleSpan(Typeface.ITALIC), 120, 127, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)


        val pintro2 = SpannableStringBuilder(
            "If a function does not returns any value than its return type is Unit. It is optional to specify the return " +
                    "type of function definition which does not returns any value."
        )
        pintro2.setSpan(StyleSpan(Typeface.ITALIC), 65, 69, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        pintro1.append(pintro2)

        pintro.setText(pintro1)

        val input3 = findViewById<TextView>(R.id.input3)
        input3.setTextColor(Color.BLACK)
        val input3Line1 =
            SpannableStringBuilder(" fun functionName(number1: Int, number2: Int) {  \n .. .. ..\n }\n .. .. ..\n functionName(value1, value2) {\n .. .. ..\n }")
        input3Line1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input3Line1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input3.setText(input3Line1)

        val parameterize = findViewById<TextView>(R.id.parameterize)
        val parameterizeDisplay = "\nKotlin parameterize function example\n\n"
        parameterize.setText(parameterizeDisplay)

        val input4 = findViewById<TextView>(R.id.input4)
        input4.setTextColor(Color.BLACK)
        val input4Line1 = SpannableStringBuilder(" fun main(args: Array<String>) { \n")
        input4Line1.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input4Line1.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)

        val input4Line2 = SpannableStringBuilder("   val result = sum(5, ")
        input4Line2.setSpan(ForegroundColorSpan(Color.RED), 20, 21, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input4Line1.append(input4Line2)

        val input4Line3 = SpannableStringBuilder("6)\n   print(result)\n }\n")
        input4Line3.setSpan(ForegroundColorSpan(Color.RED), 0, 1, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input4Line1.append(input4Line3)

        val input4Line4 =
            SpannableStringBuilder(" fun sum(number1: Int, number2: Int): Int { \n   val add = number1 + number2  \n")
        input4Line4.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input4Line4.setSpan(StyleSpan(Typeface.BOLD), 0, 4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input4Line1.append(input4Line4)

        val input4Line5 = SpannableStringBuilder("   return add\n }")
        input4Line5.setSpan(ForegroundColorSpan(Color.rgb(40, 90, 165)), 0, 9, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input4Line5.setSpan((StyleSpan(Typeface.BOLD)), 0, 9, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        input4Line1.append(input4Line5)

        input4.setText(input4Line1)

        val output3 = findViewById<TextView>(R.id.output3)
        output3.setTextColor(Color.BLACK)
        val displayOutput3 = " 11"
        output3.setText(displayOutput3)

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
