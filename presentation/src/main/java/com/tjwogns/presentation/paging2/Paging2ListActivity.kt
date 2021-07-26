package com.tjwogns.presentation.paging2

import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.tjwogns.presentation.R
import com.tjwogns.presentation.base.BaseActivity
import com.tjwogns.presentation.databinding.ActivityNomalListBinding
import com.tjwogns.presentation.databinding.ActivityPaging2ListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Paging2ListActivity : BaseActivity<ActivityPaging2ListBinding, Paging2ListViewModel>(R.layout.activity_paging2_list) {

    override val viewModel: Paging2ListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setAdapter()

        subscribeToLiveData()
    }

    private fun setAdapter() {
//        binding.rvBreeds.layoutManager = LinearLayoutManager(this)
//        binding.rvBreeds.adapter = NormalBreedAdapter(applicationContext)
    }

    private fun subscribeToLiveData() {
//        viewModel.breeds.observe(this) {
//            (binding.rvBreeds.adapter as NormalBreedAdapter).setItems(it)
//        }
    }
}