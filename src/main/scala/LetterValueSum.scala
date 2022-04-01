object LetterValueSum extends App {


  def sumOfLetters(s: String): Int = {
    s.replaceAll(
      "[^a-zA-Z]", "")
      .map(_.toUpper.toInt - 64)
      .foldLeft(0)(_ + _)
  }

}

