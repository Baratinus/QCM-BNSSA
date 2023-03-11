package fr.baratinus.qcmbnssa.data.models

import androidx.room.ColumnInfo

data class Part(
    var id: Int,
    var part: String,
    var minimum: Int,
    var maximum: Int,
    var version: String
) {



}
