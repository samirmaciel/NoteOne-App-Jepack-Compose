package com.samirmaciel.jetpackcompose_noteone.View

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.samirmaciel.jetpackcompose_noteone.model.Note
import com.samirmaciel.jetpackcompose_noteone.ui.theme.NoteColor

@Composable
fun NoteItemComponent(note: Note) {

    Surface(color = NoteColor, shape = RoundedCornerShape(10.dp), modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .height(110.dp)) {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(modifier = Modifier.padding(start = 8.dp, top = 5.dp), text = note.title, color = Color.White)
            Text(modifier = Modifier.height(40.dp).padding(start = 8.dp, top = 5.dp), text = note.body, color = Color.White)
            Text( modifier = Modifier.padding(start = 8.dp, top = 15.dp), text = note.createdDate.toString(), color = Color.White)
        }
        
    }
}