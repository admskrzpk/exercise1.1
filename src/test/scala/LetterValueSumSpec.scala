import LetterValueSum.sumOfLetters
import org.scalatest.funsuite.AnyFunSuite

class LetterValueSumSpec extends AnyFunSuite {

  test("function should correctly count letters in accordence with a specifcation") {
    assert(sumOfLetters(" ") == 0)
    assert(sumOfLetters("a") == 1)
    assert(sumOfLetters("z") == 26)
    assert(sumOfLetters("cab") == 6)
    assert(sumOfLetters("excellent") == 100)
    assert(sumOfLetters("microspectrophotometries") == 317)
  }

  test("function should ommit characters which are not an letter") {
    assert(sumOfLetters("sc=al!a acAd31emy") == 88)
  }
}