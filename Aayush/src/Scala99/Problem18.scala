package Scala99


// Extract a slice from a list.
object Problem18 extends App {

  def sliceList[A](start: Int, end: Int, list: List[A]): List[A] = {
    def generator(list: List[A], result: List[A], currentIndex: Int): List[A] = (currentIndex, list) match {
      case (_, Nil) => result
      case (x, _) if (end <= x) => result
      case (x, h :: tail) if (start <= x) => generator(tail, result :+ h, x+1)
      case (x, _ :: tail) => generator(tail, result, x+1)
    }
    generator(list, List.empty, 0)
  }

  val list = List('a','b','c','d','e','f','g','h','i','j','k')

  println(sliceList(3,7,list))
}
