package fr.baratinus.qcmbnssa.data.database

import android.content.Context
import androidx.room.*
import androidx.room.migration.AutoMigrationSpec
import fr.baratinus.qcmbnssa.data.database.dao.AnswerDao
import fr.baratinus.qcmbnssa.data.database.dao.PartDao
import fr.baratinus.qcmbnssa.data.database.dao.QuestionDao
import fr.baratinus.qcmbnssa.data.database.entities.Answer

import fr.baratinus.qcmbnssa.data.database.entities.Part
import fr.baratinus.qcmbnssa.data.database.entities.Question
import fr.baratinus.qcmbnssa.data.repositories.BooleanConverter

@Database(
    entities = [
        Part::class,
        Question::class,
        Answer::class
               ],
    version = 1,
    /*autoMigrations = [
        AutoMigration (from = 1, to = 2/*, spec = BNSSADatabase.MyAutoMigration::class*/)
                    ],*/
    exportSchema = true
)
@TypeConverters(BooleanConverter::class)
abstract class BNSSADatabase : RoomDatabase() {

    /*@RenameColumn("part", "part", "name")
    class MyAutoMigration : AutoMigrationSpec*/

    abstract val partDao: PartDao
    abstract val questionDao: QuestionDao
    abstract val answerDao: AnswerDao

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
                ).createFromAsset("database/BNSSA-database.db")
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
