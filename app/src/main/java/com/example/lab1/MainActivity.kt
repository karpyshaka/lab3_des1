package com.example.lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab1.ui.theme.Lab1Theme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab1Theme {
                QiwiImageWithText()
            }
        }
    }
}

@Composable
fun QiwiImageWithText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.manpic),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(16.dp)
                .padding(bottom = 80.dp)
        ) {
            Text(
                text = "Виклик...",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 32.sp
            )
            Text(
                text = "David Jones",
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(top = 8.dp),
                fontSize = 46.sp
            )
            Spacer(modifier = Modifier.height(72.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 1.dp)
            ) {
                IconButton(
                    onClick = { /* do */ },
                    modifier = Modifier.size(96.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.micro),
                        contentDescription = "Micro",
                        modifier = Modifier.size(58.dp)
                    )
                }
                Spacer(modifier = Modifier.width(32.dp))
                IconButton(
                    onClick = { /* do */ },
                    modifier = Modifier.size(96.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.nocall),
                        contentDescription = "call end",
                        modifier = Modifier.size(82.dp)
                    )
                }
                Spacer(modifier = Modifier.width(32.dp))
                IconButton(
                    onClick = { /* do */ },
                    modifier = Modifier.size(96.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.speak),
                        contentDescription = "Speaker",
                        modifier = Modifier.size(58.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QiwiImageWithTextPreview() {
    Lab1Theme {
        QiwiImageWithText()
    }
}
