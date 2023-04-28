package com.samirmaciel.jetpackcompose_noteone.View

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samirmaciel.jetpackcompose_noteone.model.Note
import com.samirmaciel.jetpackcompose_noteone.ui.ScreenBackground
import com.samirmaciel.jetpackcompose_noteone.ui.theme.NoteColor
import java.util.Date


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
@Preview
fun HomeScreen() {
    Scaffold(modifier = Modifier, floatingActionButton = {
        FloatingActionButton(backgroundColor = NoteColor,
            contentColor = Color.White,
            onClick = {

            }) {
            Icon(
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp), imageVector = Icons.Default.Add, contentDescription = "Icon add"
            )
        }
    }) {
        ScreenBackground()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SearchBar()
            LazyColumn {
                items(notes) {
                    NoteItemComponent(note = it)
                }
            }
        }
    }
}

@Composable
fun SearchBar() {

    var searchText by remember {
        mutableStateOf("")
    }

    TextField(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(horizontal = 16.dp),
        trailingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
        },
        placeholder = { Text(text = "Procurar nota", fontSize = 15.sp) },
        value = searchText,
        onValueChange = {
            searchText = it
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White
        )
    )
}

val notes = listOf<Note>(
    Note(
        "Minha nota",
        "Primeira nota criada no compose, uma ferramenta de layout incrivel, que te da varias opções e flexibilidade de criação",
        Date()
    ),
    Note(
        "Minha nota",
        "Primeira nota criada no compose, uma ferramenta de layout incrivel, que te da varias opções e flexibilidade de criação",
        Date()
    ),
    Note(
        "Minha nota",
        "Primeira nota criada no compose, uma ferramenta de layout incrivel, que te da varias opções e flexibilidade de criação",
        Date()
    ),
    Note(
        "Minha nota",
        "Primeira nota criada no compose, uma ferramenta de layout incrivel, que te da varias opções e flexibilidade de criação",
        Date()
    ),
    Note(
        "Minha nota",
        "Primeira nota criada no compose, uma ferramenta de layout incrivel, que te da varias opções e flexibilidade de criação",
        Date()
    ),
    Note(
        "Minha nota",
        "Primeira nota criada no compose, uma ferramenta de layout incrivel, que te da varias opções e flexibilidade de criação",
        Date()
    )
)

