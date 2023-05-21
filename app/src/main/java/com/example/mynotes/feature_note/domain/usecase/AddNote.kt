package com.example.mynotes.feature_note.domain.usecase

import com.example.mynotes.feature_note.domain.model.InvalidNoteException
import com.example.mynotes.feature_note.domain.model.Note
import com.example.mynotes.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note cannot be empty.")
        }
        repository.insertNote(note)
    }
}