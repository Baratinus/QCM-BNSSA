package fr.baratinus.qcmbnssa.data.database.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import fr.baratinus.qcmbnssa.data.database.entities.Answer
import fr.baratinus.qcmbnssa.data.database.entities.Question

data class QuestionWithAnswers(

    @Embedded val question: Question,

    @Relation(
        parentColumn = "id",
        entityColumn = "questionId"
    )
    val answers: List<Answer>

)
