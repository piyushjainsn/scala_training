/*#########  Excercise-1   ########*/
// 1. Create an object with the same name Student with displayDetails method where we want to print the details of the student?


class Student1(sid:Int,sname:String) {
  val Id =sid
  val name=sname

  override def toString(): String ={
    this.Id+" "+","+this.name
  }
}

object Student1{
  def main(args: Array[String])= {
    def displayDetails()= {
       val stud=new Student1(1, "Siddhi")
        println(stud.toString())
    }
     displayDetails()
  }
}

// output :

/*  productNmae : plain , productCode : 1
    productNmae : coconut , productCode : 2
*/