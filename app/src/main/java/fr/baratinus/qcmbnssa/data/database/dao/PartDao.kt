package fr.baratinus.qcmbnssa.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import fr.baratinus.qcmbnssa.data.database.entities.Part

@Dao
interface PartDao {

    @Query("SELECT * FROM part")
    fun getAll() : List<Part>

}