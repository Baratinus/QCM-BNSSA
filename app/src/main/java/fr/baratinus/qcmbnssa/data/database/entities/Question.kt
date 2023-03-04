package fr.baratinus.qcmbnssa.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Question(
    @PrimaryKey(autoGenerate = false)
    val id: String,

    @ColumnInfo val question: String,
    @ColumnInfo val numberSuccess: Int,
    @ColumnInfo val numberFailure: Int,

    val partId: Int
)