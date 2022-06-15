package github.drewstephenscoding.aboutpagelib

import android.content.Context
import android.content.res.Resources
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.layout_item.view.*

private val TAG = "About Page"
private val RESOURCE_TYPE_DRAWABLE = "drawable"
private val RESOURCE_TYPE_COLOR = "color"

internal fun addItem(layoutInflater: LayoutInflater, context: Context, elementsGroup: ViewGroup, @DrawableRes icon: Int, @ColorRes iconTint: Int, title: String): View {
    val itemView = viewFromItem(layoutInflater, context, icon, iconTint, title)
    elementsGroup.addView(itemView)
    addSeparator(layoutInflater, context, elementsGroup)
    return itemView
}

internal fun addItem(layoutInflater: LayoutInflater, context: Context, elementsGroup: ViewGroup, view: View) {
    elementsGroup.addView(view)
    addSeparator(layoutInflater, context, elementsGroup)
}

internal fun addItem(layoutInflater: LayoutInflater, context: Context, elementsGroup: ViewGroup, item: Item) {
    val itemView = layoutInflater.inflate(R.layout.layout_item, null)
    itemView.tv_item_title.text = item.title
    when (item.icon) {
        null -> itemView.iv_item_icon.visibility = View.GONE
        else -> itemView.iv_item_icon.setImageDrawable(ContextCompat.getDrawable(context, item.icon))
    }
    itemView.setOnClickListener(item.onClickListener)
    addItem(layoutInflater, context, elementsGroup, itemView)
}

private fun viewFromItem(layoutInflater: LayoutInflater, context: Context, @DrawableRes icon: Int, @ColorRes iconTint: Int, title: String): View {
    val itemView = layoutInflater.inflate(R.layout.layout_item, null)
    itemView.iv_item_icon.setImageDrawable(ContextCompat.getDrawable(context, icon))
    itemView.iv_item_icon.setColorFilter(ContextCompat.getColor(context, iconTint), android.graphics.PorterDuff.Mode.SRC_IN);
    itemView.tv_item_title.text = title
    return itemView
}

private fun addSeparator(layoutInflater: LayoutInflater, context: Context, elementsGroup: ViewGroup) {
    elementsGroup.addView(layoutInflater.inflate(R.layout.layout_seperator, null), ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, context.resources.getDimensionPixelSize(R.dimen.separator_height)))
}

internal fun setViewBackground(context: Context, view: View, background: Int) {
    try {
        when (context.resources.getResourceTypeName(background)) {
            RESOURCE_TYPE_DRAWABLE -> view.background = ContextCompat.getDrawable(context, background)
            RESOURCE_TYPE_COLOR -> view.setBackgroundColor(ContextCompat.getColor(context, background))
            else -> throw Resources.NotFoundException("Background resource must be a drawable or color")
        }
    } catch (e: Resources.NotFoundException) {
        e.message?.let { Log.e(TAG, it) }
    }
}