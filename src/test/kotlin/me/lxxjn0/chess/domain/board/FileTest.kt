package me.lxxjn0.chess.domain.board

import io.kotest.assertions.assertSoftly
import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe

class FileTest : ExpectSpec() {
    init {
        context("fromNotation") {
            expect("표기법에 해당하는 File을 반환한다") {
                val actual = File.fromNotation("A")

                assertSoftly(actual) {
                    shouldNotBeNull()
                    number shouldBe File.A.number
                    notation shouldBe File.A.notation
                }
            }

            expect("File에 존재하지 않는 표기법의 경우 null을 반환한다") {
                val actual = File.fromNotation("Z")

                actual.shouldBeNull()
            }
        }
    }
}
