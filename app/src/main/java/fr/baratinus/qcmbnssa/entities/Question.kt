package fr.baratinus.qcmbnssa.entities

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class Question(
    @PrimaryKey(autoGenerate = false)
    val id: String,

    @ColumnInfo val question: String,
    @ColumnInfo val numberSuccess: Int,
    @ColumnInfo val numberFailure: Int,

    val partId: Int
)
