package fr.baratinus.qcmbnssa.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import fr.baratinus.qcmbnssa.entities.Answer
import fr.baratinus.qcmbnssa.entities.Question

data class QuestionWithAnswers(

    @Embedded val question: Question,
    @Relation(
        parentColumn = "id",
        entityColumn = "questionId"
    )
    val answers: List<Answer>

)
