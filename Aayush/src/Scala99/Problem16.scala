package Scala99


// Drop every Nth element from a list
object Problem16 extends App {

  def dropElements[A](list: List[A], index: Int): List[A] ={
    def drop[A](result: List[A], list: List[A], curIndex: Int): List[A] = (curIndex, list) match {
      case (_, Nil) => result
      case (1, _ :: tail) => drop(result, tail, index)
      case (_, h :: tail) => drop((result :+ h), tail, (curIndex-1))
    }
    drop(List[A](), list, index)
  }

  val msg = "Enter your dropping preference : "
  val indexToDrop = Problem15.userInput(msg).toInt
  val list = List(1,34,56,3,24,64,23,65,2,6,8,9)

  println(dropElements(list, indexToDrop))
}
