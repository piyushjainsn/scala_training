
import scala.util.{Failure, Success, Try}

def intToString(s: String): Option[Int] = {
  try {
    Some( Integer.parseInt(s.trim))
  }
  catch {
    case e: Exception => None
  }
}

val option1 = intToString("Show")
val option2 = intToString("23")

println(option1)
println(option2)

intToString("343") match {
  case Some(num) => println("Success : " + num)
  case None => println("Unsuccessful!!!")
}

val opt = for{
  a <- intToString("34")
  b <- intToString("12")
  c <- intToString("98")
} yield a + b + c


//---------------------------------------------------------------------------
// In Option we don't know the reason of Failure but in Try we can access
// reason of Failure( through Exception value )

// Try
def jIntToString(s: String): Try[Int] = Try {
  Integer.parseInt(s.trim)
}

// Success
val a = jIntToString("23")
println(a)
// Failure( Exception )
val b = jIntToString("Something")
println(b)

jIntToString("34") match {
  case Success(i) => println("Success : " + i)
  case Failure(s) => println("Reason Of Failure : " + s)
 }