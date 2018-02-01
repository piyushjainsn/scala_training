
// case classes Demo
object CaseClassDemo {
  val alice = new Person("Alice", 20)
  val bob = new Person("Bob", 21)
  val charlie = new Person("Charlie", 22)

  for(person <- List(alice, bob, charlie)){
    person match {
      case Person("Alice", 20) => println("Hi alice")
      case Person(name, age) => println("Age: "+age+" year "+"name: "+name)
    }
  }

  case class Person(name: String, age: Int)
}


