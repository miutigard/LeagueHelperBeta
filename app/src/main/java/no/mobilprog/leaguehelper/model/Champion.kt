package no.mobilprog.leaguehelper.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Champion(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)