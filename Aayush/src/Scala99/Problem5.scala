package Scala99


// Reverse a list
object Problem5 extends App {

  private def reverse[A](list: List[A]): List[A] = {
    val reversedList = List()
    def iterator[A](list: List[A]): List[A] = list match {
      case Nil => reversedList
      case x :: _ => reversedList :+ x
    }
    iterator(list)
  }

  val list = List(1,2,4,6,7,3,8)
  val strList = List("Sam", "Alex", "John", "Brad")

  println("Original List->"+list+"\tReversed List->"+reverse(list))
  println("Original List->"+strList+"\tReversed List->"+reverse(strList))
}
