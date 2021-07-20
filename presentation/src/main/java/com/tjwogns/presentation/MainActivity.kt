package com.tjwogns.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.tjwogns.presentation.base.BaseActivity
import com.tjwogns.presentation.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {

    override val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setListener()

        setAdapter()

        subscribeToLiveData()
    }

    private fun setListener() {
        binding.btnLoad.setOnClickListener {
            viewModel.getBreeds()
        }
    }

    private fun setAdapter() {
        binding.rvBreeds.layoutManager = LinearLayoutManager(this)
        binding.rvBreeds.adapter = BreedAdapter()
    }

    private fun subscribeToLiveData() {
        viewModel.breeds.observe(this) {
            (binding.rvBreeds.adapter as BreedAdapter).setItems(it)
        }
    }
}