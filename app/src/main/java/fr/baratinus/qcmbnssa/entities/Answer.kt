package fr.baratinus.qcmbnssa.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Answer(
    @PrimaryKey(autoGenerate = false)
    val id: Int,

    @ColumnInfo val number: Int,
    @ColumnInfo val rightAnswer: Boolean,
    @ColumnInfo val answer: String,

    val questionId: Int
)