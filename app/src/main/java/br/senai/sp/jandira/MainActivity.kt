package br.senai.sp.jandira

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.screens.cadastroCat
import br.senai.sp.jandira.ui.theme.StudyFYTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudyFYTheme {
                //Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    cadastroCat()
                }
            }
        }
    }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StudyFYTheme {
      cadastroCat()
    }
}