package com.tjwogns.presentation.paging2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagedList
import com.tjwogns.domain.model.BreedSnippet
import com.tjwogns.domain.usecase.BreedUseCase
import com.tjwogns.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Paging2ListViewModel @Inject constructor(
    private val breedUseCase: BreedUseCase
): BaseViewModel() {

    private val _breeds = MutableLiveData<PagedList<BreedSnippet>>()
    val breeds: LiveData<PagedList<BreedSnippet>> = _breeds

    init {
//        getBreeds()
    }

    private fun getBreeds() {
//        breedUseCase(viewModelScope) { result ->
//            _breeds.value = result.map { BreedSnippet(it) }
//        }
    }
}