package dev.spikeysanju.einsen.utils

import dev.spikeysanju.einsen.model.Task

sealed class SingleViewState {
    // Represents different states for the LatestNews screen
    object Empty : SingleViewState()
    object Loading : SingleViewState()
    data class Success(val task: Task) : SingleViewState()
    data class Error(val exception: Throwable) : SingleViewState()
}
