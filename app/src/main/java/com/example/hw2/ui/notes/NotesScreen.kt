package com.example.hw2.ui.notes

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.hw2.data.mockNotesData

@Composable
fun NotesScreen(
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier) {
        Column {
            NotesList(
                notes = mockNotesData,
                onDeleteClick = {}
            )
        }
    }
}