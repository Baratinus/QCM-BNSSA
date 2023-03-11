package fr.baratinus.qcmbnssa.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import fr.baratinus.qcmbnssa.data.database.entities.AnswerEntity

@Dao
interface AnswerDao {

    @Query("SELECT * FROM Answer")
    fun getAll() : List<AnswerEntity>

}