class Donut(name: String, productCode: Long) {

  def print = println(s"Donut name = $name, productCode = $productCode")

}

object CompanionDonut {
  def main(args: Array[String]): Unit = {

    val donut1 = new Donut("Dark Choclate",34523)
    donut1.print

    val donut2 = new Donut("Choco Glade",86767)
    donut2.print

    val donut3 = new Donut("Caramel",45645)
    donut3.print
  }
}