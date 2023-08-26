package com.example.groundanalyser

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.groundanalyser.ui.theme.GroundAnalyserTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GroundAnalyserTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Goodplant()
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Composable
fun Goodplant(modifier: Modifier = Modifier) {
    val imageGoodPlant = painterResource(R.drawable.istockphoto_517686930_170667a)
    Image(painter = imageGoodPlant, contentDescription = "good")
}

@Preview(showBackground = false)
@Composable
fun GoodplantPreview() {
    Goodplant()
}

@Composable
fun Badplant() {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GroundAnalyserTheme {
        Greeting("Android")
    }
}