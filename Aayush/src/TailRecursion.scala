import scala.annotation.tailrec

object TailRecursion extends App  {

  val listOfElements = Array[Int](23, 54, 56 , 21, 32)

  @tailrec
  private def tailRecursion(arr: Array[Int], maxValue: Int): Int = {
    if(arr.isEmpty) maxValue
    else {
      val newMaxValue = if(arr.head > maxValue) arr.head else maxValue
      tailRecursion(arr.tail, newMaxValue)
    }
  }

  println("The Highest Value in the Array is : "+tailRecursion(listOfElements, 0))
}