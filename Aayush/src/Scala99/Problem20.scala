package Scala99


// Remove the Kth element from a list
object Problem20 extends App {

  def removeAt[A](n: Int, l: List[A]):(List[A], A) = {
    if (l.length <= n ) throw new NoSuchElementException
    (l.take(n):::l.drop(n).tail, l(n))
  }

  val list = List(1,2,3,4,5,6,7,8,9,34,45)

  println(removeAt(3, list))
}
