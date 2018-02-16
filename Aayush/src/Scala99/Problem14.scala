package Scala99


// Duplicate the elements of a list
object Problem14 extends App{

  def duplicateListElements[A](list: List[A]): List[A] ={
    def generator(result: List[A], list: List[A]): List[A] = list match {
      case Nil => result
      case x :: tail => {
        generator((result ::: List.fill(2)(x)), tail)
      }
    }
    generator(List[A](), list)
  }

  val intList = List(1,2,4,6,7,5)
  val strList = List("abc", "dsf", "asfsaf", "ff", "fsdf")
  println(duplicateListElements(intList))
  println(duplicateListElements(strList))
}
