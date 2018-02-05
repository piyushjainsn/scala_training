package Scala99


// Find the last element of a list
object Problem1 extends App {

  val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

  private def lastElement(ele: List[Int]): Int= ele match {     // Need a generic type function
    case x :: Nil => x
    case _ :: tail => lastElement(tail)
    case _ => throw new Exception("List is Empty")
  }

  println(lastElement(list))
}
