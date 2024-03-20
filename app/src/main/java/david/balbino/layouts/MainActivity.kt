package david.balbino.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import david.balbino.layouts.ui.theme.LayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutsTheme {
                // A surface container to hold the content
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    LayoutScreen()
                }
            }
        }
    }
}

@Composable
fun LayoutScreen() {
    Column (
        modifier = Modifier
            .background(Color.Cyan)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
            .background(Color.Magenta)
            .fillMaxWidth()
            .height(300.dp)
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 1")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 2")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 3")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 4")
            }
        }
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .background(Color.Green)
                .height(150.dp)
                .fillMaxWidth()
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 5")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 6")
            }
        }
        Row (
            modifier = Modifier
                .background(Color.Yellow)
                .height(150.dp)
                .fillMaxWidth()
        ) {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(8.dp)
                    .weight(0.3f)
                    .background(Color.Red)

            ) {

            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(8.dp)
                    .background(Color.Blue)
                    .weight(0.7f)
            ) {

            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LayoutScreenPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        LayoutScreen()
    }

}



