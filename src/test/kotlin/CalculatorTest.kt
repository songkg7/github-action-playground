import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class CalculatorTest : FreeSpec({

    "1 + 1 = 2" {
        val calc = Calculator()
        calc.sum(1, 1) shouldBe 2
    }

})
