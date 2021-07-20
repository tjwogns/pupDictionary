package com.tjwogns.presentation

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@BindingAdapter("imgResId")
fun setImageResource(v: ImageView, resId: Int) {
    Glide.with(v.context)
        .load(resId)
        .apply(RequestOptions().centerCrop())
        .into(v)
}

@BindingAdapter("imgResUrl")
fun setImageResource(v: ImageView, resUrl: String) {
    Glide.with(v.context)
        .load(resUrl)
        .apply(RequestOptions().centerCrop())
        .into(v)
}