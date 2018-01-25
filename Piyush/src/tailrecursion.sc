import scala.annotation.tailrec

def sum(n:Int):Int = {
  if(n == 1)
    n
  else
    n+sum(n-1)
}

sum(10)

@tailrec
def sumwithNoRecursion(n:Int, total:Int) :Int = {
  if(n == 1)
    total + 1
  else
    sumwithNoRecursion(n-1, total + n)
}

sumwithNoRecursion(10, 0)

//assignment - with array of numbers, create a recursive function to find the largest number
//write the method again which is tail recursive
//dont use for while loop, use head and tail method as mentioned below

val numbers = Array(5,4,6,2,8)
val firstvalue = numbers.head
val remaining = numbers.tail