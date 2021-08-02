package com.tjwogns.pupdictionary.di

import com.tjwogns.data.implementation.BreedRepositoryImpl
import com.tjwogns.data.implementation.Paging2BreedRepositoryImpl
import com.tjwogns.domain.repository.BreedRepository
import com.tjwogns.domain.repository.Paging2BreedRepository
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

    @Singleton
    @Provides
    fun providesPaging2BreedRepository(repository: Paging2BreedRepositoryImpl): Paging2BreedRepository {
        return repository
    }
}