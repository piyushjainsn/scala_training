package Train

object Day2_Assignment {
  def main(args: Array[String]): Unit = {
      val stdObj = new Student(1,"Sameer")
    println(stdObj.toString)
    println(Student.companionObject.toString)

  }
  class Student(studentId:Int, studentName:String){

    private val id = studentId
    private val name = studentName

    override def toString: String = {
      "Student Id is: " + this.id + "\n" + "Student Name is: " + this.name
    }
  }

  object Student{
    val companionObject = new Student(100,"Sudhir")
  }
}
