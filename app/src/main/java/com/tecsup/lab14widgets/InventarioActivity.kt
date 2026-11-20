package com.tecsup.lab14widgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class InventarioActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                PantallaInventario()
            }
        }
    }
}

@Composable
fun PantallaInventario() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Text(
            text = "Control360 - Inventario",
            style = MaterialTheme.typography.headlineMedium
        )

        Text("Productos del almacén (demostración)")

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Teclado Logitech")
                Text("Stock: 25 unidades")
                Text("Ubicación: Estante A1")
            }
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Mouse inalámbrico")
                Text("Stock: 40 unidades")
                Text("Ubicación: Estante B2")
            }
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Monitor Samsung")
                Text("Stock: 12 unidades")
                Text("Ubicación: Estante C3")
            }
        }
    }
}
