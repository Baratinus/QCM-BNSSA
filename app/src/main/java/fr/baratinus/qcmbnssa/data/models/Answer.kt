package fr.baratinus.qcmbnssa.data.models

data class Answer(
    var id: Int,
    var number: Int,
    var rightAnswer: Boolean,
    var answer: String,
    var question: Question
)
