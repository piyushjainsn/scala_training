package scala99

object Solution_P03 {
  def KthElement[T](k: Int, list: List[T]) : T = {
    (k,list) match{
      case (0 , occuredElement::_) => occuredElement
      case (k, _::tail) => KthElement(k-1,tail)
      case (_ , Nil) => throw new NoSuchElementException
    }
  }
  def main(args: Array[String]): Unit = {
    val list = List(3,4,5,6,2,4,5)
    println(KthElement(3,list))
  }
}
