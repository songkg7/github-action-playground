import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class CalculatorTest : FreeSpec({

    "1 + 1 = 2" {
        val calc = Calculator()
        calc.sum(1, 1) shouldBe 2
    }

    "1 - 1 = 0" {
        val calc = Calculator()
        calc.subtract(1, 1) shouldBe 0
    }

    "2 * 3 = 6" {
        val calc = Calculator()
        calc.multiply(2, 3) shouldBe 6
    }

    "6 / 3 = 2" {
        val calc = Calculator()
        calc.divide(6, 3) shouldBe 2
    }
})
