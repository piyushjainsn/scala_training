package Scala99


// Flatten a nested list structure
object Problem7 extends App {

  private def flatteningList(list: List[Any]) :List[Any] = list match {
    case Nil => Nil
    case (x: List[Any]) :: tail => flatteningList(x) ::: flatteningList(tail)
    case x :: tail => x :: flatteningList(tail)
  }

  val a = List(1, 2)
  val b = List(1, 2)
  val c = List(a, b, 1)

  val d = List(a, b, c)

  println(flatteningList(d))
}
