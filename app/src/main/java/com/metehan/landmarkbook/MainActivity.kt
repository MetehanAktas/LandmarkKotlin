package com.metehan.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.metehan.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarklist : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarklist = ArrayList<Landmark>()

        val pisa = Landmark("Pisa","Italy",R.drawable.pisa)
        val eiffel = Landmark("Eiffel","France",R.drawable.eifel)
        val londonBridge = Landmark("London Bridge","England",R.drawable.londonbrige)

        landmarklist.add(pisa)
        landmarklist.add(eiffel)
        landmarklist.add(londonBridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarklist)
        binding.recyclerView.adapter = landmarkAdapter

    }


}