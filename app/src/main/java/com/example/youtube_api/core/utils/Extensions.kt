package com.example.youtube_api.core.utilsimport android.widget.ImageViewimport com.bumptech.glide.Glidefun ImageView.loadImage(image:String) {    Glide.with(this).load(image).into(this)}