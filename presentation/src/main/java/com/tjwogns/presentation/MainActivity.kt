package com.tjwogns.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tjwogns.presentation.base.BaseActivity
import com.tjwogns.presentation.databinding.ActivityMainBinding
import com.tjwogns.presentation.normal.NormalListActivity
import com.tjwogns.presentation.paging2.Paging2ListActivity
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

        binding.btnPaging2.setOnClickListener {
            startPaging2ListActivity()
        }
    }

    /**
     * 기본 리스트 화면으로 이동
     */
    private fun startNormalListActivity() {
        val intent = Intent(this, NormalListActivity::class.java)

        startActivity(intent)
    }

    /**
     * Paging2 리스트 화면으로 이동
     */
    private fun startPaging2ListActivity() {
        val intent = Intent(this, Paging2ListActivity::class.java)

        startActivity(intent)
    }
}