package com.example.functiondeclare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun Instagram(){
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
    ){

        Row() {   Image(
            painter = painterResource(R.drawable.monkey),
            contentDescription = null,
            modifier = Modifier.size(100.dp)
        )}
        Row() { }
        Column() { }
    }
}
@Composable
fun MainBody(){
    //UI components
    //@Composable required for UI function
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
//            .height(100.dp)
//            .width(100.dp)
//            .fillMaxHeight()
//            .fillMaxWidth()
            .fillMaxSize()
            .background(color = colorResource(R.color.piggy))
    ) {

        Text("Hello",style= TextStyle(
            fontSize= 40.sp,
            color=Color.Red,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.ExtraBold
        ))
        Text("Monkey",style= TextStyle(
            fontSize= 40.sp,
            color=Color.Red,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.ExtraBold
        ))
        Image(
            painter = painterResource(R.drawable.monkey),
            contentDescription = null,
            modifier = Modifier.size(500.dp)
        )
    }
}
@Preview
@Composable
fun PreviewBody(){
    MainBody()
    Instagram()
}