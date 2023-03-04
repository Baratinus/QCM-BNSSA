package fr.baratinus.qcmbnssa.dao

import androidx.room.Dao
import androidx.room.Query
import fr.baratinus.qcmbnssa.entities.Part

@Dao
interface PartDao {

    @Query("SELECT * FROM part")
    fun getAll() : List<Part>

}