package Scala99


// Run-length encoding of a list
object Problem10 extends App {

  private def encoding[A](list: List[A]): List[(Int, A)] = {
    def iterate(list: List[List[A]], result: List[(Int, A)]): List[(Int, A)] = list match {
      case Nil => result
      case h :: tail => iterate(tail, (result :+ (h.length, h.head)))
    }
    iterate(Problem9.generateSubList(list), List())
  }

  val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println(encoding(list))
}
