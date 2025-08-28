package com.gemwallet.features.settings.networks.viewmodels.models

import com.gemwallet.android.model.NodeStatus
import com.wallet.core.primitives.Chain


class AddNodeUIModel(
    val chain: Chain? = null,
    val status: NodeStatus? = null,
    val checking: Boolean = false,
)