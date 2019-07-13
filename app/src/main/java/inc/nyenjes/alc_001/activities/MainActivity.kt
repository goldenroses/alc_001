package inc.nyenjes.alc_001.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.view.View
import android.widget.Toast
import inc.nyenjes.alc_001.R
import inc.nyenjes.alc_001.fragments.AlcFragment
import inc.nyenjes.alc_001.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showALCFragment(view: View) {
        print("Loaded ALC")
        Toast.makeText(this, "Loaded ALC", Toast.LENGTH_SHORT).show()
        val alcFragment : Fragment = AlcFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, alcFragment)
        fragmentTransaction.commit()
    }

    fun showProfileFragment(view: View) {
        print("Loaded profile")
        Toast.makeText(this, "Loaded Profile", Toast.LENGTH_SHORT).show()
        val profileFragment : Fragment = ProfileFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, profileFragment)
        fragmentTransaction.commit()
    }
}
