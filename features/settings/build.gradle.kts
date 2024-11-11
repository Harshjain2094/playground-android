plugins {
  id("com.android.library")
  id("template.feature")
}

android {
  namespace = libs.versions.app.namespace.get() + ".${project.parent?.name}.${project.name}"
}

dependencies {
  // navigation
  implementation(libs.compose.navigation)
  implementation(libs.kotlinx.serialization.json)

  // internal
  implementation(project(":domain:ui"))
}