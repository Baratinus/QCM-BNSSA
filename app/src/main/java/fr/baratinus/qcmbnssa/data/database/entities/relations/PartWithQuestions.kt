package fr.baratinus.qcmbnssa.data.database.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import fr.baratinus.qcmbnssa.data.database.entities.Part
import fr.baratinus.qcmbnssa.data.database.entities.Question

data class PartWithQuestions(

    @Embedded val part: Part,

    @Relation(
        parentColumn = "id",
        entityColumn = "partId"
    )
    val questions: List<Question>

)