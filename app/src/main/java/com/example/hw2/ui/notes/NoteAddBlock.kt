package com.example.hw2.ui.notes

import androidx.compose.foundation.layout.Arrangement
import com.example.hw2.R

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteAddBlock(
    onAddButtonClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    var text by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue(""))
    }
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            placeholder = {
                Text(text = stringResource(id = R.string.editor_hint))
            },
            singleLine = true,
            modifier = Modifier.weight(4f)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Button(
            onClick = onAddButtonClick,
            modifier = Modifier.weight(1f)
        ) {
            Text(text = stringResource(id = R.string.add_note_btn))
        }
    }
}

@Preview
@Composable
fun NoteAddBlockPreview() {
    NoteAddBlock(onAddButtonClick = { /*TODO*/ })
}