//using Recursion and Pattern matching print each element of a list


var list  = List(1,2,3,4,5)

//using recursion Print Element of List

  def recListPrint(list: List[Any]):Unit = {
    println(list.head+" ")

    if(!list.isEmpty){
      if(!list.tail.isEmpty )
        recListPrint(list.tail)
      else
        return
    }

  }

recListPrint(list)

//using pattern matching Print Element of List

def PatternMatchListPrint(list: List[Any]): Unit ={
  list match {
    case x::xs => {
      println(x)
      PatternMatchListPrint(xs)
    }
    case _ => Nil
  }
}

PatternMatchListPrint(list)