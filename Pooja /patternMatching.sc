//using recursion and pattern matching print each element of a list


var list  = List(1,2,3,"s")

//using recursion
object recursion{
  def recursiveList(list: List[Any]):Unit = {
    println(list.head+" ")

    if(!list.isEmpty){
      if(!list.tail.isEmpty )
        recursiveList(list.tail)
      else
        return
    }

  }
}
recursion.recursiveList(list)

//using pattern matching

def patternMatching(list: List[Any]): Unit ={
  list match {
    case x::xs => {
      println(x)
      patternMatching(xs)
    }
    case _ => Nil
  }
}

patternMatching(list)