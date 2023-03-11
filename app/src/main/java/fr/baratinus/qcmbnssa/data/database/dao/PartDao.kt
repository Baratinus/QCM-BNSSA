package fr.baratinus.qcmbnssa.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import fr.baratinus.qcmbnssa.data.database.entities.Part

@Dao
interface PartDao {

    @Query("SELECT * FROM Part")
    fun getAllParts() : List<Part>

    @Query("SELECT * FROM Part WHERE id = :id")
    fun getPartWithId(id: Int) : Part

    @Insert
    fun insertPart(part: Part)

}