package fr.baratinus.qcmbnssa.entities

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class Answer(
    @PrimaryKey(autoGenerate = false)
    val id: Int,

    @ColumnInfo val number: Int,
    @ColumnInfo val rightAnswer: Boolean,
    @ColumnInfo val answer: String,

    val questionId: Int
)