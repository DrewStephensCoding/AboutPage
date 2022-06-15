# AboutPage
Android library for easily creating an about page for your Android apps.

'''
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(AboutPage(this)
            .setBackground(androidx.appcompat.R.attr.colorPrimary)
            .setImage(R.mipmap.ic_launcher)
            .addItem(Item("Version: " + BuildConfig.VERSION_NAME))
            .addEmail("drewstephensdesigns@gmail.com")
            .addFacebook("andrewstephens")
            .addGithub("drewstephenscoding")
            .addInstagram("drewstephensdesigns")
            .addPlayStore("io.github.drewstephenscoding")
            .addLinkedIn("drewstephens")
            .addReddit("redoctobershtandingby")
            .addWebsite("https://github.com/DrewStephensCoding/DrewStephensCoding")
            .addItem(Item("Thank you for downloading", null, View.OnClickListener { Toast.makeText(this, "Enjoy!", Toast.LENGTH_SHORT).show() }))
            .create())
    }
}
'''

This library is based on:
-  [Android About Page](https://github.com/medyo/android-about-page) by [Mehdi Sakout](https://github.com/medyo) which was written entirely in Java. 
-  [About Page - Android](https://github.com/husaynhakeem/about-page-android/blob/master/README.md) by [husaynhakeem](https://github.com/husaynhakeem)
-  Designed with Dark Mode
-  Added Reddit Link
-  Added LinkedIn Link

This project is my first attempt at developing an Android Library 
