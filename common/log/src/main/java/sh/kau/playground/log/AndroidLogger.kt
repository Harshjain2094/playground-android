<<<<<<<< HEAD:common/log/src/main/java/harsh/starter/playground/common/log/AndroidLogger.kt
package harsh.starter.playground.common.log
========
package sh.kau.playground.log
>>>>>>>> origin/master:common/log/src/main/java/sh/kau/playground/log/AndroidLogger.kt

import logcat.AndroidLogcatLogger
import logcat.LogPriority
import logcat.LogcatLogger
import me.tatarka.inject.annotations.Inject
<<<<<<<< HEAD:common/log/src/main/java/harsh/starter/playground/common/log/AndroidLogger.kt
import harsh.starter.playground.domain.shared.di.Named
========
import sh.kau.playground.shared.di.Named
>>>>>>>> origin/master:common/log/src/main/java/sh/kau/playground/log/AndroidLogger.kt
import software.amazon.lastmile.kotlin.inject.anvil.AppScope
import software.amazon.lastmile.kotlin.inject.anvil.ContributesBinding
import software.amazon.lastmile.kotlin.inject.anvil.SingleIn

/**
 * Only reason we have this vs using AndroidLogcatLogger directly is:
 * - control verbosity priority for Android logs
 * - control if logs sent for debuggable app
 * - demonstrate/show-off multibinding with kotlin-inject
 */
@Inject
@SingleIn(AppScope::class)
@ContributesBinding(AppScope::class, multibinding = true)
class AndroidLogger(
    @Named("debuggableApp") val debuggableApp: Boolean,
    androidLogger: AndroidLogcatLogger = AndroidLogcatLogger(LogPriority.VERBOSE), // usually DEBUG
) : LogcatLogger by androidLogger {

  override fun isLoggable(priority: LogPriority): Boolean =
      super.isLoggable(priority) && debuggableApp
}
