package me.lxxjn0.chess.domain.board

import io.kotest.assertions.assertSoftly
import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import me.lxxjn0.chess.domain.chessboard.File
import me.lxxjn0.chess.domain.chessboard.Rank

class RankTest : ExpectSpec() {
    init {
        context("fromNotation") {
            expect("notation에 해당하는 Rank를 반환한다") {
                val actual = Rank.fromNotation("1")

                assertSoftly(actual) {
                    shouldNotBeNull()
                    number shouldBe Rank.ONE.number
                    notation shouldBe Rank.ONE.notation
                }
            }

            expect("notation에 해당하는 Rank가 없을 경우 null을 반환한다") {
                val actual = File.fromNotation("9")

                actual.shouldBeNull()
            }
        }

    }
}
