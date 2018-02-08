//Prob-11: Modified run-length encoding.

def encodeModified[T](list:List[T]):List[Any] = {
  def encodedChunck(l:List[T]) =
    if(l.length == 1)
      l.head
    else
      (l.length, l.head)

  if (list.isEmpty) List()
  else {
    val (head, next) = list.span { _ == list.head }
    val encoded = encodedChunck(head)
    if (next == Nil) List(encoded)
    else encoded :: encodeModified(next)
  }
}

encodeModified(List(1,1,1,2,3,1,2,1,1,2,3,4,4,4,5,6,7))

//Prob-12: Decode a run-length encoded list.

def decode[A](list:List[(Int,A)]):List[A]={
  list.flatMap(tup =>List.fill(tup._1)(tup._2))
}

decode(List((3,1),(2,2)))

//Prob-13: Run-length encoding of a list (direct solution).

def encodeDirect[T](list:List[T]):List[Any] = {
  def encodedChunck(l:List[T]) =
    if(l.length == 1)
      (l.head)
    else
      (l.length, l.head)

  if (list.isEmpty) List()
  else {
    val (head, next) = list.span { _ == list.head }
    val encoded = encodedChunck(head)
    if (next == Nil) List(encoded)
    else encoded :: encodeModified(next)
  }
}

encodeDirect(List(1,1,1,2,3,1,2,1,1,2,3,4,4,4,5,6,7))

//Prob-14: Duplicate the elements of a list.

def duplicate[A](list: List[A]):List[A]={
  list.flatMap(tup=>List.fill(2)(tup))
}

duplicate(List(1,2,3,2,3,3))

//Prob-15: Duplicate the elements of a list a given number of times.

def duplicateNumberOfTimes[A](n:Int,list: List[A]):List[A]={
  list.flatMap(tup=>List.fill(n)(tup))
}

duplicateNumberOfTimes(3,List(1,2,3,2,3,3))

//Prob-16: Drop every Nth element from a list.

def drop[A](n:Int,list:List[A]):List[A]={
  def dropIdx(i:Int, ittList:List[A], newList:List[A]):List[A] = {
    if(ittList.isEmpty) newList
    else if(i % n == 0) dropIdx(i+1, ittList.tail, newList)
    else dropIdx(i+1, ittList.tail, ittList.head :: newList)
  }
  dropIdx(1, list, List.empty).reverse
}

drop(3,List(1,2,3,4,5,6,7,8,9,0))


//Prob-17: Split a list into two parts.


def split[T](i: Int, list: List[T]) =
list.zipWithIndex.foldLeft((List[T](), List[T]())) { (acc, iTuple) =>
 acc match {
   case (first, second) =>
       iTuple match {
         case (x, pos) =>
             if (i > pos)
               (first ::: List(x), second)
             else
             (first, second ::: List(x))
       }
   }
}

split(5,List(1,2,3,4,5,6,7,8))

//Prob-18: Extract a slice from a list.

def slice[T](n:Int,k:Int,list:List[T]):List[T]={
  list.zipWithIndex.foldLeft(List[T]()){(acc,tuple)=>
    tuple match {
      case (x,pos)=>
        if(pos>=n && pos<k)
          acc:::List(x)
        else
          acc
    }
  }
}


slice(2,5,List(1,2,3,4,5,6,7,8,9,10))

//Prob-19: Rotate a list N places to the left.

def rotate[A](n:Int,list:List[A]):List[A]={
  n match{
    case n if n>0 => list match {
      case head::xs=>rotate(n-1,xs:::List(head))
      case Nil=>rotate(n-1,Nil)
    }
    case n if n<0 => list.reverse match {
      case head::xs =>rotate(n+1,head::xs.reverse)
      case Nil=>rotate(n+1,Nil)
    }
    case _=>list
  }
}

rotate(2,List(1,2,3,4,5,6,7,8,9))
rotate(-2,List(1,2,3,4,5,6,7,8,9))

//Prob-20: Remove the Kth element from a list.

def removeAt[T](i: Int, list: List[T]):(List[T],T)= {
  val resList = list.zipWithIndex.foldLeft(List[T]()) { (acc, tuple) =>
    tuple match {
      case (item, idx) if idx == i => acc
      case (item, idx) => acc ::: List(item)
    }
  }
  (resList, list(i))
}

removeAt(5,List(1,2,3,4,5,6,7,8,9))