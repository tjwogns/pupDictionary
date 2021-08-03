package com.tjwogns.domain.repository

import androidx.paging.DataSource
import com.tjwogns.domain.model.Breed


interface Paging2BreedRepository {
    fun getPaging2Breeds(isRefresh: Boolean): DataSource.Factory<Int,Breed>
}