/*#########  Excercise-2  ########*/
// 1. declare a companion object for the Donut class
// 2. create instances of the Donut class using the companion object
// 3. call the print function for each of the donut object


// companion class
class Donut(name:String,productCode:Long) {
  def print(): Unit = println(s"productNmae : $name , productCode : $productCode")
}

// companion object
object Donut{

  val donuts=Array[Donut]()

  def main(args: Array[String]) = {

    donuts(0)=new Donut("plain",1)      // creating instances of companion class Donut
    donuts(0).print                     // calling the print function for each of the donut object  
    donuts(1)=new Donut("coconut",2)
    donuts(1).print
                       
  }
}



