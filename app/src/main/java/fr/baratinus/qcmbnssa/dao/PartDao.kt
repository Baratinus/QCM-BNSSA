package fr.baratinus.qcmbnssa.dao

import androidx.room.Query
import fr.baratinus.qcmbnssa.entities.Part

interface PartDao {

    @Query("SELECT * FROM part")
    fun getAll() : List<Part>

}