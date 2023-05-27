package com.example.mynotes.feature_note.presentation.notes

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.hilt.navigation.compose.hiltViewModel
import kotlinx.coroutines.launch

@Composable
fun NoteDetailScreen(
    viewModel: NotesViewModel = hiltViewModel()
) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold() {
        IconButton(
            onClick = {
//                viewModel.onEvent(NotesEvent.DeleteNote())
                scope.launch {
                    val result = scaffoldState.snackbarHostState.showSnackbar(
                        message = "Note deleted",
                        actionLabel = "Undo"
                    )
                    if (result == SnackbarResult.ActionPerformed) {
                        viewModel.onEvent(NotesEvent.RestoreNote)
                    }
                }
            }
        ) {
            Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete Note")
        }
    }

}