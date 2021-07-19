package com.tjwogns.presentation

import android.os.Bundle
import androidx.activity.viewModels
import com.tjwogns.presentation.base.BaseActivity
import com.tjwogns.presentation.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {

    override val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setListener()

        subscribeToLiveData()
    }

    private fun setListener() {
        binding.btnLoad.setOnClickListener {
            viewModel.getBreeds()
        }
    }

    private fun subscribeToLiveData() {
        viewModel.breeds.observe(this) {
            println("!!! List Size : ${it.size} !!!")
            it.forEachIndexed { index, breed ->
                println("!!! it $index : ${breed.id}, ${breed.altNames}")
            }
        }
    }
}