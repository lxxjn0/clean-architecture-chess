package me.lxxjn0.chess.domain.chessboard

enum class File(
    val number: Int,
    val notation: String,
) {
    A(1, "A"),
    B(2, "B"),
    C(3, "C"),
    D(4, "D"),
    E(5, "E"),
    F(6, "F"),
    G(7, "G"),
    H(8, "H"),
    ;

    companion object {
        fun fromNotation(notation: String) = File.values().firstOrNull { notation == it.notation }
    }
}
