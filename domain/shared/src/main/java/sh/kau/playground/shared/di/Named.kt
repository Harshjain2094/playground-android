<<<<<<<< HEAD:domain/shared/src/main/java/harsh/starter/playground/domain/shared/di/Named.kt
package harsh.starter.playground.domain.shared.di
========
package sh.kau.playground.shared.di
>>>>>>>> origin/master:domain/shared/src/main/java/sh/kau/playground/shared/di/Named.kt

import me.tatarka.inject.annotations.Qualifier

@Qualifier
@Target(
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.TYPE)
annotation class Named(val value: String)
