package harsh.starter.playground.features.landing.nav

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import harsh.starter.playground.features.landing.ui.LandingScreen

@Serializable object LandingScreenRoute

fun NavGraphBuilder.addLandingRoute(
    name: String = "Default name",
    modifier: Modifier = Modifier,
    onNavigateToSettings: () -> Unit,
) {
  composable<LandingScreenRoute> {
      LandingScreen(
          name = name,
          modifier = modifier,
          onNavigateToSettings = onNavigateToSettings,
      )
  }
}
