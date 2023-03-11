package fr.baratinus.qcmbnssa.data.mappers

import fr.baratinus.qcmbnssa.data.database.entities.QuestionEntity
import fr.baratinus.qcmbnssa.data.database.entities.relations.QuestionWithPart
import fr.baratinus.qcmbnssa.data.database.entities.relations.QuestionWithPartAndAnswers
import fr.baratinus.qcmbnssa.data.models.Part
import fr.baratinus.qcmbnssa.data.models.Question

object QuestionMapper {
    fun toQuestionEntity(question: Question): QuestionEntity {
        return QuestionEntity(question.id, question.question, question.numberSuccess, question.numberFailure, question.part.id)
    }

    fun fromQuestionWithPart(questionWithPart: QuestionWithPart): Question {
        return Question(
            questionWithPart.questionEntity.idQuestion,
            questionWithPart.questionEntity.question,
            questionWithPart.questionEntity.numberSuccess,
            questionWithPart.questionEntity.numberFailure,
            Part(
                questionWithPart.partEntity.idPart,
                questionWithPart.partEntity.part,
                questionWithPart.partEntity.minimum,
                questionWithPart.partEntity.maximum,
                questionWithPart.partEntity.version
            ),
            null
        )
    }

    fun fromQuestionWithPartAndAnswers(questionWithPartAndAnswers: QuestionWithPartAndAnswers): Question {
        return Question(
            questionWithPartAndAnswers.questionWithPart.questionEntity.idQuestion,
            questionWithPartAndAnswers.questionWithPart.questionEntity.question,
            questionWithPartAndAnswers.questionWithPart.questionEntity.numberSuccess,
            questionWithPartAndAnswers.questionWithPart.questionEntity.numberFailure,
            Part(
                questionWithPartAndAnswers.questionWithPart.partEntity.idPart,
                questionWithPartAndAnswers.questionWithPart.partEntity.part,
                questionWithPartAndAnswers.questionWithPart.partEntity.minimum,
                questionWithPartAndAnswers.questionWithPart.partEntity.maximum,
                questionWithPartAndAnswers.questionWithPart.partEntity.version
            ),
            null
            // SEQUENCE
        )
    }
}