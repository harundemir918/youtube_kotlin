package org.harundemir.youtube_kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.harundemir.youtube_kotlin.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private var videoList = listOf<VideoListItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        binding = FragmentHomeBinding.inflate(layoutInflater)

        videoList = listOf(
            VideoListItem(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "YouTube Channel",
                "https://wallpaperaccess.com/full/284466.jpg",
                "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"
            ),
            VideoListItem(
                "Vestibulum luctus. Phasellus efficitur nibh nec egestas tincidunt.",
                "YouTube Channel",
                "https://wallpaperaccess.com/full/5451933.jpg",
                "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"
            ),
            VideoListItem(
                "Proin ultrices. Duis ante dui, blandit ac ex sit amet, varius dignissim nibh.",
                "YouTube Channel",
                "https://images.wallpaperscraft.com/image/mountains_moon_forest_139359_1280x720.jpg",
                "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"
            ),
            VideoListItem(
                "Integer ut nisl volutpat enim ornare tempus. Pellentesque dolor libero.",
                "YouTube Channel",
                "https://uhdwallpapers.org/uploads/converted/18/12/24/neon-sunset-1280x720_74456-mm-90.jpg",
                "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"
            ),
            VideoListItem(
                "Lacinia a urna. In sed fringilla risus, pharetra semper augue. Sed consequat.",
                "YouTube Channel",
                "https://wallpaperaccess.com/full/2601100.jpg",
                "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"
            )
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val videoRecyclerView = view.findViewById<RecyclerView>(R.id.videoRecyclerView)
        videoRecyclerView.adapter = VideoListAdapter(videoList)
        videoRecyclerView.layoutManager = LinearLayoutManager(activity)
        videoRecyclerView.setHasFixedSize(true)

        return view
    }
}