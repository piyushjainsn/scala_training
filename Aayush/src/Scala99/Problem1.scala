package Scala99


// Find the last element of a list
object Problem1 extends App {

  val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val strList = List("Aayush", "Alex", "Sam", "John", "Zack")

  private def lastElement[A](ele: List[A]): A= ele match {
    case x :: Nil => x
    case _ :: tail => lastElement(tail)
    case _ => throw new Exception("List is Empty")
  }

  println(lastElement(list))
  println(lastElement(strList))
}

