//Prob-1: Find Last element of List

val list=List(1,2,3,4,5,6)

def lastElement[T](list:List[T]):Option[T]={
  list match {
    case List()=>None
    case head::Nil=>Some(head);
    case head::tail=>lastElement(tail)
  }
}

lastElement(list);

//Prob-2:  Find the last but one element of a List

def penultimate[T](list:List[T]):Option[T]={
  list match{
    case List()=>None
    case head::Nil=>None
    case head::tail if tail.tail==Nil =>Some(head)
    case head::tail=>penultimate(tail)

  }
}

penultimate(list)

//Prob-3: Find the Kth element of a list.

def nth[T](n:Int,list: List[T]):Option[T]={
  (n,list)match {
    case (0,x::xs) => Some(x)
    case (n,x::xs) => nth(n-1,xs)
    case _ => None
  }
}

nth(2,list)
nth(6,list)  //None


//Prob-4: Find the number of elements of a list.

def length[T](list:List[T]):Int={
  list match{
    case x::xs => 1 + length(xs)
    case _ => 0
  }
}

length(list)

//Prob-5: Reverse a list.

def reverseList[T](list : List[T]) : List[T] = {
  list match {
    case Nil => list
    case (x :: xs) => reverseList(xs) ::: List(x)
  }
}

reverseList(list)


//Prob-6:  Find out whether a list is a palindrome.

def isPalindrome[T](list:List[T]):Boolean=
  (list.head, list.last) match {
  case (a,b) if a==b && list.size>2 => isPalindrome(list.tail.dropRight(1))
  case (a,b) if a==b && list.size<=2 => true
  case (a,b) if a!=b =>false
}

//def isPalindrome[A](list: List[A]) = list == list.reverse

isPalindrome(List(1,2,1))

//Prob-7: Flatten a nested list structure.

//def flatten[T](list:List[T]):List[T]={
//  list.flatMap{
//    case list:List[T]=>flatten(list)
//    case e=>List(e)
//  }
//}

def flatten[T](list: List[T]): List[Any] =
  list match {
  case Nil => Nil
  case (x: List[T]) :: xs => flatten(x) ::: flatten(xs)
  case x :: xs => x :: flatten(xs)
}

flatten(List(List(1,2),List(3,4,5)))


//Prob-8: Eliminate consecutive duplicates of list elements.


def compress(list: List[Any]): List[Any] = {
  def comp(l: List[Any], last: Any): List[Any] = {
    l match {
      case Nil => Nil
      case x :: xs if x == last => comp(xs, x)
      case x :: xs => x :: comp(xs, x)
    }
  }
  comp(list, Nil)
}

compress(List(1,1,2,3,1,2,3,4,5,6,1,2,2,3,3,4,4,5,6,7,8,9))

//Prob-9: Pack consecutive duplicates of list elements into sublists.

def pack[T](list: List[T]): List[List[T]] = {
  if (list.isEmpty) List(List())
  else {
    val (packed, next) = list span { _ == list.head }
    if (next == Nil) List(packed)
    else packed :: pack(next)
  }
}
pack(list).map{ p =>
  (p.length, p.head)
}


pack(List(1,1,1,2,2,3,1,2,1,1,2,3,4,4,4,5,6,7))


//Prob-10: Run-length encoding of a list.

def encode[T](list:List[T]):List[(Int, T)] = {
  def pack[T](list: List[T]): List[List[T]] = {
    if (list.isEmpty) List(List())
    else {
      val (packed, next) = list span { _ == list.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
  pack(list).map{ p =>
    (p.length, p.head)
  }
}

encode(List(1,1,1,2,2,3,1,2,1,1,2,3,4,4,4,5,6,7))
