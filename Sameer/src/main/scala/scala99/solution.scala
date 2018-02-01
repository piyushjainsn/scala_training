package scala99

object solution {

  def LastGeneric[T](list : List[T]) : T = {
    list match {
      case last :: Nil => last
      case _ :: tail => LastGeneric(tail)
      case _ => throw new NoSuchElementException
    }
  }

  def main(args: Array[String]) = {
    val list1 = List(2,23,2,3,42)
    val list2 = List("Sameer","Kunal","Neha",12,'a')
    val list3 = List()
    println(LastGeneric(list1))
    println(LastGeneric(list2))
//    println(lastGeneric(list3))

  }
}
