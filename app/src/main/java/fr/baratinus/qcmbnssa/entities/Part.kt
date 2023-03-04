package fr.baratinus.qcmbnssa.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Part(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "minimum") val minimum: Int,
    @ColumnInfo(name = "maximum") val maximum: Int,
    @ColumnInfo(name = "version") val version: String
)
