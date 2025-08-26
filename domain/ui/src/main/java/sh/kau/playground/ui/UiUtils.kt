<<<<<<<< HEAD:domain/ui/src/main/java/harsh/starter/playground/domain/ui/UiUtils.kt
package harsh.starter.playground.domain.ui

import android.content.Context
import harsh.starter.playground.domain.shared.App
========
package sh.kau.playground.ui

import android.content.Context
import sh.kau.playground.shared.App
>>>>>>>> origin/master:domain/ui/src/main/java/sh/kau/playground/ui/UiUtils.kt

/**
 * This provides a type-safe way to access the Application instance from within a Composable,
 * typically used when trying to get a DI component setup.
 */
fun Context.app(): App {
  return applicationContext as App
}
