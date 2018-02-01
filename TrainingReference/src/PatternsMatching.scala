/**
  * Created by jain06 on 2/1/18.
  */
object PatternsMatching {

  case class Person(name: String, age:Int)

  def matchPerson(person:Person) = {
    person match {
      case Person(name, age) if(age > 60) => "senior"
      case Person(name, age) if(age <= 60 && age > 18) => "adult"
    }
  }

  val numbers = 1::List(2, 3)

  numbers match {
    case x::Nil => "list with 1 member"
    case x::y::Nil => "list with 2 member"
    case x::y::z => "list with 2 members and list z"
  }

  //using recursion and pattern matching print each element of a list

}
