package com.tjwogns.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.tjwogns.domain.model.BreedSnippet
import com.tjwogns.domain.usecase.BreedUseCase
import com.tjwogns.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
): BaseViewModel() {
}