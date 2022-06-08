// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            Text(
                text = "Hello World",
                fontSize = 30.sp,
                modifier = Modifier.align(Alignment.Center)
            )

            Button(onClick = {
                text = "Hello, Androides from Desktop!"
            }) {
                Text(text)
            }
        }
    }
}

fun main() = application {
    Window(
        title = "No Time Momi by MomiGroup",
        state = rememberWindowState(width = 400.dp, height = 400.dp),
        alwaysOnTop = true,
        onCloseRequest = ::exitApplication
    ) {
        App()
    }
}
