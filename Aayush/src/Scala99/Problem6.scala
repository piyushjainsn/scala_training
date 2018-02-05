package Scala99


// Find out whether a list is a palindrome
object Problem6 extends App {

  private def palindromeChecker[A](list: List[A]): Boolean = {
    def iterator[A](list: List[A], result: Boolean): Boolean = list match {
      case Nil => result
      case List(a) => result
      case ele => iterator(ele.tail.init, (result && ele.head == ele.last))     // ele.tail.init -> to remove 1st and last element from list
    }
    iterator(list, true)
  }

  val list = List(1,2,3,2,1)
  val list1 = List(1,2,4,5,6,5,4,2)

  println("List->"+list+" is Palindrome "+palindromeChecker(list))
  println("List->"+list1+" is Palindrome "+palindromeChecker(list1))
}
