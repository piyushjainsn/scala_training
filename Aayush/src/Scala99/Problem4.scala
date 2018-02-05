package Scala99



// Find the number of elements of a list
object Problem4 extends App {

  private def length[A](list: List[A]): Int = {
    def iterator[A](list: List[A], length: Int): Int = list match {
      case Nil => 0
      case _ :: Nil => length+1
      case _ :: tail => iterator(tail, length+1)
    }
    iterator(list, 0)
  }

  val list =List(1,2,3,4,5,6)
  val strList =List("Alex", "John", "Sam")

  println("List->"+list+" of Length-> "+length(list))
  println("List->"+strList+" of Length-> "+length(strList))
}
