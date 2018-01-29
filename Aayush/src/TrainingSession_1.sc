

val a = 3
val b = 2 + "1"
var c = 3

val name = "Aayush"

a.equals(3)
c.toString()
name.toLowerCase()
name.toUpperCase()

lazy val lazyVariable = "Alex"
println(lazyVariable)   // lazyVariable gets assigned at its usage

println(name + " " +lazyVariable)

val list1 = List(4, 3,5 ,7)
val list2 = List(9, 8)
val finalList = list1 ::: list2
val listPrepend = 3 :: list2
list1.drop(2)
list1.dropRight(2)