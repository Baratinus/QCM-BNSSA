package fr.baratinus.qcmbnssa.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import fr.baratinus.qcmbnssa.entities.Part
import fr.baratinus.qcmbnssa.entities.Question

data class PartWithQuestions(

    @Embedded val part: Part,

    @Relation(
        parentColumn = "id",
        entityColumn = "partId"
    )
    val questions: List<Question>

)