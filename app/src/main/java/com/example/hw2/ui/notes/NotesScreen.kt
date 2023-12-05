package com.example.hw2.ui.notes

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun NotesScreen(
    modifier: Modifier = Modifier,
    notesListViewModel: NotesListViewModel = viewModel()
) {
    Surface(modifier = modifier) {
        Column {
            NotesList(
                notes = notesListViewModel.notesList,
                onDeleteClick = { item ->
                    notesListViewModel.removeFromList(item)
                }
            )
        }
    }
}