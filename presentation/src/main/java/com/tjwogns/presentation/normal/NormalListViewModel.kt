package com.tjwogns.presentation.normal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.tjwogns.domain.model.BreedSnippet
import com.tjwogns.domain.usecase.BreedUseCase
import com.tjwogns.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NormalListViewModel @Inject constructor(
    private val breedUseCase: BreedUseCase
): BaseViewModel() {

    private val _breeds = MutableLiveData<List<BreedSnippet>>()
    val breeds: LiveData<List<BreedSnippet>> = _breeds

    init {
        getBreeds()
    }

    private fun getBreeds() {
        breedUseCase(viewModelScope) { result ->
            _breeds.value = result.map { BreedSnippet(it) }
        }
    }
}