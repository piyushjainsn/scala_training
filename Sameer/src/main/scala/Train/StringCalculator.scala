package Train

object StringCalculator {
  def main(args: Array[String]): Unit = {
    println(Calculate("90+20"))
    println(Calculate("90-30"))
    println(Calculate("90*2"))
    println(Calculate("9/3"))

  }
  def Calculate(str:String) ={
    val splitStr = str.split("(?<=[-+*/])|(?=[-+*/])")


    //    for(i <- 0 to splitStr.length-1) {
//      println(splitStr {i})
//    }

    splitStr{1} match {
      case "+" => Add(splitStr{0}.toInt,splitStr{2}.toInt)
      case "-" => Sub(splitStr{0}.toInt,splitStr{2}.toInt)
      case "*" => Mul(splitStr{0}.toInt,splitStr{2}.toInt)
      case "/" => Div(splitStr{0}.toInt,splitStr{2}.toInt)
      case _ => println("Invalid arguments!")
    }
  }

  val Add = (var1:Int,var2:Int) => var1+var2
  val Sub = (var1:Int,var2:Int) => var1-var2
  val Mul = (var1:Int,var2:Int) => var1*var2
  val Div = (var1:Int,var2:Int) => var1/var2
}

