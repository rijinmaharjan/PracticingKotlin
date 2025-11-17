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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class SpotifyFront : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
FrontPage()
        }
    }
}

@Composable
fun FrontPage() {
    Scaffold() { padding ->
        Column(
            modifier = Modifier.fillMaxSize()
                .background(color = Color.Black)
                .padding(padding)
        ) {

            Row(modifier = Modifier.fillMaxWidth().padding(top=16.dp),horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                Text("Recently Played",
                    style = TextStyle(fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,color = Color.White))
                Row(horizontalArrangement = Arrangement.spacedBy(15.dp)) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_notifications_24),
                        contentDescription = null,
                        tint = Color.White
                    )
                    Icon(
                        painter = painterResource(R.drawable.outline_change_circle_24),
                        contentDescription = null,
                        tint = Color.White

                    )
                    Icon(
                        painter = painterResource(R.drawable.outline_settings_24),
                        contentDescription = null,
                        tint = Color.White

                    )
                }
            }
            Row(modifier = Modifier.padding(top=16.dp, start = 16.dp).fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                Column( horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp)) {

                    Image(
                        painter = painterResource(R.drawable.billieeilish),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(100.dp).clip(CircleShape)
                    )

                    Text("Billie Eilish", style = TextStyle(fontSize = 15.sp,
                        fontWeight = FontWeight.Bold, color = Color.White))
                }
                Column( horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp)) {

                    Image(
                        painter = painterResource(R.drawable.eminem),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(100.dp).clip(CircleShape)
                    )

                    Text("Eminem", style = TextStyle(fontSize = 15.sp,
                        fontWeight = FontWeight.Bold, color = Color.White))
                }
            }
            Row( ) { }
            Row( ) { }
            Row( ) { }

        }

    }
}
@Preview
@Composable
fun Previewing(){
    FrontPage()
}