package Scala99


// Rotate a list N places to the left
object Problem19 extends App {

  def rotate[A](n: Int, l: List[A]):List[A] = {
    val wrap = if (l.isEmpty) 0 else n % l.length
    if (wrap < 0) rotate(l.length + n, l)
    else l.drop(wrap):::l.take(wrap)
  }

  val list = List(1,2,4,5,6,22,7,8,9,32,53,41)

  println(rotate(3, list))
}
