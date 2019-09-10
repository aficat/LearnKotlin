package sg.edu.nus.learnkotlin

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import android.webkit.WebViewClient

class ActivityNotes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val mywebview:WebView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        mywebview = findViewById<WebView>(R.id.webview)
        val webSettings = mywebview?.settings
        if (webSettings != null) {
            webSettings.javaScriptEnabled = true
        }
        mywebview?.loadUrl("https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS4zLjAiLCJwbGF0Zm9ybSI6ImphdmEiLCJhcmdzIjoiIiwibm9uZU1hcmtlcnMiOnRydWUsInRoZW1lIjoiaWRlYSIsImZvbGRlZEJ1dHRvbiI6dHJ1ZSwicmVhZE9ubHkiOmZhbHNlLCJjb2RlIjoiLyoqXG4gKiBZb3UgY2FuIGVkaXQsIHJ1biwgYW5kIHNoYXJlIHRoaXMgY29kZS4gXG4gKiBwbGF5LmtvdGxpbmxhbmcub3JnIFxuICovXG5cbmZ1biBtYWluKCkge1xuICAgIHByaW50bG4oXCJIZWxsbywgd29ybGQhISFcIilcbn0ifQ==")
        mywebview?.webViewClient = WebViewClient()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView_Bar)
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(0)
        menuItem.isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> {
                    val intent1 = Intent(this@ActivityNotes, ActivityHome::class.java)
                    startActivity(intent1)
                }
                R.id.ic_video -> {
                    val intent2 = Intent(this@ActivityNotes, ActivityVideosPage::class.java)
                    startActivity(intent2)
                }
                R.id.ic_onlineCode -> {
                    val intent3 = Intent(this@ActivityNotes, ActivityNotes::class.java)
                    startActivity(intent3)
                }
                R.id.ic_game -> {
                    val intent4 = Intent(this@ActivityNotes, ActivityGame::class.java)
                    startActivity(intent4)
                }
                R.id.ic_disclaimer-> {
                    val intent5 = Intent(this@ActivityNotes, ActivityDisclaimer::class.java)
                    startActivity(intent5)
                }
            }
            false
        }
    }
}
