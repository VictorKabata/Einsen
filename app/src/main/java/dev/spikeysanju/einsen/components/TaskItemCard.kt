package dev.spikeysanju.einsen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import dev.spikeysanju.einsen.ui.theme.typography
import dev.spikeysanju.einsen.ui.theme.white

@Composable
fun TaskItemCard(id: String, title: String, emoji: String, category: String, timer: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(110.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(colors.secondary)
            .clickable { }
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        // Emoji + (title + category)
        Row(
            modifier = Modifier
                .weight(2f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            EmojiTextView(emoji = emoji)
            Spacer(modifier = Modifier.width(12.dp))
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically),
            ) {
                Text(
                    text = title,
                    style = typography.subtitle1,
                    color = colors.onPrimary,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = category,
                    style = typography.caption,
                    color = colors.onPrimary.copy(.7f)
                )
            }
        }

        // timer
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = timer,
            style = typography.h6,
            color = colors.onPrimary,
            modifier = Modifier.padding(end = 20.dp)
        )

    }
}

@Composable
fun EmojiTextView(emoji: String) {
    Box(
        modifier = Modifier
            .size(80.dp)
            .padding(start = 12.dp, top = 12.dp, end = 12.dp, bottom = 12.dp)
            .clip(CircleShape)
            .clickable { }
            .background(colors.onPrimary)
    ) {
        Text(
            text = emoji,
            color = white,
            style = typography.subtitle1,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.Center)
        )
    }

}