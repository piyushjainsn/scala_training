 import scala.annotation.tailrec

  val numbersArray= Array(2,6,23,92,29,4,76)
 
  maxRecursion(numbersArray.head,numbersArray.tail)
    @tailrec
    def maxRecursion(maxNum: Int,arr: Array[Int]): Int = {

      if (arr.length == 0) 0

      else {

        if (maxNum > arr.head) {
          maxNum
        }
        else {
          maxRecursion(arr.max, arr.tail)
        }
      }
    }

