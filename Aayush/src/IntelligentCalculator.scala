object IntelligentCalculator {


  private val addition: (Int, Int) => Int = (a, b) => a + b
  private val multiplication: (Int, Int) => Int = (a, b) => a * b
  private val division: (Int, Int) => Double = (a, b) => a / b
  private val subtraction: (Int, Int) => Int = (a, b) => a - b

  private def operationSelector(a: Int, b: Int, op: String): Unit = op match {
    case "+" => println(addition(a,b))
    case "-" => println(subtraction(a,b))
    case "*" =>  println(multiplication(a,b))
    case "/" => println(division(a,b))
    case _ => println("Enter correct operator(+, -, *, /)")
  }

  private def resultGenerator(input: String) = {
    val updatedInput = input.replaceAll("\\s","")
    val seperator = "([0-9]+)(\\W?)([0-9]+)".r
    val seperator(operand1, operator, operand2) = updatedInput
    operationSelector(operand1.toInt, operand2.toInt, operator)
  }

  private def getInput(): String ={
    println("Please enter your operation : ")
    val input = scala.io.StdIn.readLine()
    input
  }

  def main(args: Array[String]): Unit = {
    //    operationSelector(5,6,"+")
    //    operationSelector(5,6,"*")
    //    operationSelector(5,6,"/")
    //    operationSelector(5,6,"-")
    //    operationSelector(5,6,"%")
    val input = getInput()
    resultGenerator(input)
  }
}

