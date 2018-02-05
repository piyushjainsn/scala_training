//****************** defining  class checksumAcculumator

class checksumAccumulator{
  private var sum: Int =0         // private member
  var member1=10;                 // public member

  def add(b:Byte): Unit = sum+=b   // method
  def checkSum(): Int = ~(sum&0xFF)+1
}

val obj1=new checksumAccumulator   // instantiation of class
val obj2=new checksumAccumulator

obj1.member1    // res0: Int = 0
obj2.member1   // res1: Int = 0

obj1.member1=20 // obj1.member1: Int = 20

//obj1.sum=5  // won't compile as sum is private member
// obj2.sum=10 // same above
// obj1=new checksumAccumulator // (won't compile) Reassignment to val error as obj1 is val

//****************** what happens if miss OUT  = sign before body of method

def checkMethod1()="checking method" // checkMethod: checkMethod[]() => String
def checkMethod2(){"checking method"} // checkMethod2: checkMethod2[]() => Unit // treated as procedure
def checkMethod3():Unit="checking method"  //checkMethod3: checkMethod3[]() => Unit

checkMethod3() // res2: Unit = ()
checkMethod2()  // res3: Unit = ()
checkMethod1() // res4: String = checking method

//***************** Semicolon inference

val firstNmae: String = "Siddhi" // here no need of explicit ;
println(firstNmae)

val lastName="Sajjanshetty" ; println(lastName)  // multiple statements on single line require ;
val x=2
val y=3
val z=4
x     // res7: Int = 2
+y    // res8: Int = 3

(x
+y
  +z)  //  res9: Int = 9  ---->  () required

x+
y+   // res10: Int = 9
z

/*##################companion object ############################################*/

import scala.collection.mutable.Map
object checksumAccumulator{
  private val cache = Map[String, Int]()
  def calculate(s:String):Int= {
    if (cache.contains(s)){
      println("inside if")
      cache(s)
    }
    else {
      val acc = new checksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checkSum()
      cache += (s -> cs)
      cs
    }
  }
}

/*#################### invoke calculate method of companion object #############*/
checksumAccumulator.calculate("Every value") // res11: Int = -72
checksumAccumulator.calculate("Every value") // inside if res12: Int = -72

/*##################  Standalone object( different object name than class) #########################################*/
import checksumAccumulator.calculate

object summer{

  def main(args: Array[String]) = {
    for(arg<- args)
      println(arg +" : "+ calculate(arg))
  }
}

/*#################################*/