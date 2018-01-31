import jdk.nashorn.internal.runtime.linker.LinkerCallSite

// Arrays are Mutable
// Immutability prevents bugs and makes code more maintainable
val list = List(1, 2, 3)  // Immutable Collection

val mutableList = scala.collection.mutable.LinearSeq(1,2,3)
mutableList.foreach(println)

val list2 = list :+ 4

list.foreach(println)   // Syntactical Sugar -> Shorthands used to
                        // provide readability to code
def isEven(x: Int): Boolean = x % 2 == 0
list2.foreach(println)

def toString(num: Int): String = num match {
  case 1 => "A"
  case 2 => "B"
  case 3 => "C"
  case 4 => "D"
}
// First Order methods -> Methods which do no take parameters
// Higher Order methods -> Methods which take Functions as parameters

// Reverse the list and provide another list
list.reverse.foreach(println)

// Provides the sorted list
list.sorted.foreach(println)

// To take 2 elements from the List
list.take(2).foreach(println)
list.takeRight(2).foreach(println)   // To access elements from last
list.drop(2).foreach(println)      // To drop elements from list
list.dropRight(2).foreach(println)   // To drop from last
list.takeWhile(i => i < 2).foreach(println)   // To drop from last
list.dropWhile(i => i > 1).foreach(println)   // To drop from last

list.head
list.tail

list.last   // Return last element of List
list.init.foreach(println)    // Return list except last element

list.filter(isEven)
list.filterNot(isEven)

val bigList = List(list, list2)     // Return List of List's
bigList.flatten       // Return a single list by combining both List's

list.map(toString).flatten.foreach(println)

list.flatMap(toString).foreach(println)

list.zipWithIndex        // To zip elements with their index

List("Aayush", "Alex", "John").groupBy(_.length)