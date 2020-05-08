package com.example.sopthw2_1_1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class InstaViewHolder(itemView: View) : RecyclerView.ViewHolder (itemView) {
    val tv_username = itemView.findViewById<TextView> (R.id.tv_username)
    val img_profile = itemView.findViewById<ImageView> (R.id.img_profile)
    val img_contents = itemView.findViewById<ImageView> (R.id.img_contents)

    fun bind (instaData: InstaData) {
        tv_username.text = instaData.userName
        Glide.with(itemView).load(instaData.img_profile).into(img_profile)
        Glide.with(itemView).load(instaData.img_contents).into(img_contents)
    }
}