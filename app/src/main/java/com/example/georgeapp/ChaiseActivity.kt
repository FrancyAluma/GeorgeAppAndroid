package com.example.georgeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import javax.sql.RowSetMetaData


class ChaiseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Chaise()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Chaise () {

    Column (modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current
        // TopAppBar
        TopAppBar (title = { },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ArrowBack ,
                        contentDescription ="Fleche retour",
                        tint = Color.Black)
                }
            },
            actions = {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription ="notification",
                        tint = Color.Black)
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription ="search",
                        tint = Color.Black)
                }

            })

        // ending of TopAppbar

       Column (
           modifier = Modifier
               .verticalScroll(rememberScrollState())
               .padding(start = 16.dp)
       ) {
           Row (
               modifier = Modifier
                   .fillMaxWidth()
           ) {
               androidx.compose.material3.Text(
                   text = "Chairs ",
                   fontWeight = FontWeight.ExtraBold,
                   fontSize = 30.sp
               )
               Spacer(modifier = Modifier.width(20.dp))
               androidx.compose.material3.Text(
                   text = "Tables ",
                   fontWeight = FontWeight.ExtraBold,
                   fontSize = 30.sp,
                   color = Color.LightGray
               )
               Spacer(modifier = Modifier.width(20.dp))
               androidx.compose.material3.Text(
                   text = "Sofa ",
                   fontWeight = FontWeight.ExtraBold,
                   fontSize = 30.sp,
                   color = Color.LightGray
               )

               Spacer(modifier = Modifier.width(25.dp))
               androidx.compose.material3.Text(
                   text = "Bed",
                   fontWeight = FontWeight.ExtraBold,
                   fontSize = 30.sp,
                   color = Color.LightGray
               )

           }
           Spacer(modifier = Modifier.height(25.dp))

           Row (
               Modifier
                   .fillMaxWidth()
           ) {
               androidx.compose.material3.Text(
                   text = "120 Products",
                   fontWeight = FontWeight.Bold,
                   fontSize = 15.sp,
                   modifier = Modifier
                           .padding(top = 15.dp)
               )
               Spacer(modifier = Modifier.width(170.dp))

               Row (
                   Modifier
                       .fillMaxWidth(),
                   horizontalArrangement = Arrangement.End
               ) {
                   androidx.compose.material3.Text(
                       text = "Popular",
                       modifier = Modifier
                           .padding(top = 12.dp),
                       fontSize = 18.sp,
                       fontWeight = FontWeight.ExtraBold
                   )

                   IconButton(onClick = { /*TODO*/ }) {
                       Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription ="notification",
                           tint = Color.Black,
                           modifier = Modifier.padding(top = 5.dp))
                   }
               }

           }

           Spacer(modifier = Modifier.height(25.dp))


           // Row1
           Row (
               modifier = Modifier
                   .fillMaxSize()
           ) {
               // row1 part1
               Column {

                   Card (
                       modifier = Modifier
                           .height(120.dp)
                           .width(175.dp)
                   ) {

                       Box (
                           modifier = Modifier.fillMaxWidth(),
                           contentAlignment = Alignment.Center
                       ) {

                           Image(painter = painterResource(id =R.drawable.ima3 ),
                               contentDescription ="NewYork",
                               modifier = Modifier.fillMaxSize(),
                               contentScale = ContentScale.FillBounds
                           )

                           Icon(imageVector = Icons.Default.FavoriteBorder ,
                               contentDescription = "favorite",
                               tint = Color.White ,
                               modifier = Modifier
                                   .align(Alignment.TopEnd)
                                   .padding(15.dp)
                           )

                       }

                   }
                   Spacer(modifier = Modifier.height(5.dp))

                   androidx.compose.material3.Text(
                       text = "Amos Chair" ,
                       fontSize = 20.sp ,
                       fontFamily = FontFamily.Serif ,
                       fontWeight = FontWeight.ExtraBold
                   )
                   Spacer(modifier = Modifier.height(5.dp))

                   Row (
                   ) {
                       Column {
                           androidx.compose.material3.Text(
                               text = "Les Chaises sont de"
                                       ,
                               fontSize = 10.sp ,
                               fontFamily = FontFamily.Serif,
                               color = Color.Gray
                           )
                           androidx.compose.material3.Text(
                               text = "bonnes qualites"
                               ,
                               fontSize = 10.sp ,
                               fontFamily = FontFamily.Serif,
                               color = Color.Gray
                           )


                       }
                   }

                   Spacer(modifier = Modifier.height(5.dp))

                  Row {
                      androidx.compose.material3.Text(
                          text = "$680" ,
                          fontSize = 22.sp ,
                          fontFamily = FontFamily.Serif ,
                          fontWeight = FontWeight.ExtraBold,
                          color = Color.Black,
                          modifier = Modifier.padding(end=100.dp)
                      )

                      Icon(imageVector = Icons.Default.ShoppingCart, contentDescription ="Panier d'achat",
                              tint = Color.Gray,)


                  }

               }
// End of row1 part1

               Spacer(modifier = Modifier.width(15.dp))

               // row1 part2
               Column {

                   Card (
                       modifier = Modifier
                           .height(120.dp)
                           .width(175.dp)
                   ) {

                       Box (
                           modifier = Modifier.fillMaxWidth(),
                           contentAlignment = Alignment.Center
                       ) {

                           Image(painter = painterResource(id =R.drawable.ima3 ),
                               contentDescription ="NewYork",
                               modifier = Modifier.fillMaxSize(),
                               contentScale = ContentScale.FillBounds
                           )

                           Icon(imageVector = Icons.Default.FavoriteBorder ,
                               contentDescription = "favorite",
                               tint = Color.White ,
                               modifier = Modifier
                                   .align(Alignment.TopEnd)
                                   .padding(15.dp)
                           )

                       }

                   }
                   Spacer(modifier = Modifier.height(5.dp))

                   androidx.compose.material3.Text(
                       text = "Amos Chair" ,
                       fontSize = 20.sp ,
                       fontFamily = FontFamily.Serif ,
                       fontWeight = FontWeight.ExtraBold
                   )
                   Spacer(modifier = Modifier.height(5.dp))

                   Row (
                   ) {
                       Column {
                           androidx.compose.material3.Text(
                               text = "Les Chaises sont de"
                               ,
                               fontSize = 10.sp ,
                               fontFamily = FontFamily.Serif,
                               color = Color.Gray
                           )
                           androidx.compose.material3.Text(
                               text = "bonnes qualites"
                               ,
                               fontSize = 10.sp ,
                               fontFamily = FontFamily.Serif,
                               color = Color.Gray
                           )


                       }
                   }

                   Spacer(modifier = Modifier.height(5.dp))

                   Row {
                       androidx.compose.material3.Text(
                           text = "$680" ,
                           fontSize = 22.sp ,
                           fontFamily = FontFamily.Serif ,
                           fontWeight = FontWeight.ExtraBold,
                           color = Color.Black,
                           modifier = Modifier.padding(end=100.dp)
                       )

                       Icon(imageVector = Icons.Default.ShoppingCart, contentDescription ="Panier d'achat",
                           tint = Color.Gray,)


                   }

               }
// End of row1 part2

           }
           // End of Row1


       }
    }
}

@Preview(showBackground = true , showSystemUi = true )
@Composable
fun ChaisePreview () {
    Chaise()
}