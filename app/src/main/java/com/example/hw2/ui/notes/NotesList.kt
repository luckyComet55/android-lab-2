package com.example.hw2.ui.notes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hw2.data.mockNotesData
import com.example.hw2.domain.Note

@Composable
fun NotesList(
    notes: List<Note>,
    onItemClick: (Note) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        items(notes) { note ->
            NotesListItem(
                note = note,
                onDeleteClick = {},
                onClick = { onItemClick(note) }
            )
        }
    }
}

@Preview
@Composable
fun NotesListPreview() {
    NotesList(
        notes = mockNotesData,
        onItemClick = {}
    )
}