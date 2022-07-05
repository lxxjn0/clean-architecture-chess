package me.lxxjn0.chess.domain.chessboard

data class Position(
    val file: File,
    val rank: Rank,
) {
    val notation: String
        get() = "${file.notation}${rank.notation}"

    companion object {
        private val CACHE: Map<String, Position> =
            enumValues<File>()
                .flatMap { file -> enumValues<Rank>().map { Position(file, it) } }
                .associateBy { it.notation }

        fun fromNotation(notation: String) = CACHE[notation]
    }
}
