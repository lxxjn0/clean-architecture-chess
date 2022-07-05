package me.lxxjn0.chess.domain.chessboard

enum class Rank(
    val number: Int,
    val notation: String,
) {
    ONE(1, "1"),
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    ;

    companion object {
        fun fromNotation(notation: String) = values().firstOrNull { notation == it.notation }
    }
}
