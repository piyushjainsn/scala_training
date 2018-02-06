
// All scala code import Scala.Predef method for many implicit conversions

// Implicits Conversion
val strValue = "10"

// val strValue:Int = "10"

// imports work for objects only not for classes

// implicit works internally so no need to worry

implicit def inputToInt(input: String): Int = {
  Integer.parseInt(input)
}

// Implicit Parameters

def add(a: Int)(implicit b: Int) = a + b

implicit val param = "30"

add(10)(param)    // Implicit conversion happening for the param
// scala compiler tries to find any implicit method before throwing
// TypeMismatch Error

// usually implicits are discouraged as its difficult to figure whats going on

// Int => Int (Lamda) can also be used as implicit
