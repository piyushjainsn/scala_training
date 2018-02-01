package scala99

object Solution_P05 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    val list2 = List(3,4,5,6,7,8)
    println(list:::list2)
  }
}
