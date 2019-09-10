package sg.edu.nus.learnkotlin

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.text.SpannableStringBuilder
import android.widget.TextView

class ActivityDisclaimer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disclaimer)

        val description1 = findViewById<TextView>(R.id.description1)
        val spannable1 = SpannableStringBuilder(
            "PLEASE READ THESE TERMS AND CONDITIONS CAREFULLY\n\n" +
            "THE SITE IS PROVIDED ON AN AS-IS AND AS-AVAILABLE BASIS. YOU AGREE THAT YOUR USE OF THE SITE SERVICES WILL BE AT YOUR SOLE RISK. TO THE FULLEST EXTENT PERMITTED BY LAW, WE DISCLAIM ALL WARRANTIES, EXPRESS OR IMPLIED, IN CONNECTION WITH THE SITE AND YOUR USE THEREOF, INCLUDING, WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, AND NON-INFRINGEMENT.\n" +
                    "WE MAKE NO WARRANTIES OR REPRESENTATIONS ABOUT THE ACCURACY OR COMPLETENESS OF THE SITE’S CONTENT OR THE CONTENT OF ANY WEBSITES LINKED TO THIS SITE AND WE WILL ASSUME NO LIABILITY OR RESPONSIBILITY FOR ANY\n\n" +
                    "(1) ERRORS, MISTAKES, OR INACCURACIES OF CONTENT AND MATERIALS, \n" +
                    "(2) PERSONAL INJURY OR PROPERTY DAMAGE, OF ANY NATURE WHATSOEVER, RESULTING FROM YOUR ACCESS TO AND USE OF THE SITE, \n" +
                    "(3) ANY UNAUTHORIZED ACCESS TO OR USE OF OUR SECURE SERVERS AND/OR ANY AND ALL PERSONAL INFORMATION AND/OR FINANCIAL INFORMATION STORED THEREIN, \n" +
                    "(4) ANY INTERRUPTION OR CESSATION OF TRANSMISSION TO OR FROM THE SITE, \n" +
                    "(5) ANY BUGS, VIRUSES, TROJAN HORSES, OR THE LIKE WHICH MAY BE TRANSMITTED TO OR THROUGH THE SITE BY ANY THIRD PARTY, AND/OR \n" +
                    "(6) ANY ERRORS OR OMISSIONS IN ANY CONTENT AND MATERIALS OR FOR ANY LOSS OR DAMAGE OF ANY KIND INCURRED AS A RESULT OF THE USE OF ANY CONTENT POSTED, TRANSMITTED, OR OTHERWISE MADE AVAILABLE VIA THE SITE. \n\n" +
                    "WE DO NOT WARRANT, ENDORSE, GUARANTEE, OR ASSUME RESPONSIBILITY FOR ANY PRODUCT OR SERVICE ADVERTISED OR OFFERED BY A THIRD PARTY THROUGH THE SITE, ANY HYPERLINKED WEBSITE, OR ANY WEBSITE OR MOBILE APPLICATION FEATURED IN ANY BANNER OR OTHER ADVERTISING, AND WE WILL NOT BE A PARTY TO OR IN ANY WAY BE RESPONSIBLE FOR MONITORING ANY TRANSACTION BETWEEN YOU AND ANY THIRD-PARTY PROVIDERS OF PRODUCTS OR SERVICES.  AS WITH THE PURCHASE OF A PRODUCT OR SERVICE THROUGH ANY MEDIUM OR IN ANY ENVIRONMENT, YOU SHOULD USE YOUR BEST JUDGMENT AND EXERCISE CAUTION WHERE APPROPRIATE."
                     )

        description1.text = spannable1

        val description2 = findViewById<TextView>(R.id.description2)
        val spannable2 =
            SpannableStringBuilder("These Terms and Conditions constitute a legally binding agreement made between you, whether personally or on behalf of an " +
                    "entity (“you”) and Learn Kotlin (“we,” “us” or “our”), concerning your access to and use of the kotlinlang.org" +
                    " website as well as any other media form, media channel, mobile website or mobile application related, linked, or otherwise" +
                    " connected thereto (collectively, the “Site”). \n" +
                    "You agree that by accessing the Site, you have read, understood, and agree to be bound by all of these Terms and Conditions Use.  \n\n" +
                    "IF YOU DO NOT AGREE WITH ALL OF THESE TERMS and CONDITIONS, THEN YOU ARE EXPRESSLY PROHIBITED FROM USING THE SITE AND YOU MUST DISCONTINUE USE IMMEDIATELY."
            )

        description2.text = spannable2

        val description5 = findViewById<TextView>(R.id.description5)
        val spannable5 =
            SpannableStringBuilder("We care about data privacy and security. By using the Site, you agree to be bound by our Privacy Policy, which is incorporated into these Terms of Use.  \n\n" +
                    "If you access the Site from the European Union, Asia, or any other region of the world with laws or other requirements governing personal data collection, use, or disclosure that differ from applicable laws in the United States, then through your continued use of the Site or Services, you are transferring your data to the United States, and you expressly consent to have your data transferred to and processed in the United States. \n")

        description5.text = spannable5

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView_Bar)
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(0)
        menuItem.isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> {
                    val intent1 = Intent(this@ActivityDisclaimer, ActivityHome::class.java)
                    startActivity(intent1)
                }
                R.id.ic_video -> {
                    val intent2 = Intent(this@ActivityDisclaimer, ActivityVideosPage::class.java)
                    startActivity(intent2)
                }
                R.id.ic_onlineCode -> {
                    val intent3 = Intent(this@ActivityDisclaimer, ActivityNotes::class.java)
                    startActivity(intent3)
                }
                R.id.ic_game -> {
                    val intent4 = Intent(this@ActivityDisclaimer, ActivityGame::class.java)
                    startActivity(intent4)
                }
                R.id.ic_disclaimer-> {
                    val intent5 = Intent(this@ActivityDisclaimer, ActivityDisclaimer::class.java)
                    startActivity(intent5)
                }
            }
            false
        }

    }
}
