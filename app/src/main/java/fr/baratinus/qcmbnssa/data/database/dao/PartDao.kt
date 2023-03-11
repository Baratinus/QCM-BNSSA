package fr.baratinus.qcmbnssa.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import fr.baratinus.qcmbnssa.data.database.entities.PartEntity

@Dao
interface PartDao {

    @Query("SELECT * FROM Part")
    fun getAllParts() : LiveData<PartEntity>

    @Query("SELECT * FROM Part WHERE id = :id")
    fun getPartWithId(id: Int) : LiveData<PartEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPart(vararg part: PartEntity)

}