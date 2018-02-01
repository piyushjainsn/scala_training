package Train
import scala.io.StdIn

object Sample {
  def main(args: Array[String]) = {
      println("Welcome to scala")
      print("Enter User Name: ")
      var uName = StdIn.readLine()
    println(uName)
    val functionAsVariable: (Int) => Int = FunctionAsVariable
    val increment: (Int) => String = { x => x + "1" }
    val methodWithNoInput : () => Unit = {
      () => print("You Got Nothing")
    }

    def addition(a:Int, b:Int) = {a+b}
    def subtract(a:Int, b:Int) = {a-b}
    def multiply(a:Int, b:Int) = {a*b}
    def div(a:Int, b:Int) = {a/b}

    val additionOp : (Int,Int) => Int = addition
    val subtractOp : (Int,Int) => Int = subtract
    println(additionOp(2,5))
    println(subtractOp(2,5))

    def operation(a:Int, b:Int, op: (Int,Int)=>Int ) ={
      op(a,b) * op(b,a)
    }

    val newoutput = operation(1,2,addition)
    val newoutput1 = operation(1,2,additionOp)
    println(newoutput)
  }
def SampleMethod(a: Int) = a + 1
  def SampleReturn(a: Int) = {
    a+3 /*It will return the last line value*/
  }
  def SampleR(a:Int):Int={  /*Return type is Int*/
    a+3
  }
  def UseAnyVal(a:Int): AnyVal = {
    if(a == 1)
      a+1           /*Returning Int*/
    else
      a == 2          /*Returning Boolean*/
  }

  def Void_Like(a:Int): Unit = {
    val b = a + 1       /*We are not returning anything from function but still scala functions returns something using the Unit type i.e. like Void*/
  }

  def FunctionAsVariable(a:Int)={
    a+1
  }

}
