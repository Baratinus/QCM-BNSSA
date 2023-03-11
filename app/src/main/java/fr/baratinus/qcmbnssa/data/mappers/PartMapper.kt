package fr.baratinus.qcmbnssa.data.mappers

import fr.baratinus.qcmbnssa.data.database.entities.PartEntity
import fr.baratinus.qcmbnssa.data.models.Part

object PartMapper {
    fun toPartEntity(part: Part): PartEntity {
        return PartEntity(part.id, part.part, part.minimum, part.maximum, part.version)
    }

    fun fromPartEntity(part: PartEntity): Part {
        return Part(part.idPart, part.part, part.minimum, part.maximum, part.version)
    }
}