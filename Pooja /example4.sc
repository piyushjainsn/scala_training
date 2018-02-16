import scala.collection.mutable.Map

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {

  private val cache = Map[String, Int]()

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)

    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}

object Summer {
  def main(args: Array[String]) {
    for (arg <- args)
      println(arg +": "+ ChecksumAccumulator.calculate(arg))
  }

  def notMain(args:Array[String]): Unit ={
    for (arg <- args)
      println(arg +": "+ ChecksumAccumulator.calculate(arg))

  }
}

Summer.main(Array("1","2","1"))
Summer.notMain(Array("1","2","1"))