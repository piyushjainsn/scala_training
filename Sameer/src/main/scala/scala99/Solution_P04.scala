package scala99

object Solution_P04 {
  def length[T](list: List[T]): Int ={
    var count = 0
    for(_ <- list){
      count+=1
    }
    count
  }
  def main(args: Array[String]): Unit = {
    val list = List("as",23,2.3)
    println(length(list))
  }
}
