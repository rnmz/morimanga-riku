package module.title

import kotlinx.datetime.LocalDate

data class Chapter(
    val id: Int,
    val url: String,
    val name: String,
    val releaseDate: LocalDate,
)
