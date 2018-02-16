def plus = (x:Int,y:Int) => x + y
def minus = (x:Int,y:Int) => x - y
def mult = (x:Int,y:Int) => x * y
def div = (x:Int,y:Int) => x / y



def calculator(x:String) ={
  var result = 0
  val v = x.toList
  val listInt = v.map(v => v.toInt-48)
  val operation =  v(1)
  if(operation.toString == "+"){

    result = plus(listInt(0),listInt(2))
  }else if(operation.toString == "-"){
    result = minus(listInt(0),listInt(2))
  }else if(operation.toString == "*"){
    result = mult(listInt(0),listInt(2))
  }else if(operation.toString == "/"){
    result = div(listInt(0),listInt(2))
  }
  result
}

val result = calculator("1+2")
val result2 = calculator("2-1")
val result3 = calculator("2*3")
val result4 = calculator("4/2")

