package module.title

data class SimpleTitleInfo(
    val remoteId: String,
    val poster: String,
    val name: String,
    val description: String,
    val genres: List<String>
)