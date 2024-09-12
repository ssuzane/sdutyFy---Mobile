package br.senai.sp.jandira.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import br.senai.sp.jandira.R

@Composable
fun escolhaMateria(modifier: Modifier = Modifier) {

    var mat by remember { mutableStateOf(false) }

    var lp by remember { mutableStateOf(false) }

    var his by remember { mutableStateOf(false) }

    var fis  by remember { mutableStateOf(false) }

    var bio  by remember { mutableStateOf(false) }

    var qui  by remember { mutableStateOf(false) }

    var geo  by remember { mutableStateOf(false) }

    var filo  by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFFEE101))
    ) {


        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .align(Alignment.CenterHorizontally)
                .height(200.dp)
                .width(200.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.calabreso),
                contentDescription = "Mascote",
                modifier = Modifier
                    .size(130.dp)
                    .align(Alignment.Center)
                    .padding(bottom = 20.dp)
            )




            Text(
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color(0xFF302F2F),
                text = "Cadastre-se",
                modifier = Modifier
                    .offset(x = 15.dp, y = 150.dp)
            )
        }

        Box(
            modifier = Modifier
                .offset(x = 0.dp, y = 120.dp)
                .fillMaxHeight()
                .fillMaxWidth()
                .background(color = Color(0xFFEEEEEE))
                .align(
                    Alignment.CenterHorizontally
                )
        )

    }
    Box(
        modifier = Modifier
            .offset(x = 20.dp, y = 250.dp)
            .background(Color.White)
            .height(500.dp)
            .width(350.dp)
            .zIndex(1f)
    ){
        Column(modifier = Modifier.padding(20.dp)) {
            Text(text = "Nos diga 2 materias que queira estudar.",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
                )
            Spacer(modifier = Modifier.height(100.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Column {
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Checkbox(
                            checked = mat, // Replace with your logic
                            onCheckedChange = { mat = it }
                        )
                        Text(text = "Matemática")
                    }
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Checkbox(
                            checked = lp, // Replace with your logic
                            onCheckedChange = { lp = it }
                        )
                        Text(text = "Lingua Portuguesa")
                    }
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Checkbox(
                            checked = his, // Replace with your logic
                            onCheckedChange = { his = it}
                        )
                        Text(text = "Historia")
                    }
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Checkbox(
                            checked = fis, // Replace with your logic
                            onCheckedChange = { fis = it }
                        )
                        Text(text = "Fisica")
                    }
                }
                Column(modifier = Modifier.offset(x = 20.dp)) {
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Checkbox(
                            checked = bio, // Replace with your logic
                            onCheckedChange = { bio = it }
                        )
                        Text(text = "Biologia")
                    }
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Checkbox(
                            checked = qui, // Replace with your logic
                            onCheckedChange = { qui = it }
                        )
                        Text(text = "Quimica")
                    }
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Checkbox(
                            checked = geo, // Replace with your logic
                            onCheckedChange = { geo = it }
                        )
                        Text(text = "Geografia")
                    }
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Checkbox(
                            checked = filo, // Replace with your logic
                            onCheckedChange = { filo = it }
                        )
                        Text(text = "Filosofia")
                    }
                }
            }
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun escolhaMateriaPreview() {
    escolhaMateria()
}