package com.vitassalvantes.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vitassalvantes.affirmations.adapter.ItemAdapter
import com.vitassalvantes.affirmations.data.Datasource
import com.vitassalvantes.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize data
        val myDataset = Datasource().loadAffirmations()
        binding.recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        binding.recyclerView.setHasFixedSize(true)
    }
}