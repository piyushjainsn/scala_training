// Pattern matching is accomplished with the case classes

// Order Matters in the pattern matching as it breaks after matching
def intToString(num:  Int): String = num match {
// Everything on the left of => is pattern and to right is expression
  case 1 => "One"
  case 2 => "Two"
  case 3 => "Three"
  case _ => "Default Value"     // If all the cases are not covered it will through MatchError
}
intToString(3)



// Case Classes -> Syntactical Sugar
// -> provide 3 methods :-
//    1) toString -> print
//    2) hash -> hashCode
//    3) equals -> comparision

case class Person(name: String, age: Int)

val jack = Person("Jack", 14)
val john = Person("John", 23)
val alex = Person("Alex", 34)

for(list <- List(jack, john, alex)){
  list match {
    case Person("Alex", 34) => println("Hi Buddy $name")
    case Person(name, age) => println(s"Hi ${name}, you are $age year's now!!!")
  }
}

// map can be used with Option also
// -> Some will perform your logic inside map on parameter
// -> None will return None only

// Pattern Guard -> in this we can use conditional statements in the pattern matching

