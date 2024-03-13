package cn.dreamtobe.okdownload.benchmark

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.dreamtobe.okdownload.benchmark.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bindding : ActivityMainBinding

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                bindding.message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                bindding.message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                bindding.message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindding.root)
        bindding.navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
