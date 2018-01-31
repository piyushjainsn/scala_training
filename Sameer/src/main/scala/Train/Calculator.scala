package Train

object Calculator {
  def main(args: Array[String]): Unit = {
//    print("Enter 1st number: ")
//    val input1 = readInt()
//    print("Enter 2nd number: ")
//    val input2 = readInt()
//    Calculate(input1, input2, Sub)

    Calculate(5, 3, Add)
    Calculate(50, 3, Sub)
    Calculate(5, 3, Mul)
    Calculate(2, 3, Div)

    Calculate(6, 3, Test)
  }

  val Test = (a:Int,b:Int) => {a*b*a*b}

  val Add: (Int,Int)=>(Int) = (var1:Int,var2:Int) => var1+var2
  val Sub: (Int,Int)=>(Int) = (var1:Int,var2:Int) => var1-var2
  val Mul: (Int,Int)=>(Int) = (var1:Int,var2:Int) => var1*var2
  val Div: (Int,Int)=>(Int) = (var1:Int,var2:Int) => var1/var2

  def Calculate(var1:Int,var2:Int,operation:(Int,Int)=>(Int)): Unit ={
    println(operation(var1,var2))
  }
}
