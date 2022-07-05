package me.lxxjn0.chess.domain.chesspiece.movement

import me.lxxjn0.chess.domain.chessboard.Position

interface PieceMovement {
    fun move(source: Position, target: Position)

    fun catch(source: Position, target: Position) = move(source, target)
}
