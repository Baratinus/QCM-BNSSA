package fr.baratinus.qcmbnssa.data.database.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import fr.baratinus.qcmbnssa.data.database.entities.AnswerEntity
import fr.baratinus.qcmbnssa.data.database.entities.QuestionEntity

data class QuestionWithAnswers(

    @Embedded val question: QuestionEntity,

    @Relation(
        parentColumn = "id",
        entityColumn = "questionId"
    )
    val answers: List<AnswerEntity>

)
