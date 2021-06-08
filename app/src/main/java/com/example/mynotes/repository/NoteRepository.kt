package com.example.mynotes.repository

import androidx.lifecycle.LiveData
import com.example.mynotes.database.NoteDao
import com.example.mynotes.models.Note

class NoteRepository(private val notesDao: NoteDao) {

    val allNote: LiveData<List<Note>> = notesDao.getAllNotes()

    suspend fun insert(note: Note){
        notesDao.insert(note)
    }

    suspend fun delete(note: Note){
        notesDao.delete(note)
    }
}