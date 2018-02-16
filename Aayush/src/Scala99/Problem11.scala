package Scala99


// Modified run-length encoding.
object Problem11 extends App {
  val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

  val encodedList: List[(Int, Char)] = Problem10.encoding(list)

  val finalList = encodedList.map( element =>
    if(element._1 == 1) element._2
    else element
  )

  println(finalList)
}
