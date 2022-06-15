# AboutPage
Android library for easily creating an about page for your Android apps.

```kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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
```

This library is based on:
-  [Android About Page](https://github.com/medyo/android-about-page) by [Mehdi Sakout](https://github.com/medyo) which was written entirely in Java. 
-  [About Page - Android](https://github.com/husaynhakeem/about-page-android/blob/master/README.md) by [husaynhakeem](https://github.com/husaynhakeem)
-  Designed with Dark Mode
-  Added Reddit Link
-  Added LinkedIn Link

This project is my first attempt at developing an Android Library 


### Download
1. Add below code in your root build.gradle at the end of repositories
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
2. Add the dependency
```groovy
dependencies {
    implementation 'com.github.DrewStephensCoding:AboutPage:0.1.0'
}
```
### Sample application
For additional information on how to use this library, check out the [sample application](https://github.com/DrewStephensCoding/AboutPage/tree/master/app).

![alt text](https://github.com/DrewStephensCoding/AboutPage/blob/master/AboutPagePoster.png)

### Contributing
If you would like to contribute code you can do so through GitHub by forking the repository and sending a pull request.
When submitting code, please make every effort to follow existing conventions and style in order to keep the code as readable as possible.
