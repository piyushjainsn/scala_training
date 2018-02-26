import scala.annotation.tailrec

object LargestNumber extends App {

  val numbersArray= Array(20,6,23,100,29,76)
      @tailrec
      def maxRecursion(maxNum: Int,arr: Array[Int]): Int = {

          if (arr.length != 0)
          {
              if (arr.head > maxNum) {
                  maxRecursion(arr.head,arr.tail)
              }
              else {
                  maxRecursion(maxNum,arr.tail)
              }
          }
          else {
            maxNum
          }
      }
  val max = LargestNumber.maxRecursion(0,numbersArray)
  println("Max number is - " +max)
}


