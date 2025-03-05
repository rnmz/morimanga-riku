package extensions.base

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import module.extension.ExtensionInfo
import module.title.Title
import module.title.TitleList

abstract class ExtensionBase {
    val httpClient = HttpClient(CIO) {
        BrowserUserAgent()
        install(ContentNegotiation) {
            json(Json {
                coerceInputValues = true
                ignoreUnknownKeys = true
            })
        }
    }

    abstract fun extensionInfo(): ExtensionInfo

    abstract suspend fun getGenres(): List<String>
    abstract suspend fun getLatestTitles(page: Int): TitleList
    abstract suspend fun getTitleInfo(id: String): Title
    abstract suspend fun getTitleChapter(chapterId: Int, titleId: String): List<String>
    abstract suspend fun search(page: Int, orderBy: OrderType, name: String?, genres: List<String>?, years: List<Int>?): TitleList

    companion object {
        fun newExtensionInstance(extension: Extensions): ExtensionBase = extension.instance
    }
}
