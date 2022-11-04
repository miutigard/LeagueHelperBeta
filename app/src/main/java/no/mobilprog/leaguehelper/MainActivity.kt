package no.mobilprog.leaguehelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import no.mobilprog.leaguehelper.data.Item
import no.mobilprog.leaguehelper.data.ItemRoomDatabase
import no.mobilprog.leaguehelper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()  {

    private lateinit var binding : ActivityMainBinding
    private lateinit var itemDb : ItemRoomDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.bottomNav

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        navView.setupWithNavController(navController)

        itemDb = ItemRoomDatabase.getDatabase(this)
        readData()
    }

    private fun readData() {
        lateinit var item: Item

        GlobalScope.launch {
            item = itemDb.itemDao().findByName("Bloodthirster")

        }
    }

}