object firstProgram {
  def main(args: Array[String]): Unit = {
    println("*********Simple Method*********")
    println("Addition: "+addition(1,2))
    println("Substraction: "+substraction(1,2))
    println("Multiplication: "+multiplication(1,2))
    println("Division: "+division(4,2))

    println("*********Pass function to another Function*********")
    println("Addition: "+calc(1,2,addition));
    println("Substraction: "+calc(1,2,substraction));
    println("Multiplication: "+calc(1,2,multiplication));
    println("Division: "+calc(4,2,division));


    println("*********Input as String*********")
    println("Addition: "+Calculator("5+2"))
    println("Substraction: "+Calculator("15-2"))
    println("Multiplication: "+Calculator("15*2"))
    println("Division: "+Calculator("15/2"))

  }

  val addition = (var1:Int,var2:Int) => var1+var2
  val substraction = (var1:Int,var2:Int) => var1-var2
  val multiplication = (var1:Int,var2:Int) => var1*var2
  val division = (var1:Int,var2:Int) => var1/var2

  //def sum(a:Int,b:Int)= a+b
  //val b:(Int,Int)=>Int=sum
  //val b:(Int,Int)=>Int=(a:Int,b:Int)=> a+b

  def calc(var1:Int,var2:Int,op:(Int,Int) => (Int))={
    op(var1,var2)
  }

  def Calculator(str: String):Int ={
    val r="[-|+|/*]"
    //val rg="(?<=[-+*/])|(?=[-+*/])"
    val strSplit = str.split(r)

    if(str.contains('+')) addition(strSplit{0}.toInt,strSplit{1}.toInt)
    else if(str.contains('-')) substraction(strSplit{0}.toInt,strSplit{1}.toInt)
    else if(str.contains('*')) multiplication(strSplit{0}.toInt,strSplit{1}.toInt)
    else division(strSplit{0}.toInt,strSplit{1}.toInt)

    /*if(str.contains('+')) calc(strSplit{0}.toInt,strSplit{1}.toInt,addition)
    else if(str.contains('-')) calc(strSplit{0}.toInt,strSplit{1}.toInt,substraction)
    else if(str.contains('*')) calc(strSplit{0}.toInt,strSplit{1}.toInt,multiplication)
    else  calc(strSplit{0}.toInt,strSplit{1}.toInt,division)*/
  }
}
