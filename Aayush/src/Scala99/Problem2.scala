package Scala99


// Find the last but one element of a list
object Problem2 extends App {

  private def secondLastElement[A](list: List[A]): A = list match {
    case secondLast :: last :: Nil => secondLast
    case _ :: tail => secondLastElement(tail)
    case _ => throw new Exception("List is Empty")
  }

  val list = List(1,2,3,4,5,6,7,8,9)
  val strList = List("Aayush", "Alex", "Sam", "John", "Zack")

  println(secondLastElement(list))
  println(secondLastElement(strList))
}
