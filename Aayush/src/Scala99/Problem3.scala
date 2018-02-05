package Scala99


// Find the Kth element of a list
object Problem3 extends App {

  private def findElement[A](list: List[A], index: Int): A = index match {
    case 0 => list.head
    case x if x < list.length => findElement(list.tail, x-1)
    case _ => throw new Exception("No Such index present in List")
  }

  val list = List(1,2,3,4,5,6,7,8,9)
  val strList = List("Aayush", "Alex", "Sam", "John", "Zack")

  println(findElement(list, 4)+" \tList->"+list)
  println(findElement(strList, 3)+" \tList->"+strList)
}

