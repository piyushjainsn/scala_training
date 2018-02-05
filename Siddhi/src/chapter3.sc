/*################## Tuple   ############################*/

// Instantiating Tuple
val pair = (1,"ABC")

//accessing Tuple elements
 pair._1  // 1
 pair._2  // ABC

/*##################### mutable Set ###########################*/
import jdk.nashorn.internal.ir.annotations.Immutable

import scala.collection.mutable.Set
val flowerSet = Set("Rose","Lilly","Lotus")
flowerSet += "sunFlower"
flowerSet  //   Set(Lotus, Rose, sunFlower, Lilly)
flowerSet.contains("Lilly") // true

/*##################### immutable Set ###########################*/
// by Default set is immutable

val birds = Set("sparrow","crow","Duck","parrot")
// birds += "swan"  // Error Reassignment to val
val newBirds =birds + "Eagle" //Set(Eagle, parrot, sparrow, crow, Duck)

/*##################### mutable HashSet ###########################*/
import scala.collection.mutable.HashSet
val hashSet = HashSet("E1","E2","E3")
hashSet+="E4" // Set(E2, E3, E4, E1)

/*##################### immutable HashSet ###########################*/
val imHashSet = scala.collection.immutable.HashSet("IE1","IE2","IE3")
//imHashSet+="IE4"  // Reassignment to val Error

/*##################### Mutable Map  ################################################ */
// how to initialise and access map Elements

import scala.collection.mutable.Map
val mutableMap = Map[Int,String]() // initialising Empty mutable map with Int keys -> String values
mutableMap+=(1->"wake up")
mutableMap+=(2->"brush")
mutableMap+=(3->"bath")       // Map(2 -> brush, 1 -> wake up, 3 -> bath)
mutableMap+=(4->"breakfast") // Map(2 -> brush, 4 -> breakfast, 1 -> wake up, 3 -> bath)
mutableMap(4) // brush

/*##################### ImMutable Map  ########################## */
val immutableMap = scala.collection.immutable.Map(1->"One",2->"two",3->"three")
//immutableMap+=(4->"four")//Reassignment to val error
immutableMap(2)

/*####################################################################################*/

/*Imperative style programming (use of more var )*/

 def printArgs(args:Array[String]): Unit ={
   var i=0
   while(i<args.length){
     println(" "+args(i))
     i+=1
   }
 }

val language =Array("SCALA","JAVA","C","CPP")
printf("Imperative style programming :--->")
printArgs(language)  // SCALA  JAVA C CPP

/*######################  Functional programming (use of val ) for loop ####################*/

def printArguments(args:Array[String]): Unit ={
  for(arg <- args)  // no var  // use of for loop
     print(arg+" ")
}
printf("for loop :--->")
printArguments(language)

/*######################  Functional programming (use of val ) foreach loop ###############*/

def printArgu(args:Array[String]): Unit ={
  args.foreach(println)
}
printf("foreach loop :--->")
printArgu(language)

/*########  Functional programming with no side effects (i.e. no unit result type )#########*/
def formatArgs(args:Array[String]): String ={
 args.mkString("\n") // here return type is String
}

/*###################### Use of assert() to check result type of method  ##################*/

//println(formatArgs(language)) // SCALA JAVA C CPP
val result=formatArgs(language)
//assert("SCALA\nJAVA\nCCPP"==result)  // java.lang.AssertionError: assertion failed
assert("SCALA\nJAVA\nC\nCPP"==result)  // res18: Unit = ()

/*###################### Use of assert() to check result type of method  #################*/