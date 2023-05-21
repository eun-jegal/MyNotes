package com.example.mynotes.feature_note.domain.model

import android.os.Message
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mynotes.ui.theme.*

@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(color1, color2, color3, color4, color5)
    }
}

class InvalidNoteException(message: String): Exception(message)
