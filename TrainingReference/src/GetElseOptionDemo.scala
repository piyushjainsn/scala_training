//Options Other Commonly used Methods

//getOrElse() Method - to access a default value or set value when no value ois present
object GetElseDemo {
  val a: Option[Int] = Some(5)
  val b: Option[Int] = None

  println("Value of a is: " + a.getOrElse(0))
  println("Value of b is: " + b.getOrElse(1))

  println(b.map(value => value * 2))

  //isEmpty Method
  println("Value of b is empty: " + b.get)
  println("Value of a is empty: " + a.isEmpty)

  //exists
}