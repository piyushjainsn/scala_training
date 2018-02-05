


//****************** defining  class checksumAcculumator

class checksumAccumulator{
  private var sum: Int =0         // private member
  var member1=10;                 // public member

  def add(b:Byte): Unit = sum+=b   // method
  def checkSum(): Int = ~(sum&0xFF)+1
}

/*##################companion object ############################################*/

import scala.collection.mutable.Map
object checksumAccumulator{
  private val cache = Map[String, Int]()
  def calculate(s:String):Int= {
    if (cache.contains(s)){
      println("inside if")
      cache(s)
    }
    else {
      val acc = new checksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checkSum()
      cache += (s -> cs)
      cs
    }
  }
}


