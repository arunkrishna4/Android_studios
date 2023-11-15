package com.firstytprogram.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.firstytprogram.todolist.ui.theme.ToDoListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ToDoList()
                }
            }
        }
    }
}

@Composable
fun ToDoList(
             modifier: Modifier = Modifier
){
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color.Gray),
        verticalArrangement = Arrangement.Top
    ){

            Text(
                textAlign = TextAlign.Center,
                text = "To-Do List",
                fontSize = 40.sp,
                modifier = Modifier.padding(top = 30.dp, start = 100.dp),
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic

            )


            Text(
            textAlign = TextAlign.Center,
                text = "Tasks For Today:",
                modifier = Modifier.padding(top = 50.dp, start = 80.dp, bottom =20.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp

            )

        Row {

            Text(text = "->",modifier = Modifier.padding(top = 20.dp, start = 10.dp),
                fontSize = 25.sp)

            Text(
                text = "Gym",
                modifier = Modifier.padding(top = 20.dp, start = 10.dp),
                fontSize = 25.sp
            )
        }

        Row {
            Text(text = "->",modifier = Modifier.padding(top = 20.dp, start = 10.dp),
                fontSize = 25.sp)

            Text(
                text = "Bagavad Gita",
                modifier = Modifier.padding(top = 20.dp, start = 10.dp),
                fontSize = 25.sp
            )
        }

        Row {
            Text(text = "->",modifier = Modifier.padding(top = 20.dp, start = 10.dp),
                fontSize = 25.sp)


            Text(
                text = "Cricket",
                modifier = Modifier.padding(top = 20.dp, start = 10.dp),
                fontSize = 25.sp
            )
        }
        Row {

            Text(text = "->",modifier = Modifier.padding(top = 20.dp, start = 10.dp),
                fontSize = 25.sp)

            Text(
                text = "Coding",
                modifier = Modifier.padding(top = 20.dp, start = 10.dp),
                fontSize = 25.sp
            )
        }

        Row {
            Text(text = "->",modifier = Modifier.padding(top = 20.dp, start = 10.dp),
                fontSize = 25.sp)

            Text(
                text = "Eating",
                modifier = Modifier.padding(top = 20.dp, start = 10.dp),
                fontSize = 25.sp
            )

        }
        Row {
            Text(text = "->",modifier = Modifier.padding(top = 20.dp, start = 10.dp),
                fontSize = 25.sp)

            Text(
                text = "Assignments",
                modifier = Modifier.padding(top = 20.dp, start = 10.dp),
                fontSize = 25.sp
            )
        }

        Column(verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = 150.dp, start = 140.dp)){

            Photos()

        }
    }
}

@Composable
private fun Photos(){
    val image = painterResource(R.drawable.ic_launcher_foreground)
    Image(painter = image, contentDescription = null)

}

@Preview(showBackground = true)
@Composable
fun ToDoAppPreview() {
    ToDoListTheme {
        ToDoList()
    }
}