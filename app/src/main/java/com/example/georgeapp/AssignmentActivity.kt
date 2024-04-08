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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import javax.sql.RowSetReader

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Assign()

        }
    }
}

@Composable
fun Assign () {

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
        .verticalScroll(rememberScrollState())
    ) {

        val mContext = LocalContext.current
 Spacer(modifier = Modifier.height(10.dp))
// Row du titre
       Row(
           modifier = Modifier
               .fillMaxWidth(),
           horizontalArrangement = Arrangement.Center
       ) {
               Image(painter = painterResource(id = R.drawable.ima111),
                   contentDescription ="woof" ,
                   modifier = Modifier.size(90.dp))

           androidx.compose.material3.Text(
               text = "Woof",
               fontSize = 50.sp ,
               fontWeight = FontWeight.Bold,
               modifier = Modifier.padding(top = 20.dp)
           )
       }
// End of Row du titre

        Spacer(modifier = Modifier.height(15.dp))

// Debut du Card1
        Card (colors = CardDefaults.cardColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(bottomStart = 13.dp, topEnd = 13.dp))
        {

            // Row1
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .background(Color.LightGray)

            ){
                Image(painter = painterResource(id = R.drawable.ima1),
                    contentDescription = "image 1",
                    modifier = Modifier
                        .size(70.dp)
                        .padding(5.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(5.dp))

                Column {
                    androidx.compose.material3.Text(
                        text = "Koda" ,
                        fontSize = 20.sp ,
                        fontFamily = FontFamily.Serif ,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "2 years old" ,
                        fontSize = 15.sp ,
                        fontFamily = FontFamily.Serif
                    )

                }

            }
            // Fin du Row1

        }

        //Fin du Card1

        Spacer(modifier = Modifier.height(15.dp))

// Debut du Card1
        Card (colors = CardDefaults.cardColors(
            containerColor = Color.LightGray,
            contentColor = Color.Black
        ),
            shape = RoundedCornerShape(bottomStart = 13.dp, topEnd = 13.dp))
        {

            // Row1
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .background(Color.LightGray)

            ){
                Image(painter = painterResource(id = R.drawable.ima1),
                    contentDescription = "image 1",
                    modifier = Modifier
                        .size(70.dp)
                        .padding(5.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(5.dp))

                Column {
                    androidx.compose.material3.Text(
                        text = "Koda" ,
                        fontSize = 20.sp ,
                        fontFamily = FontFamily.Serif ,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "2 years old" ,
                        fontSize = 15.sp ,
                        fontFamily = FontFamily.Serif
                    )

                }

            }
            // Fin du Row1

        }

        //Fin du Card1

        Spacer(modifier = Modifier.height(15.dp))

// Debut du Card1
        Card (colors = CardDefaults.cardColors(
            containerColor = Color.LightGray,
            contentColor = Color.Black
        ),
            shape = RoundedCornerShape(bottomStart = 13.dp, topEnd = 13.dp))
        {

            // Row1
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)

            ){
                Image(painter = painterResource(id = R.drawable.ima1),
                    contentDescription = "image 1",
                    modifier = Modifier
                        .size(70.dp)
                        .padding(5.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(5.dp))

                Column {
                    androidx.compose.material3.Text(
                        text = "Koda" ,
                        fontSize = 20.sp ,
                        fontFamily = FontFamily.Serif ,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "2 years old" ,
                        fontSize = 15.sp ,
                        fontFamily = FontFamily.Serif
                    )

                }

            }
            // Fin du Row1

        }

        //Fin du Card1

        Spacer(modifier = Modifier.height(15.dp))

// Debut du Card1
        Card (colors = CardDefaults.cardColors(
            containerColor = Color.LightGray,
            contentColor = Color.Black
        ),
            shape = RoundedCornerShape(bottomStart = 13.dp, topEnd = 13.dp))
        {

            // Row1
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .background(Color.LightGray)

            ){
                Image(painter = painterResource(id = R.drawable.ima1),
                    contentDescription = "image 1",
                    modifier = Modifier
                        .size(70.dp)
                        .padding(5.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(5.dp))

                Column {
                    androidx.compose.material3.Text(
                        text = "Koda" ,
                        fontSize = 20.sp ,
                        fontFamily = FontFamily.Serif ,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "2 years old" ,
                        fontSize = 15.sp ,
                        fontFamily = FontFamily.Serif
                    )

                }

            }
            // Fin du Row1

        }

        //Fin du Card1


        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext,FirstScreenActivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
        )
        {
            Text(text = "Suivant")
            Icon(imageVector = Icons.Default.ArrowForward ,
                contentDescription = "suivant" )

        }

    }

}

@Preview(showBackground = true)
@Composable
fun AssignPreview () {
    Assign()
}