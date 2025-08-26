<<<<<<<< HEAD:domain/quoter/impl/src/main/java/harsh/starter/playground/domain/quoter/impl/QuotesRepoImpl.kt
package harsh.starter.playground.domain.quoter.impl
========
package sh.kau.playground.quoter
>>>>>>>> origin/master:domain/quoter/impl/src/main/java/sh/kau/playground/quoter/QuotesRepoImpl.kt

import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType
import io.ktor.http.contentType
import me.tatarka.inject.annotations.Inject
<<<<<<<< HEAD:domain/quoter/impl/src/main/java/harsh/starter/playground/domain/quoter/impl/QuotesRepoImpl.kt
import harsh.starter.playground.common.networking.NetworkApi
import harsh.starter.playground.domain.quoter.api.Quote
import harsh.starter.playground.domain.quoter.api.QuotesRepo
========
import sh.kau.playground.networking.NetworkApi
>>>>>>>> origin/master:domain/quoter/impl/src/main/java/sh/kau/playground/quoter/QuotesRepoImpl.kt
import software.amazon.lastmile.kotlin.inject.anvil.AppScope
import software.amazon.lastmile.kotlin.inject.anvil.ContributesBinding
import software.amazon.lastmile.kotlin.inject.anvil.SingleIn

@Inject
@SingleIn(AppScope::class)
@ContributesBinding(AppScope::class)
class QuotesRepoImpl(
    private val api: Lazy<NetworkApi>,
) : QuotesRepo {

  override suspend fun quoteForTheDay(): Quote {
    return fetchQuote()
  }

  private suspend fun fetchQuote(): Quote {
    val response: HttpResponse =
        api.value.client().get("https://zenquotes.io/api/today") {
          contentType(ContentType.Application.Json)
        }
    return response.body<List<Quote>>()[0]
  }
}
