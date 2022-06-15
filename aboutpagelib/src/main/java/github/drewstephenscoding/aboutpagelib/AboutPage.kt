package github.drewstephenscoding.aboutpagelib

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.about_page.view.*
import kotlinx.android.synthetic.main.layout_item.view.*

class AboutPage(var context: Context) {

    private var layoutInflater: LayoutInflater
    private var rootView: View
    private var elementsGroup: ViewGroup

    init {
        layoutInflater = LayoutInflater.from(context)
        rootView = layoutInflater.inflate(R.layout.about_page, null, false)
        elementsGroup = rootView.findViewById(R.id.ll_elements)
    }

    fun setBackground(background: Int): AboutPage {
        setViewBackground(context, rootView, background)
        return this
    }

    fun setImage(@DrawableRes logoResId: Int): AboutPage {
        rootView.iv_logo.setImageDrawable(ContextCompat.getDrawable(context, logoResId))
        return this
    }

    fun setDescription(@StringRes stringResId: Int): AboutPage {
        return setDescription(context.getString(stringResId))
    }

    fun setDescription(text: String): AboutPage {
        rootView.tv_description.text = text
        return this
    }

    fun addEmail(email: String): AboutPage {
        return addEmail(context.getString(R.string.title_email), email)
    }

    fun addEmail(title: String, email: String): AboutPage {
        val itemView = addItem(layoutInflater, context, elementsGroup, R.drawable.ic_email, R.color.tint_email, title)
        itemView.setOnClickListener({ sendEmail(context, email) })
        itemView.tv_item_title.resources.getColor(R.color.separator_gray)

        return this
    }

    fun addWebsite(websiteUrl: String): AboutPage {
        return addWebsite(context.getString(R.string.title_website), websiteUrl)
    }

    fun addWebsite(title: String, websiteUrl: String): AboutPage {
        val itemView = addItem(layoutInflater, context, elementsGroup, R.drawable.ic_website, R.color.tint_website, title)
        itemView.setOnClickListener({ openWebPage(context, websiteUrl) })
        itemView.tv_item_title.resources.getColor(R.color.separator_gray)

        return this
    }

    fun addFacebook(facebookUsername: String): AboutPage {
        return addFacebook(context.getString(R.string.title_facebook), facebookUsername)
    }

    fun addFacebook(title: String, facebookUsername: String): AboutPage {
        val itemView = addItem(layoutInflater, context, elementsGroup, R.drawable.ic_facebook, R.color.tint_facebook, title)
        itemView.setOnClickListener({ openFacebookPage(context, facebookUsername) })
        itemView.tv_item_title.resources.getColor(R.color.separator_gray)

        return this
    }

    fun addTwitter(twitterId: String): AboutPage {
        return addTwitter(context.getString(R.string.title_twitter), twitterId)
    }

    fun addTwitter(title: String, twitterId: String): AboutPage {
        val itemView = addItem(layoutInflater, context, elementsGroup, R.drawable.ic_twitter, R.color.tint_twitter, title)
        itemView.setOnClickListener({ openTwitter(context, twitterId) })
        itemView.tv_item_title.resources.getColor(R.color.separator_gray)

        return this
    }

    fun addYoutube(youtubeChannel: String): AboutPage {
        return addYoutube(context.getString(R.string.title_youtube), youtubeChannel)
    }

    fun addYoutube(title: String, youtubeChannel: String): AboutPage {
        val itemView = addItem(layoutInflater, context, elementsGroup, R.drawable.ic_youtube, R.color.tint_youtube, title)
        itemView.setOnClickListener({ openYoutube(context, youtubeChannel) })
        itemView.tv_item_title.resources.getColor(R.color.separator_gray)

        return this
    }

    fun addPlayStore(playStoreId: String): AboutPage {
        return addPlayStore(context.getString(R.string.title_playstore), playStoreId)
    }

    fun addPlayStore(title: String, playStoreId: String): AboutPage {
        val itemView = addItem(layoutInflater, context, elementsGroup, R.drawable.ic_playstore, R.color.tint_playstore, title)
        itemView.setOnClickListener({ openPlayStore(context, playStoreId) })
        itemView.tv_item_title.resources.getColor(R.color.separator_gray)
        return this
    }

    fun addInstagram(userId: String): AboutPage {
        return addInstagram(context.getString(R.string.title_instagram), userId)
    }

    fun addInstagram(title: String, userId: String): AboutPage {
        val itemView = addItem(layoutInflater, context, elementsGroup, R.drawable.ic_instagram, R.color.tint_instagram, title)
        itemView.setOnClickListener({ openInstagram(context, userId) })
        itemView.tv_item_title.resources.getColor(R.color.separator_gray)

        return this
    }

    fun addGithub(userId: String): AboutPage {
        return addGithub(context.getString(R.string.title_github), userId)
    }

    fun addGithub(title: String, userId: String): AboutPage {
        val itemView = addItem(layoutInflater, context, elementsGroup, R.drawable.ic_github, R.color.tint_github, title)
        itemView.setOnClickListener({ openGithub(context, userId) })
        itemView.tv_item_title.resources.getColor(R.color.separator_gray)
        return this
    }

    fun addReddit(userId: String): AboutPage {
        return addReddit("Follow Us on Reddit",userId)
    }

    fun addReddit(title: String, userId: String): AboutPage {
        val itemView = addItem(layoutInflater, context, elementsGroup, R.drawable.ic_reddit, R.color.tint_reddit, title)
        itemView.setOnClickListener({ openReddit(context, userId) })
        itemView.tv_item_title.resources.getColor(R.color.separator_gray)
        return this
    }

    fun addLinkedIn(userId: String): AboutPage {
        return addLinkedIn("Follow Us on LinkedIn",userId)
    }

    fun addLinkedIn(title: String, userId: String): AboutPage {
        val itemView = addItem(layoutInflater, context, elementsGroup, R.drawable.ic_linkedin, R.color.tint_linked, title)
        itemView.setOnClickListener({ openLinkedIn(context, userId) })
        itemView.tv_item_title.resources.getColor(R.color.separator_gray)
        return this
    }


    fun addItem(view: View): AboutPage {
        addItem(layoutInflater, context, elementsGroup, view)
        return this
    }

    fun addItem(item: Item): AboutPage {
        addItem(layoutInflater, context, elementsGroup, item)
        return this
    }

    fun create(): View {
        return this.rootView
    }
}