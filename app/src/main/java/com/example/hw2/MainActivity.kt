package com.example.hw2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.hw2.ui.notes.NoteAddBlock
import com.example.hw2.ui.notes.NotesListViewModel
import com.example.hw2.ui.notes.NotesScreen
import com.example.hw2.ui.theme.HW2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HW2Theme {
                HomeworkApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeworkApp() {
    val notesListViewModel: NotesListViewModel = viewModel()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.app_title)) },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                )
            )
        },
        bottomBar = {
            NoteAddBlock(
                onAddButtonClick = { text ->
                   notesListViewModel.addToList(text)
                },
                Modifier.padding(8.dp)
            )
        }
    ) { paddingValues ->
        NotesScreen(
            Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            notesListViewModel
        )
    }
}