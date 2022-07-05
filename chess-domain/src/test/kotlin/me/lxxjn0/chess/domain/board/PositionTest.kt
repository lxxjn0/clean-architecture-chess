package me.lxxjn0.chess.domain.board

import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.shouldBe
import me.lxxjn0.chess.domain.chessboard.File
import me.lxxjn0.chess.domain.chessboard.Position
import me.lxxjn0.chess.domain.chessboard.Rank

class PositionTest : ExpectSpec() {
    init {
        context("notation") {
            expect("Position의 File과 Rank의 notation을 결합하여 반환한다") {
                val position = Position(File.A, Rank.ONE)

                position.notation shouldBe "A1"
            }
        }

        context("fromNotation") {
            expect("표기법에 해당하는 Position을 반환한다") {
                val expect = Position(File.A, Rank.ONE)

                Position.fromNotation("A1") shouldBe expect
            }

            expect("표기법에 해당하는 Position이 없을 경우 null을 반환한다") {
                Position.fromNotation("Z9").shouldBeNull()
            }
        }
    }
}
