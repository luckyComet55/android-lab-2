package com.example.hw2.ui.notes

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.toMutableStateList
import com.example.hw2.domain.Note

class NotesListViewModel : ViewModel() {
    
    private var _notesList = emptyList<Note>().toMutableStateList()
    val notesList: List<Note>
        get() =_notesList
    
    fun addToList(text: String) {
        val newNote = Note(text, System.currentTimeMillis())
        _notesList.add(newNote)
    }
    
    fun removeFromList(item: Note) {
        _notesList.removeIf { it.id == item.id }
    }
}