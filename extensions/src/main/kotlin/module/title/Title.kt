package module.title

import kotlinx.datetime.LocalDate

data class Title(
    val id: String,
    val name: String,
    val posterUrl: String,
    val release: LocalDate,
    val description: String,
    val author: String,
    val genres: List<String>,
    val chapters: List<Chapter>
)