object Calc {
  def main(args: Array[String]): Unit = {
      println("Addition is" +" "+  add(8,3))
      println("substraction is" +" "+ sub(8,3))
      println("multiplication is" +" "+ mult(8,3))
      println("Division is" +" "+ div(8,3))
      println("Function Pass value" + " "+ cal(5,2,add))
      println("Result of String operation" + " " + evalString("8/ 8"))
  }


  val add=(x:Int,y:Int)=>x+y
  val sub=(x:Int,y:Int)=>x-y
  val mult=(x:Int,y:Int)=>x*y
  val div=(x:Int,y:Int)=>x/y

//passing function to another function

  def cal(a:Int,b:Int,per:(Int,Int)=>(Int))={
    per(a,b)
  }

//math operation stored in string

  def  evalString(str: String)= {
    val pureString = str.replaceAll("\\s+","")
    val input=pureString.split("")
    val firstNos= input(0).toInt
    val secNos = input(2).toInt

    input(1) match {

      case "+" => add(firstNos,secNos)
      case "-" => sub(firstNos,secNos)
      case "*" => mult(firstNos,secNos)
      case "/" => div(firstNos,secNos)
    }



  }

}
