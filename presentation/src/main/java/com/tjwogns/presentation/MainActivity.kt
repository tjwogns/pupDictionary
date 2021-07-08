package com.tjwogns.presentation

import android.os.Bundle
import androidx.activity.viewModels
import com.tjwogns.presentation.base.BaseActivity
import com.tjwogns.presentation.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {

    override val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
}