package Scala99


// Duplicate the elements of a list a given number of times
object Problem15 extends App {

  def userInput(message: String) ={
    println(message)
    scala.io.StdIn.readLine()
  }

  def duplicateElements[A](list: List[A], times: Int): List[A] = {
    def generator(result: List[A], list: List[A]): List[A] = list match {
      case Nil => result
      case x :: tail => generator((result ::: List.fill(times)(x)), tail)
    }
    generator(List[A](), list)
  }

  val msg = "Please enter the number of times you want to repeat elements of List : "
  val input = userInput(msg).toInt
  val intList = List(1,3,5,78,9,16,4,7,6)
  val finalList = duplicateElements(intList, input)

  println(finalList)
}
