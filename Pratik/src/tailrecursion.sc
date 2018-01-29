import scala.annotation.tailrec
//Date:25/01/2018  Session:2
//Recursion
def sum(n:Int):Int={
  if(n==1)
    1
  else
    n+sum(n-1)
}

sum(10)

//tail recursion
@tailrec
def recSum(n:Int,sum:Int):Int={
  if(n==1)
    sum+1
  else
    recSum(n-1,sum+n)
}

recSum(10,0)

//Find largest number in array
//recursion
val numbers=Array(1,6,8,2,5,10,3,33,2);

def max(arr: Array[Int]): Int = {
    if (arr.isEmpty) 0
    else {
        if( arr.head >= max(arr.tail) )
            arr.head
        else
            max(arr.tail)
    }
}

println(max(numbers))

//Find Largest Number in Array

@tailrec
def recMax(arr:Array[Int],maxNum:Int):Int={
    if(arr.head >= max(arr.tail))
      arr.head
    else
        recMax(arr.tail,maxNum)
}

println(recMax(numbers,numbers.head))