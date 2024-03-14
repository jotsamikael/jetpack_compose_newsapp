package com.design.presscom.presentation.onboarding.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.UiMode
import androidx.compose.ui.unit.dp
import com.design.presscom.Greeting
import com.design.presscom.R
import com.design.presscom.presentation.onboarding.Page
import com.design.presscom.presentation.onboarding.component.Dimens.mediumPadding1
import com.design.presscom.presentation.onboarding.component.Dimens.mediumPadding2
import com.design.presscom.ui.theme.PresscomTheme

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page
) {
    Column(modifier) {
        Image(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.6f)
            ,painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop)
        Spacer(modifier.height(mediumPadding1))

        Text(text = page.title, modifier = Modifier.padding(horizontal = mediumPadding2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight= FontWeight.Bold),
            color = colorResource(id = R.color.display_small))

        Text(text = page.description, modifier = Modifier.padding(horizontal = mediumPadding2),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium))
    }


}

@Preview(showBackground = true)
@Preview(uiMode = UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun previewOnboardingPage(){
    PresscomTheme {
        OnBoardingPage(

            page = Page(
                title = "Lorem Ipsum is simply dummy",
                description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n" +
                        "\n" +
                        "Curabitur pretium tincidunt lacus. Nulla gravida orci a odio. Nullam varius, turpis et commodo pharetra, est eros bibendum elit, nec luctus magna felis sollicitudin mauris. Integer in mauris eu nibh euismod gravida. Duis ac tellus et risus vulputate vehicula. Donec lobortis risus a elit. Etiam tempor. Ut ullamcorper, ligula eu tempor congue, eros est euismod turpis, id tincidunt sapien risus a quam. Maecenas fermentum consequat mi. Donec fermentum. Pellentesque malesuada nulla a mi. Duis sapien sem, aliquet nec, commodo eget, consequat quis, neque. Aliquam faucibus, elit ut dictum aliquet, felis nisl adipiscing sapien, sed malesuada diam lacus eget erat. Cras mollis scelerisque nunc. Nullam arcu. Aliquam consequat. Curabitur augue lorem, dapibus quis, laoreet et, pretium ac, nisi. Aenean magna nisl, mollis quis, molestie eu, feugiat in, orci. In hac habitasse platea dictumst.",
                image = R.drawable.landing1
            )
        )
    }
}


object  Dimens{
    val mediumPadding1 = 24.dp
    val mediumPadding2 = 30.dp
    val IndicatorSize = 14.dp
    val PageIndicatorWidth = 52.dp

}