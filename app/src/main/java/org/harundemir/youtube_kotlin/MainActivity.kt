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
            MyCustomItem("Lorem ipsum dolor sit amet, consectetur adipiscing elit.", "YouTube Channel", "https://wallpaperaccess.com/full/284466.jpg", "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"),
            MyCustomItem("Vestibulum eleifend bibendum luctus. Phasellus efficitur nibh nec egestas tincidunt.", "YouTube Channel", "https://wallpaperaccess.com/full/5451933.jpg", "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"),
            MyCustomItem("Proin tincidunt tristique ultrices. Duis ante dui, blandit ac ex sit amet, varius dignissim nibh.", "YouTube Channel", "https://images.wallpaperscraft.com/image/mountains_moon_forest_139359_1280x720.jpg", "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"),
            MyCustomItem("Integer ut nisl volutpat enim ornare tempus. Pellentesque dolor libero.", "YouTube Channel", "https://uhdwallpapers.org/uploads/converted/18/12/24/neon-sunset-1280x720_74456-mm-90.jpg", "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png"),
            MyCustomItem("Lacinia a urna. In sed fringilla risus, pharetra semper augue. Sed consequat.", "YouTube Channel", "https://wallpaperaccess.com/full/2601100.jpg", "https://icons.iconarchive.com/icons/danleech/simple/1024/android-icon.png")
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

//    private class MyCustomAdapter(context: Context): BaseAdapter() {
//
//        private val mContext: Context = context
//
//        private val names = arrayListOf(
//            "Donald Trump",
//            "Steve Jobs",
//            "Tim Cook",
//            "Mark Zuckerberg",
//            "Barack Obama"
//        )
//
//        // responsible for how many rows in the list
//        override fun getCount(): Int {
//            return names.size
//        }
//
//        // ignore this for now
//        override fun getItem(position: Int): Any {
//            return "TEST STRING"
//        }
//
//        // ignore this for now
//        override fun getItemId(position: Int): Long {
//            return position.toLong()
//        }
//
//        // responsible for rendering out each row
//        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//            val layoutInflater = LayoutInflater.from(mContext)
//            val rowMain = layoutInflater.inflate(R.layout.row_main, parent,false)
//
//            val nameTextView = rowMain.findViewById<TextView>(R.id.name_textView)
//            nameTextView.text = "Name: ${names[position]}"
//
//            val positionTextView = rowMain.findViewById<TextView>(R.id.position_textView)
//            positionTextView.text = "Row number: $position"
//            return rowMain
////            val textView = TextView(mContext)
////            textView.text = "Here is my row $position for my listview"
////            return textView
//        }
//
//    }
}