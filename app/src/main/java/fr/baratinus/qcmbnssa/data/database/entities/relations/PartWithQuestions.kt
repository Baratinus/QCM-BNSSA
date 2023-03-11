package fr.baratinus.qcmbnssa.data.database.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import fr.baratinus.qcmbnssa.data.database.entities.PartEntity
import fr.baratinus.qcmbnssa.data.database.entities.QuestionEntity

data class PartWithQuestions(

    @Embedded val part: PartEntity,

    @Relation(
        parentColumn = "id",
        entityColumn = "partId"
    )
    val questions: List<QuestionEntity>

)