package dev.spikeysanju.einsen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Slider
import androidx.compose.material.SliderDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import dev.spikeysanju.einsen.ui.theme.typography

@Composable
fun StepSlider(stepCount: Int, value: Float, onValueChanged: (Float) -> Unit) {
    Column(
        Modifier
            .fillMaxWidth()
    ) {
        Slider(
            value = value,
            onValueChange = { onValueChanged(it) },
            valueRange = 0f..4f,
            steps = 4,
            colors = SliderDefaults.colors(
                thumbColor = colors.primary,
                activeTrackColor = colors.primary,
                inactiveTrackColor = colors.primaryVariant,
                disabledThumbColor = colors.secondaryVariant
            )
        )
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            for (i in 0..stepCount) {
                Text(
                    i.toString(),
                    style = typography.subtitle1,
                    textAlign = TextAlign.Center,
                    color = colors.onPrimary
                )
            }
        }
    }
}
