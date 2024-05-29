package com.example.georgeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class Page1Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Pageun()
        }
    }
}

@Composable
fun Pageun() {

    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        val mContext= LocalContext.current

        Box (modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.ima),
                contentDescription = "Volcan" ,
                modifier = Modifier
                    .size(300.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )

        }


        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Text(
            text = "Add to Your Cart ",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Text(
            text ="ddffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                    "fffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                    "fggggggggggggggggggggggggggggggggggggggggggggggggggggghhjj",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp ),
            textAlign = TextAlign.Center,

            )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext,ChaiseActivity::class.java))
        },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(
                text = "Next",
                color = Color.Black,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }

    }
}

@Preview(showBackground = true , showSystemUi = true )
@Composable
fun PageunPreview () {
    Pageun()
}