package fr.baratinus.qcmbnssa.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import fr.baratinus.qcmbnssa.dao.PartDao

import fr.baratinus.qcmbnssa.entities.Part

@Database(entities = [Part::class], version = 1)
abstract class BNSSADatabase : RoomDatabase() {

    abstract fun partDao(): PartDao

    companion object {
        @Volatile
        private var INSTANCE: BNSSADatabase? = null

        fun getDatabase(context: Context): BNSSADatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BNSSADatabase::class.java,
                    "BNSSA-Database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
