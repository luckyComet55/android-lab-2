package com.example.hw2.ui.notes

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.hw2.R
import com.example.hw2.domain.Note

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditNoteScreen(
    note: Note,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        value = note.text,
        onValueChange = onValueChange,
        placeholder = {
            Text(text = stringResource(id = R.string.editor_hint))
        },
        modifier = modifier
    )
}

@Preview
@Composable
fun EditNoteScreenPreview() {
    EditNoteScreen(
        note = Note("", 1),
        onValueChange = {},
        modifier = Modifier.fillMaxSize()
    )
}