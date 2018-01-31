package scala99

object Solution_P02 {
  def SecondLast[T](list: List[T]): T={
    list match {
      case secondlast:: _ :: Nil => secondlast
      case _ :: tail => SecondLast(tail)
      case _ => throw new NoSuchElementException
    }
  }
  def main(args: Array[String]): Unit = {
    val list =  List("as",12,34,56)
    println(SecondLast(list))

  }
}
