package Train

class Student(studentID:Int, studentName:String){
  private val ID = studentID
  private val Name = studentName

  override def toString: String = {
    "Student ID is: " + this.ID +"\n" + "Student Name is: " + this.Name
  }
}

object Student{

  def DisplayDetails(stdObj : Student){
    println(stdObj.toString)
  }
  def RuntimeObj(Id:Int, Name:String): Unit ={
    println(new Student(Id,Name).toString)
  }

  def main(args: Array[String]) = {

    val objSam = new Student(101,"Sameer")
    val objSudhir = new Student(102,"Sudhir")

    println(objSam.toString)
    Student.DisplayDetails(objSudhir)
    Student.RuntimeObj(103,"Neha")

  }
}

