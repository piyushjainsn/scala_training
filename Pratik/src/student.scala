class Student(val Id:Int,val sname:String){
     override def toString: String = {
       "My Id is "+ Id +" My name is "+ sname
      }
}

object Student{
  def displayDetails(s:String)={
     new Student(1,s)
  }
  def displayDetails(id:Int,s:String)={
    new Student(id,s)
  }
}

object test extends App {
  println(Student.displayDetails("A"))
  println(Student.displayDetails("B"))
  println(Student.displayDetails(3,"C"))
  println(Student.displayDetails(4,"D"))

}