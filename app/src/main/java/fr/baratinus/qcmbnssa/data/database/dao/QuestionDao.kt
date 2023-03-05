package fr.baratinus.qcmbnssa.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import fr.baratinus.qcmbnssa.data.database.entities.Question

@Dao
interface QuestionDao {

    @Query("SELECT * FROM Question")
    fun getAll() : List<Question>

}