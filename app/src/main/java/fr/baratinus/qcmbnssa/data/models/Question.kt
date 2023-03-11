package fr.baratinus.qcmbnssa.data.models

import androidx.room.ColumnInfo

data class Question(
    var id: Int,
    var question: String,
    var numberSuccess: Int,
    var numberFailure: Int,
    var part: Part,
    var answers: List<Answer>?
)