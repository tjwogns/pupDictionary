package com.tjwogns.presentation.paging2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.PagedList
import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.usecase.BreedUseCase
import com.tjwogns.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Paging2ListViewModel @Inject constructor(
    private val breedUseCase: BreedUseCase
): BaseViewModel() {

    private val _breeds = MutableLiveData<PagedList<Breed>>()
    val breeds: LiveData<PagedList<Breed>> = _breeds

    init {
//        getBreeds()
    }

    private fun getBreeds() {
//        breedUseCase(viewModelScope) { result ->
//            _breeds.value = result.map { BreedSnippet(it) }
//        }
    }
}