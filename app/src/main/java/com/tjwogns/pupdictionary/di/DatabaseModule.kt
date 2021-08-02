package com.tjwogns.pupdictionary.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.tjwogns.data.db.PupDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    // For Singleton instantiation
    @Volatile
    private var instance: PupDatabase? = null

    @Singleton
    @Provides
    fun providesDatabase(application: Application): PupDatabase {
        return instance ?: synchronized(this) {
            instance ?: buildDatabase(application.applicationContext).also { instance = it }
        }
    }

    private fun buildDatabase(context: Context): PupDatabase {
        return Room.databaseBuilder(context, PupDatabase::class.java, "pup_breed.db")
            .addCallback(object : RoomDatabase.Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                }
            }).build()
    }
}