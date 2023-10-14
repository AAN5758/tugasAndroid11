package com.example.tugasandroid1011

import android.widget.ImageView
import androidx.databinding.BindingAdapter

class ViewHelper {

    companion object {
        @JvmStatic
        @BindingAdapter("imageSrc")
        fun ImageView.setImageSrc(imageSrc: Int?){
            imageSrc?.let {
                setImageResource(it)
            }
        }
    }
}