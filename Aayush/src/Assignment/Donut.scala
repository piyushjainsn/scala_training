package Assignment

class Donut(name: String, productCode: Long){

  def print = println(s"Donut name = $name, productCode = $productCode")
}

//object Donut{
//
//  def apply(name: String, productCode: Long): Donut = new Donut(name, productCode)
//}
//
//val first = Donut("Chocolate", 2345)
//first.print
//
//val second = Donut("Plain", 987)
//second.print

// Code to run the Program
object Donut extends App {

  def apply(name: String, productCode: Long): Donut = new Donut(name, productCode)

  val first = Donut("Chocolate", 2345)
  first.print
  val second = Donut("Plain", 987)
  second.print
  val third = Donut("Mixed", 321)
  third.print
}


