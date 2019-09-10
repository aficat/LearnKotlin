package sg.edu.nus.learnkotlin

import android.content.Intent
import android.media.AudioManager
import android.media.SoundPool
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.View

class ActivityGame : AppCompatActivity() {

    /*init {
        instance = this
    }

    companion object {
        private var instance: ActivityGame? = null

        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
    }*/

    private var sp = SoundPool(2, AudioManager.STREAM_MUSIC, 0)
    private var sound1: Int = 0
    private var sound2: Int = 0
    private var sound3: Int = 0
    private var sound4: Int = 0
    private var sound5: Int = 0
    private var sound6: Int = 0
    private var sound7: Int = 0
    private var sound8: Int = 0

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

            //val context: Context = ActivityGame.applicationContext()


            sp = SoundPool(2, AudioManager.STREAM_MUSIC, 0)

            sound1 = sp.load(this@ActivityGame,R.raw.c4,1)
            sound2 = sp.load(this@ActivityGame,R.raw.d4,1)
            sound3 = sp.load(this@ActivityGame,R.raw.e4,1)
            sound4 = sp.load(this@ActivityGame,R.raw.f4,1)
            sound5 = sp.load(this@ActivityGame,R.raw.g4,1)
            sound6 = sp.load(this@ActivityGame,R.raw.a4,1)
            sound7 = sp.load(this@ActivityGame,R.raw.b4,1)
            sound8 = sp.load(this@ActivityGame,R.raw.c5,1)

            val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView_Bar)
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(0)
        menuItem.isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> {
                    val intent1 = Intent(this@ActivityGame, ActivityHome::class.java)
                    startActivity(intent1)
                }
                R.id.ic_video -> {
                    val intent2 = Intent(this@ActivityGame, ActivityVideosPage::class.java)
                    startActivity(intent2)
                }
                R.id.ic_onlineCode -> {
                    val intent3 = Intent(this@ActivityGame, ActivityNotes::class.java)
                    startActivity(intent3)
                }
                R.id.ic_game -> {
                    val intent4 = Intent(this@ActivityGame, ActivityGame::class.java)
                    startActivity(intent4)
                }
                R.id.ic_disclaimer-> {
                    val intent5 = Intent(this@ActivityGame, ActivityDisclaimer::class.java)
                    startActivity(intent5)
                }
            }
            false
        }
        }

    fun playsound1 (v: View){
        sp.play(sound1,1.0f,1.0f,0,0,10f)
    }

    fun playsound2 (v: View){
        sp.play(sound2,1.0f,1.0f,0,0,10f)
    }

    fun playsound3 (v: View){
        sp.play(sound3,1.0f,1.0f,0,0,10f)
    }

    fun playsound4(v: View){
        sp.play(sound4,1.0f,1.0f,0,0,10f)
    }

    fun playsound5(v: View){
        sp.play(sound5,1.0f,1.0f,0,0,10f)
    }

    fun playsound6(v: View){
        sp.play(sound6,1.0f,1.0f,0,0,10f)
    }

    fun playsound7(v: View){
        sp.play(sound7,1.0f,1.0f,0,0,10f)
    }

    fun playsound8(v: View){
        sp.play(sound8,1.0f,1.0f,0,0,10f)
    }
}
