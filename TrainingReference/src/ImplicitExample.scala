//import scala.Predef - automatically imported in all scala classes

object ImplicitExample extends ImplicitUtils{

  def main(args: Array[String]) {
    val stringValue:Int = getValue  //exp, method call, cal
    implicit val shouldAdd = true
    val output = addNumbers("10")
    println("output is " + output)
    val numbers = List(1,2,3)
    numbers.sorted
  }

  def getValue:String = {
    "10"
  }

  def addNumbers(a:Int)(implicit b:Int = 0) = {
    a+b
  }






}