package fr.baratinus.qcmbnssa.data.repositories

import androidx.room.TypeConverter

class BooleanConverter {

    @TypeConverter
    fun fromBoolean(value: Boolean): Int {
        return if (value) 1 else 0
    }

    @TypeConverter
    fun toBoolean(value: Int): Boolean {
        return value == 1
    }
}