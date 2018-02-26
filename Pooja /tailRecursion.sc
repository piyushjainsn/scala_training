//with array of numbers, create a recursive function to find the largest number
//write the method again which is tail recursive
//dont use for while loop, use head and tail method as mentioned below

var a = Array(1,2,3,5,2)
var x = Array(2)
x.tail

def recursion(largestNum:Int,array: Array[Int]):Int = {
  if(array.length != 0){
    if(array.head > largestNum){
      recursion(array.head,array.tail)
    }
    else
      recursion(largestNum,array.tail)
  }
  else largestNum

}

recursion(0,a)