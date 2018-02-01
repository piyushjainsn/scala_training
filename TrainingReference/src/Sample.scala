object Sample {

  def main(args: Array[String]) = {
    println("welcome to scala training")
    val b = sampleMethod(3)
    println(b toString)

    val method: (Int) => Int = sampleMethod

  }

  def sampleMethod(a: Int) = {
    a + 1
  }


}


class Person
