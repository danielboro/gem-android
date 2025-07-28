package com.gemwallet.features.asset.viewmodels.details.models

sealed interface AssetInfoUIState {
    class Idle(val sync: SyncState = SyncState.None) : AssetInfoUIState

    object Loading: AssetInfoUIState

    class Error() : AssetInfoUIState

    class Fatal(val error: AssetStateError) : AssetInfoUIState

    enum class SyncState {
        None,
        Wait,
        Process,
        Loading,
    }
}

sealed interface AssetStateError {
    data object AssetNotFound : AssetStateError
}