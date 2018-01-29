class Student(sid:Int,sname:String){

  val Id = sid;
  val name =sname;

  override def toString(): String = {
    this.Id+" "+" , "+this.name
  }
}


object Student {
  def main(args: Array[String]): Unit = {

    println("***** Companion Object Assignment ****** ")

    val displayDetails = new Student(12, "Siddhi")
    println( displayDetails.toString() )
  }

}

