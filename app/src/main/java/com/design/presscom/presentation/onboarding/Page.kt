package com.design.presscom.presentation.onboarding

import androidx.annotation.DrawableRes
import com.design.presscom.R

data class Page(val title: String, val description: String, @DrawableRes val  image:Int)

val pages = listOf(
    Page("Welcome to presscom"," labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.", R.drawable.landing1),
    Page("We deliver the latest","Cpharetra, est eros bibendum elit, nec luctus magna felis sollicitudin mauris. Integer in mauris eu nibh euismod gravida. Duis ac tellus et risus vulputate vehicula. Donec lobortis risus a elit. Etiam tempor. Ut ullamcorper, ligula eu tempor .", R.drawable.landing2),
    Page("Most trusted media outlet","Donec , consequat quis, neque. Aliquam faucibus, elit ut dictum aliquet, felis nisl adipiscing sapien, sed malesuada diam lacus eget erat. Cras mollis scelerisque nunc. Nullam arcu. Aliquam consequat. Curabitur augue lorem..", R.drawable.landing3)
)