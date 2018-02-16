class Student(sid:Int, sname:String){
  val Id = sid
  val name = sname

  override def toString() =
    this.Id+" "+" , "+this.name
}

object Student{

  def displayDetails(student: Student) = {
    student.toString
  }
}
Student.displayDetails(new Student(1,"Pooja"))

