package fr.baratinus.qcmbnssa.entities

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class Part(
    @PrimaryKey val id : Int,
    @ColumnInfo(name = "name") val name : String?,
    @ColumnInfo(name = "minimum") val minimum : Int,
    @ColumnInfo(name = "maximum") val maximum : Int
)
