package fr.baratinus.qcmbnssa.data.database.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import fr.baratinus.qcmbnssa.data.database.entities.AnswerEntity

data class QuestionWithPartAndAnswers(

    @Embedded val questionWithPart: QuestionWithPart,

    @Relation(
        parentColumn = "idQuestion",
        entityColumn = "questionId"
    )
    val answers: List<AnswerEntity>

)
