package com.example.datafromfragmenttofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.example.datafromfragmenttofragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openFrag(OneFragment.newInstance(), R.id.OneFrame)
        openFrag(TwoFragment.newInstance(), R.id.TwoFrame)

    }

    private fun openFrag(f: Fragment, idHolder: Int) {
        supportFragmentManager
            .beginTransaction()
            .replace(idHolder, f)
            .commit()
    }
}