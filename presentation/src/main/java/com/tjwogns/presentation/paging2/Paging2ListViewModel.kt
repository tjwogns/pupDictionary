package com.tjwogns.presentation.paging2

import com.tjwogns.domain.usecase.Paging2BreedUseCase
import com.tjwogns.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Paging2ListViewModel @Inject constructor(
    private val breedUseCase: Paging2BreedUseCase
): BaseViewModel() {
//    val breeds: PagedList


    init {
        val factory = breedUseCase(false)
        // Clean Architecture 에서 Rx를 사용하지 않고 LiveData 를 통해 Paging2 적용을 하려고 했으나 한계가 있음.
    }

}