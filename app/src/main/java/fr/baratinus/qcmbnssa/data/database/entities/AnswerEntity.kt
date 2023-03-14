package fr.baratinus.qcmbnssa.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Answer")
data class AnswerEntity(
    @PrimaryKey(autoGenerate = false)
    val idAnswer: Int,

    @ColumnInfo val number: Int,
    @ColumnInfo(name = "rightAnswer") val rightAnswer: Boolean,
    @ColumnInfo val answer: String,

    val questionId: Int
)