class Donut(name: String, productCode: Long){

  def print = println(s"Donut name = $name, productCode = $productCode")

}

object Donut{
  def apply(name: String, productCode: Long): Donut = new Donut(name, productCode)

}

object printDonuts {
  val donut1 = Donut("donut1", 1232243)
  val donut2 = Donut("donut2", 1232242)

  val donuts = List(donut1,donut2)

  def print = {
    donuts.map(donut => donut.print)
  }


}

printDonuts.print



