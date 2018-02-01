//Pattern Matching Demo

object PatternDemo {
  // selector match
  // java - switch(selector)
  // java 'switch' is equivalent to scala 'match'
  // here selector is matched against each pattern
  // i.e. case section equivalent to each case which we have an evaluated expression

  def matchPatternTest(x : Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "default_case"
  }
}