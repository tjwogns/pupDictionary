package com.tjwogns.pupdictionary.di

import com.tjwogns.data.source.BreedRemoteSource
import com.tjwogns.data.source.BreedRemoteSourceImpl
import com.tjwogns.data.source.paging2.Paging2BreedRemoteSource
import com.tjwogns.data.source.paging2.Paging2BreedRemoteSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Singleton
    @Provides
    fun providesBreedRemoteSource(source: BreedRemoteSourceImpl): BreedRemoteSource {
        return source
    }

    @Singleton
    @Provides
    fun providesPaging2BreedRemoteSource(source: Paging2BreedRemoteSourceImpl): Paging2BreedRemoteSource {
        return source
    }
}