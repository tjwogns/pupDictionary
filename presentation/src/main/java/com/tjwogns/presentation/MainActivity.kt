package com.tjwogns.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tjwogns.presentation.base.BaseActivity
import com.tjwogns.presentation.databinding.ActivityMainBinding
import com.tjwogns.presentation.normal.NormalListActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {

    override val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setListener()
    }

    private fun setListener() {
        binding.btnNormal.setOnClickListener {
            startNormalListActivity()
        }
    }

    /**
     * 기본 리스트 화면으로 이동
     */
    private fun startNormalListActivity() {
        val intent = Intent(this, NormalListActivity::class.java)

        startActivity(intent)
    }
}