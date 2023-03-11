package fr.baratinus.qcmbnssa.data.database.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import fr.baratinus.qcmbnssa.data.database.entities.PartEntity
import fr.baratinus.qcmbnssa.data.database.entities.QuestionEntity

data class QuestionWithPart(

    @Embedded val questionEntity: QuestionEntity,

    @Relation(
        parentColumn = "idQuestion",
        entityColumn = "partId"
    )
    val partEntity: PartEntity

)
