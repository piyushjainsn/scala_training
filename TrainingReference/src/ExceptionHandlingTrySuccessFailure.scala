
class ExceptionHandlingTrySuccessFailure {
  //Exception Handling using 1. Try, Success, Failure
  import scala.util.{Try, Success, Failure}
  def toInt(s:String):Try[Int] = Try {
    Integer.parseInt(s.trim)
  }
  //Success Case
  val a = toInt("1")
  //Failure Case
  val b = toInt("boo")



  //Recover from failure using 2. Try - match & for expression
  toInt("stringA") match {
    case Success(i) => println("Success: "+i)
    case Failure(s) => println(s"Failed. Reason $s")
  }
  val y = for {
    a <- toInt("2")
    b <- toInt("3")
    c <- toInt("5")
  } yield a + c

}
