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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.functiondeclare.ui.theme.FunctionDeclareTheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun ProfileBody(){
    Scaffold() {
        padding->
        Column(
            modifier = Modifier.fillMaxSize()
                .background(color = Color.White)
                .padding(padding)
        ) {
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_arrow_back_ios_24),
                    contentDescription = null
                )
                Text("monkey", style = TextStyle(fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold))
                Icon(
                    painter = painterResource(R.drawable.baseline_more_horiz_24),
                    contentDescription = null
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth().padding(top=16.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.monkey),
                    contentDescription = null,
                    modifier = Modifier.size(85.dp)
                        .clip(CircleShape)
                )
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("20", style = TextStyle(fontWeight = FontWeight.Bold))
                    Text("Posts", style = TextStyle(fontWeight = FontWeight.Bold))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) { Text("1M", style = TextStyle(fontWeight = FontWeight.Bold))
                    Text("Followers", style = TextStyle(fontWeight = FontWeight.Bold))
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) { Text("201", style = TextStyle(fontWeight = FontWeight.Bold))
                    Text("Following", style = TextStyle(fontWeight = FontWeight.Bold))
                }
            }
            Column(modifier = Modifier.padding(top = 15.dp, start = 10.dp), horizontalAlignment = Alignment.Start) {
                Text("MonkeyUser and monkey Life whats you watching.\nMeyyaaa!\n\nFollowed by johncena and 29 others.", style = TextStyle(fontWeight = FontWeight.Bold))
            }
            Row(modifier = Modifier.padding(top=15.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Button(onClick = {}, modifier = Modifier.width(150.dp)
                    .height(38.dp) ){
                    Text("Follow")
                }
                Button(onClick = {}, modifier = Modifier.width(150.dp)
                    .height(38.dp)) {
                    Text("Messege")
                }
                Button(onClick = {}, modifier = Modifier
                    .width(70.dp)
                    .height(38.dp)) {
                    Icon( painter = painterResource(R.drawable.baseline_more_horiz_24),
                        contentDescription = null)
                }

            }
            Row(modifier = Modifier.padding(top=15.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) { Image( painter = painterResource(R.drawable.monkey),
                    contentDescription = null,
                    modifier = Modifier.size(55.dp)
                        .clip(CircleShape))
                    Text("Story 1")
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) { Image( painter = painterResource(R.drawable.monkey),
                    contentDescription = null,
                    modifier = Modifier.size(55.dp)
                        .clip(CircleShape))
                    Text("Story 2")
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {Image( painter = painterResource(R.drawable.monkey),
                    contentDescription = null,
                    modifier = Modifier.size(55.dp)
                        .clip(CircleShape))
                    Text("Story 3")
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) { Image( painter = painterResource(R.drawable.monkey),
                    contentDescription = null,
                    modifier = Modifier.size(55.dp)
                        .clip(CircleShape))
                    Text("Story 4")
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) { Image( painter = painterResource(R.drawable.monkey),
                    contentDescription = null,
                    modifier = Modifier.size(55.dp)
                        .clip(CircleShape))
                    Text("Story 5")
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewScreen(){
    ProfileBody()
}