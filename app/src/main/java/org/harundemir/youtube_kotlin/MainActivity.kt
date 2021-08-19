package org.harundemir.youtube_kotlin

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import org.harundemir.youtube_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = null

        val myCustomList = listOf(
            MyCustomItem(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "YouTube Channel",
                "https://wallpaperaccess.com/full/284466.jpg",
                "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"
            ),
            MyCustomItem(
                "Vestibulum luctus. Phasellus efficitur nibh nec egestas tincidunt.",
                "YouTube Channel",
                "https://wallpaperaccess.com/full/5451933.jpg",
                "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"
            ),
            MyCustomItem(
                "Proin ultrices. Duis ante dui, blandit ac ex sit amet, varius dignissim nibh.",
                "YouTube Channel",
                "https://images.wallpaperscraft.com/image/mountains_moon_forest_139359_1280x720.jpg",
                "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"
            ),
            MyCustomItem(
                "Integer ut nisl volutpat enim ornare tempus. Pellentesque dolor libero.",
                "YouTube Channel",
                "https://uhdwallpapers.org/uploads/converted/18/12/24/neon-sunset-1280x720_74456-mm-90.jpg",
                "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"
            ),
            MyCustomItem(
                "Lacinia a urna. In sed fringilla risus, pharetra semper augue. Sed consequat.",
                "YouTube Channel",
                "https://wallpaperaccess.com/full/2601100.jpg",
                "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"
            )
        )

        binding.mainListView.adapter = MyCustomAdapter(myCustomList)
        binding.mainListView.layoutManager = LinearLayoutManager(this)
        binding.mainListView.setHasFixedSize(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.tv_play -> Toast.makeText(applicationContext, "TV Play", Toast.LENGTH_SHORT).show()
            R.id.notifications -> Toast.makeText(applicationContext, "Notifications", Toast.LENGTH_SHORT).show()
            R.id.search -> Toast.makeText(applicationContext, "Search", Toast.LENGTH_SHORT).show()
            R.id.account -> Toast.makeText(applicationContext, "Account", Toast.LENGTH_SHORT).show()
        }

        return false
    }
}