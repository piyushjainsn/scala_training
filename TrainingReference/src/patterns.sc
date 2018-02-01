def stringToInt(x:String): Option[Int] = {
  try {
    Some(Integer.parseInt(x))
  }catch {
    case ex: Exception => None
  }
}


val a = stringToInt("1")
a.map(value => value > 1)


case class Person(name: String, age:Int)

val p = Person("Piyush", 30)
val p1 = "any"

val output = getValue(2) match {
  case Person(name, age) => "matched " + name +" " + age
  case dontKnow => dontKnow + " value"
}

def getValue(i : Int): Any = {
  if(i==1) Person("Piyush", 30)
  else 1
}

val output1 = getValue(2)


def matchPerson(person:Person) = {
  person match {
    case Person(name, age) if(age > 60) => "senior"
    case Person(name, age) if(age <= 60 && age > 18) => "adult"
  }
}

val person = matchPerson(Person("abc", 12))
