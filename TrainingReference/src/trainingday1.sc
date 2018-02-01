

val name = "Piyush"


lazy val a = 1
val b = 2

a + b

def sampleMethod(a: Int) = {
  a + 1
}

val method: (Int) => Int = sampleMethod

val increment: (Int) => String = { x => x + "2" }

val methodwithNoInput : () => Unit = {
  () => print("you got nothing")
}

val additionOp : (Int, Int) => Int = { (a,b) => a+b }
val multiplyOp : (Int, Int) => Int = { (a,b) => a*b }

def addition(a:Int, b:Int) = { a + b}
def multiply(a:Int, b:Int) = { a * b}
def substract(a:Int, b:Int) = { a - b }

val output = additionOp(1,2)

def operation(a:Int, b:Int, op: (Int,Int) => Int) = {
  op(a,b) + op(b,a)
}

val newoutput = operation(1,2, addition)
val newoutput1 = operation(1,2, additionOp)
val newoutput3 = operation(1,2, (a,b) => a+b )

def whatOperation(op:String): (Int, Int) => Int = {
  if(op == "+")
    additionOp
  else if (op == "*")
    (a:Int, b:Int) => a * b
  else
    (a:Int, b:Int) => a - b
}

val whattoDo: (Int, Int) => Int = whatOperation("+")
whattoDo(1,2)

