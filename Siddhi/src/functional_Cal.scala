object functional_Cal {


  def main(args: Array[String]): Unit = {


    def calc(op:String): (Int, Int) => Int = {

      if(op=="addition") {
        val addition =  ( x :Int, y :Int  )  =>  x + y
        addition
      }
      else if (op=="substract"){
        val substract =  ( x :Int, y :Int  )  =>  x - y
        substract }
      else if (op=="multiply"){
        val multiply =  ( x :Int, y :Int  )  =>  x * y
        multiply }
      else {
        val devide =  ( x :Int, y :Int  )  =>  x / y
        devide
      }
    }

    val operation= calc("addition")
    val result= operation(10,20)
    println("addition:"+result)

    val operation1= calc("multiply")
    val result1= operation1(10,20)
    println("multiplication:"+result1)

  }

}
