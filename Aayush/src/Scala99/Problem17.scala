package Scala99


// Split a list into two parts
object Problem17 extends App {

  val msg = "Please enter the length og first List : "
  val lengthOfList = Problem15.userInput(msg).toInt

  def splitList[A](list: List[A], length: Int): (List[A], List[A]) = {
    def generator[A](list: List[A], firstList: List[A], curLength: Int): (List[A], List[A]) = (list, curLength) match {
        case (Nil, _) => (firstList, list)
        case (x :: tail, 1) => ((firstList :+ x), tail)
        case (x :: tail, _) => generator(tail, (firstList :+ x), curLength-1)
      }
    generator(list, List[A](), length)
  }

  val list = List(2,4,6,7,9,43,21,98,47)
  println(splitList(list, lengthOfList))
}
