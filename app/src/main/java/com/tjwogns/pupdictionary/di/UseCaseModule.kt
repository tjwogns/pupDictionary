package com.tjwogns.pupdictionary.di

import com.tjwogns.domain.repository.BreedRepository
import com.tjwogns.domain.usecase.BreedUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    fun providesBreedUseCase(repository: BreedRepository): BreedUseCase {
        return BreedUseCase(repository)
    }
}