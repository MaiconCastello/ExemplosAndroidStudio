package com.generation.roomaplication.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user_table")
class Usuario (

    @PrimaryKey(autoGenerate = true)
    val id: Long,
    var nome: String,
    var idade: Int
    ) {
}