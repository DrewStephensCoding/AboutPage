package github.drewstephenscoding.aboutpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import github.drewstephenscoding.aboutpagelib.AboutPage
import github.drewstephenscoding.aboutpagelib.Item

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
            .addWebsite("https://github.com/DrewStephensCoding/DrewStephensCoding")
            .addItem(Item("Thank you for downloading", null, View.OnClickListener { Toast.makeText(this, "Enjoy!", Toast.LENGTH_SHORT).show() }))
            .create())
    }
}