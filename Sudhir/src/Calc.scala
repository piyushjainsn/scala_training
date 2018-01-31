object Calc {
  def main(args: Array[String]): Unit = {
      println("Addition is" +" "+  add(8,3))
      println("substraction is" +" "+ sub(8,3))
      println("multiplication is" +" "+ mult(8,3))
      println("Division is" +" "+ div(8,3))

      println("Function Pass value" + " "+ cal(6,2,add))
  }

      val add=(x:Int,y:Int)=>x+y
      val sub=(x:Int,y:Int)=>x-y
      val mult=(x:Int,y:Int)=>x*y
      val div=(x:Int,y:Int)=>x/y

  def cal(a:Int,b:Int,per:(Int,Int)=>(Int))={
    per(a,b)
  }


}
