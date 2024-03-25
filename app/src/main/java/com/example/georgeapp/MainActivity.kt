package com.example.georgeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Divider
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.georgeapp.ui.theme.GeorgeAppTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()
        }
    }
}

@Composable
fun Text(){
   Column (modifier = Modifier.fillMaxSize()){

       val mContext= LocalContext.current

       androidx.compose.material3.Text(
           text = "Welcome to android",
           fontSize = 30.sp,
           color = Color.Blue,
           fontWeight = FontWeight.Bold,
           fontStyle = FontStyle.Italic
       )

       Spacer(modifier = Modifier.height(20.dp))

       androidx.compose.material3.Text(
           text ="There is Android",
           fontSize = 29.sp,
           modifier = Modifier
               .fillMaxWidth()
               .background(Color.Red)
               .height(40.dp),
           textAlign = TextAlign.Center,
           textDecoration = TextDecoration.Underline,

       )


       androidx.compose.material3.Text(text = "1.Kotlin")
       androidx.compose.material3.Text(text = "2.Java")
       androidx.compose.material3.Text(text = "3.Python")

       Spacer(modifier = Modifier.height(20.dp))

       Box(
           modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center
       ) {
           Button(
               onClick = {
                         mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
               },
               shape = RoundedCornerShape(5.dp),
               colors = ButtonDefaults.buttonColors(Color.Red),
               modifier = Modifier
                   .padding(start = 30.dp, end = 30.dp)
           ) {
               androidx.compose.material3.Text(text = "See more")
           }

       }
// 2eme partie

       androidx.compose.material3.Text(
           text ="Les Fruits Sucres",
           fontSize = 29.sp,
           modifier = Modifier
               .fillMaxWidth()
               .background(Color.Blue)
               .height(50.dp),
           textAlign = TextAlign.Center,
           textDecoration = TextDecoration.Underline,
           color = Color.White
       )
       androidx.compose.material3.Text(text = "1.Mangue")
       androidx.compose.material3.Text(text = "2.Banane")
       androidx.compose.material3.Text(text = "3.Pomme")


       Spacer(modifier = Modifier.height(20.dp))
       Divider()

      // Centering an image
       
       Spacer(modifier = Modifier.height(20.dp))
       androidx.compose.material3.Text(
           text ="Le Volcan",
           modifier = Modifier.fillMaxWidth(),
           textDecoration = TextDecoration.Underline)


      Box (modifier = Modifier.fillMaxWidth(),
          contentAlignment = Alignment.Center) {
          Image(painter = painterResource(id = R.drawable.ima),
              contentDescription = "Volcan" ,
              modifier = Modifier
                  .size(200.dp)
                  .clip(shape = CircleShape),
              contentScale = ContentScale.Crop
              )

      }
       Spacer(modifier = Modifier.height(15.dp))

       Button(onClick = { /*TODO*/ },
           shape = RoundedCornerShape(5.dp),
           colors = ButtonDefaults.buttonColors(Color.Blue),
           modifier = Modifier
               .fillMaxWidth()
               .padding(start = 30.dp, end = 30.dp)
       ) {
           androidx.compose.material3.Text(text = "Continue")
       }

       
       
   }
}


@Preview(showBackground = true)
@Composable
fun TextPreview(){
    Text()
}