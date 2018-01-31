class Donut(name: String, productCode: Long){
  def print = println(s"Donut name = $name, productCode = $productCode")
}

object Donut{
  def main(args: Array[String]): Unit = {
    val d1=new Donut("Jelly",123)
    val d2=new Donut("Chocolate",234)
    d1.print
    d2.print
  }
}