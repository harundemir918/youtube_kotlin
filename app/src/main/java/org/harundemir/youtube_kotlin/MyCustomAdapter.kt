package org.harundemir.youtube_kotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import org.harundemir.youtube_kotlin.databinding.RowMainBinding

class MyCustomAdapter(private val myCustomList: List<MyCustomItem>) :
    RecyclerView.Adapter<MyCustomAdapter.MyCustomViewHolder>() {

    class MyCustomViewHolder(val binding: RowMainBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCustomViewHolder {
        return MyCustomViewHolder(RowMainBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MyCustomViewHolder, position: Int) {
        val currentItem = myCustomList[position]
        holder.binding.textViewVideoTitle.text = currentItem.videoTitle
        holder.binding.textViewChannelTitle.text = "${currentItem.channelName} • 20K views • 5 months ago"

        Picasso.get().load(currentItem.videoThumbnail).resize(1100, 600).into(holder.binding.imageViewVideoThumbnail);
        Picasso.get().load(currentItem.videoChannelProfile).into(holder.binding.imageViewChannelProfile);
    }
    override fun getItemCount() = myCustomList.size
}