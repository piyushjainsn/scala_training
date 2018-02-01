
// Person* -> wrapped array i.e if present good if not no worry
case class Person(name: String, nation: String, friends: Person*)

val alex = Person("Alex", "Canada")
val john = Person("John", "Belgium", alex)
val sam = Person("Samuel", "USA", john, alex)

val social = List(alex, john, sam)
val NRI = social.filter(_.nation != "Indian").map(_.name).foreach(println)

for{
  person <- social.withFilter(_.nation!="Indian")
} yield person.name

// Map, filter, foreach, fold etc are all Higher Order Functions

social.filter(_.nation != " ").map(_.name).mkString(", ")

//------------------------------------------------------------------------------

// foldLeft -> Higher Order Complicated Function ( Starts from left )
// -> takes an initial parameter i.e total 2 parameters

social.foldLeft(0)((accumulator: Int, person: Person) =>{
  println(s"Accumulator =  $accumulator and Person's name = ${person.name}")
  accumulator + 1
})

val list = List(1, 2, 3, 4, 5, 6)
list.foldLeft(0)((sum: Int, element: Int) => {
  println(sum+ " "+element)
  sum + element
})

list./:(0)(_ + _)     // Syntactical Sugar ( foldLeft )