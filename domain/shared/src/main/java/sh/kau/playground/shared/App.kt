<<<<<<<< HEAD:domain/shared/src/main/java/harsh/starter/playground/domain/shared/App.kt
package harsh.starter.playground.domain.shared
========
package sh.kau.playground.shared
>>>>>>>> origin/master:domain/shared/src/main/java/sh/kau/playground/shared/App.kt

/**
 * This is the main application interface.
 *
 * We use this interface in order to make the Application object across the DI graph without setting
 * up a reverse dependency back to the main :app module.
 */
interface App {
  val isDebuggable: Boolean
}
