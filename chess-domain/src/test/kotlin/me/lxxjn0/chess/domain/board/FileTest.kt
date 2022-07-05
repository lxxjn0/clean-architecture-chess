package me.lxxjn0.chess.domain.board

import io.kotest.assertions.assertSoftly
import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import me.lxxjn0.chess.domain.chessboard.File

class FileTest : ExpectSpec() {
    init {
        context("fromNotation") {
            expect("notation에 해당하는 File을 반환한다") {
                val actual = File.fromNotation("A")

                assertSoftly(actual) {
                    shouldNotBeNull()
                    number shouldBe File.A.number
                    notation shouldBe File.A.notation
                }
            }

            expect("notation에 해당하는 File이 없을 경우 null을 반환한다") {
                val actual = File.fromNotation("Z")

                actual.shouldBeNull()
            }
        }
    }
}
