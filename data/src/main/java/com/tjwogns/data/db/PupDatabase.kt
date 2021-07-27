package com.tjwogns.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.tjwogns.data.model.BreedDto

@Database(entities = [BreedDto::class], version = 1)
abstract class PupDatabase(): RoomDatabase() {
    abstract fun breedDao() : BreedDao

    companion object {
        // For Singleton instantiation
        @Volatile
        private var instance: PupDatabase? = null

        fun getInstance(context: Context): PupDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): PupDatabase {
            return Room.databaseBuilder(context, PupDatabase::class.java, "pup_db")
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                    }
                }).build()
        }
    }
}