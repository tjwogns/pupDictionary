package com.tjwogns.presentation.paging2

import androidx.paging.toLiveData
import com.tjwogns.domain.usecase.Paging2BreedUseCase
import com.tjwogns.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Paging2ListViewModel @Inject constructor(
    private val breedUseCase: Paging2BreedUseCase
): BaseViewModel() {

//    private val _breeds = breedUseCase().toLiveData(20)

}