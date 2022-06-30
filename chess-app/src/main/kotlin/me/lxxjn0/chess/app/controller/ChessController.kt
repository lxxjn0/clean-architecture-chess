package me.lxxjn0.chess.app.controller

import me.lxxjn0.chess.app.controller.dto.request.MoveRequest
import me.lxxjn0.chess.app.service.ChessService

class ChessController(
    private val service: ChessService,
) {
    fun move(request: MoveRequest) {
        service.move(request.source, request.target)
    }
}
