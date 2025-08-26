<<<<<<<< HEAD:domain/quoter/api/src/main/java/harsh/starter/playground/domain/quoter/api/QuotesRepo.kt
package harsh.starter.playground.domain.quoter.api
========
package sh.kau.playground.quoter
>>>>>>>> origin/master:domain/quoter/api/src/main/java/sh/kau/playground/quoter/QuotesRepo.kt

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

interface QuotesRepo {
  suspend fun quoteForTheDay(): Quote
}

@Serializable
data class Quote(
    @SerialName("q") val quote: String,
    @SerialName("a") val author: String,
)
