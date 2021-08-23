package org.harundemir.youtube_kotlin

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetDialog
import org.harundemir.youtube_kotlin.databinding.ActivityMainBinding
import org.harundemir.youtube_kotlin.databinding.FragmentAddBottomSheetDialogBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.appBar)
        supportActionBar?.title = null

        val homeFragment = HomeFragment()
        val libraryFragment = LibraryFragment()

        setCurrentFragment(homeFragment)
        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    setCurrentFragment(homeFragment)
                }
                R.id.nav_add -> {
                    val dialog = BottomSheetDialog(this)
                    val bottomSheetDialogBinding = FragmentAddBottomSheetDialogBinding.inflate(layoutInflater, null, false)
                    dialog.setContentView(bottomSheetDialogBinding.root)
                    dialog.show()
                }
                R.id.nav_library -> {
                    setCurrentFragment(libraryFragment)
                }
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.tv_play -> Toast.makeText(applicationContext, "TV Play", Toast.LENGTH_SHORT).show()
            R.id.notifications -> Toast.makeText(
                applicationContext,
                "Notifications",
                Toast.LENGTH_SHORT
            ).show()
            R.id.search -> Toast.makeText(applicationContext, "Search", Toast.LENGTH_SHORT).show()
            R.id.account -> Toast.makeText(applicationContext, "Account", Toast.LENGTH_SHORT).show()
        }

        return false
    }
}