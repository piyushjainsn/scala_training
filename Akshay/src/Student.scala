class Student(sid:Int, sname:String) {

  val Id = sid
  val name = sname

  override def toString() =
    this.Id+""+","+this.name
}

object StudentOBJ{

  def displayDetails(student: Student) = {
    student.toString
  }

  def main(args: Array[String]): Unit = {

  println("Student Details :- "+ StudentOBJ.displayDetails(new Student(1,"Akshay")))

  }
}
