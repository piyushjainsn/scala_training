package Scala99


// Pack consecutive duplicates of list elements into sublists
object Problem9 extends App {

  private def generateSubList[A](list: List[A]): List[List[A]] = {
    def iterator(list: List[A], result: List[List[A]]): List[List[A]] = list match {
      case Nil => result
      case _ =>{
        val (x: List[A], y: List[A]) = list.span{ _ == list.head }
        iterator(y, (result:::List(x)))
      }
    }
    iterator(list, List())
  }

  val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println("List-> " + generateSubList(list))
}
