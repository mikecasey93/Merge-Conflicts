package com.example.mergeconflict

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mergeconflict.ui.theme.MergeConflictTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MergeConflictTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Michael",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    Text(text = "This is practice for resolving merge conflicts")
    Text(text = "This is the fifth initial commit")
    Text(text = "Some more new text")
    Text(text = "Next text")
    Text(text = "Hello World Android")
    Text(text = "I love Android")
    Text(text = "Hello Michael")
    Text("Im here")
    Text("This is cool")
    Text("This is awesome")
    Text("I'm getting good")
    Text("This is easy")
    Text("Some more text to practice")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MergeConflictTheme {
        Greeting("Android")
    }
}