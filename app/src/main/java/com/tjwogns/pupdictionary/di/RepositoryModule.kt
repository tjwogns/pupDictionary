package com.tjwogns.pupdictionary.di

import com.tjwogns.data.implementation.BreedRepositoryImpl
import com.tjwogns.domain.repository.BreedRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun providesBreedRepository(repository: BreedRepositoryImpl): BreedRepository {
        return repository
    }
}