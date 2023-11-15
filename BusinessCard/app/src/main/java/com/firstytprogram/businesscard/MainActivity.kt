package com.firstytprogram.businesscard

import android.os.Bundle
import android.text.style.BackgroundColorSpan
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
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.firstytprogram.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    `Business-card`()
                }
            }
        }
    }
}

@Composable
fun `Business-card`(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        val image = painterResource(R.drawable.ic_launcher_foreground)
        Image(painter = image, contentDescription = null)

        Text(
            textAlign = TextAlign.Center,
            text = "Arun Krishna",
            modifier = Modifier.padding(top = 16.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )

        Text(
            text = "Application developer",
            fontSize = 16.sp
        )

        Row(
            verticalAlignment = Alignment.Bottom

        ) {
            Photos()

            Text(

                text = "6303866594",
                modifier = Modifier.padding(top = 250.dp).padding(3.dp)
            )
        }

        Row(
        ) {
            Photos()

            Text(
                modifier = Modifier.padding(4.dp),
                text = "arunkrishn7"

            )


        }

        Row(modifier = Modifier.padding(start = 25.dp)) {

            Photos()
            Text(
                text = "arunkrishnaraghav@gmail.com",
            )
        }


    }
    }



@Composable
private fun Photos(){
    val image = painterResource(id = R.drawable.phone_black_24dp)
    Image(painter = image, contentDescription = null)

}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        `Business-card`()
    }
}