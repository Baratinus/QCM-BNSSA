package fr.baratinus.qcmbnssa.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Part")
data class PartEntity(
    @PrimaryKey(autoGenerate = false)
    val idPart: Int,

    @ColumnInfo(name = "part") val part: String,
    @ColumnInfo(name = "minimum") val minimum: Int,
    @ColumnInfo(name = "maximum") val maximum: Int,
    @ColumnInfo(name = "version") val version: String
)
