
class ExceptionHandlingUsingOption {
  //Exception handling using Option/Some/None
  def toIntOpt(s:String):Option[Int] = {
    try {
      Some( Integer.parseInt(s.trim))
    }
    catch {
      case e: Exception => None
    }
  }
  val optA = toIntOpt("show")
  val optB = toIntOpt("2")

  toIntOpt("system") match {
    case Some(i) => println("Success: "+i)
    case None => println("This didn't work")
  }
  val yOpt = for {
    a <- toIntOpt("2")
    b <- toIntOpt("3")
    c <- toIntOpt("10")
  } yield a + b + c

  val a = toIntOpt("2")
  a.map(x=>x.toString)
}
