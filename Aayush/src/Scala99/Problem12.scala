package Scala99


// Decode a run-length encoded list
object Problem12 extends App {

 val encodedList = List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))

  def decodeList[A](list: List[(Int, A)]): List[Char] = encodedList.flatMap( element => List.fill(element._1)(element._2))

  println(decodeList(encodedList))
}
