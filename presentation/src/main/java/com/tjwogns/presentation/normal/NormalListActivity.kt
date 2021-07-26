package com.tjwogns.presentation.normal

import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.tjwogns.presentation.R
import com.tjwogns.presentation.base.BaseActivity
import com.tjwogns.presentation.databinding.ActivityNomalListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NormalListActivity : BaseActivity<ActivityNomalListBinding, NormalListViewModel>(R.layout.activity_nomal_list) {

    override val viewModel: NormalListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setAdapter()

        subscribeToLiveData()
    }

    private fun setAdapter() {
        binding.rvBreeds.layoutManager = LinearLayoutManager(this)
        binding.rvBreeds.adapter = NormalBreedAdapter(applicationContext)
    }

    private fun subscribeToLiveData() {
        viewModel.breeds.observe(this) {
            (binding.rvBreeds.adapter as NormalBreedAdapter).setItems(it)
        }
    }
}