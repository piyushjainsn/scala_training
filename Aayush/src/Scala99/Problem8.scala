package Scala99


// Eliminate consecutive duplicates of list elements
object Problem8 extends App {

  private def eliminateDuplicates(list: List[Any]): List[Any] = list match {
    case Nil => Nil
    case x :: tail => x :: eliminateDuplicates(tail.dropWhile(_ == x))
  }

  val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val names = List("Aayush", "Jack", "John", "John", "John", "Sam", "Sam")

  println("List after duplicate removal-> "+ eliminateDuplicates(list))
  println("List after duplicate removal-> "+ eliminateDuplicates(names))
}
