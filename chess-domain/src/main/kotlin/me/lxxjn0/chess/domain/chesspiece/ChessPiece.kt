package me.lxxjn0.chess.domain.chesspiece

import me.lxxjn0.chess.domain.chesspiece.movement.PieceMovement

abstract class ChessPiece(
    val pieceType: PieceType,
    val movement: PieceMovement,
) {
}
