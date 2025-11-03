package com.example.functiondeclare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.functiondeclare.ui.theme.FunctionDeclareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            Text("Hello")
            MainBody()
        }
    }
}

@Composable
fun MainBody(){
    //UI components
    //@Composable required for UI function
    Column(
        modifier = Modifier
//            .height(100.dp)
//            .width(100.dp)
//            .fillMaxHeight()
//            .fillMaxWidth()
            .fillMaxSize()
            .background(color = colorResource(R.color.piggy))
    ) {

        Text("Hello")
        Text("World")
    }
}
@Preview
@Composable
fun PreviewBody(){
    MainBody()
}