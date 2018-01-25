object Sample {
  def main(args: Array[String]) {

    val res = calc("2*3")
    println(res)
  }

  def calc(strInput: String) = {

    def multiply(x: Int, y: Int): Int = {
      x * y
    }

    def divide(x: Int, y: Int): Int = {
      x / y
    }
    
    val arrInput = strInput.split("")
    val c = arrInput(0).toInt
    val d = arrInput(2).toInt


    arrInput(1) match {
      case "+" => (a: Int, b: Int) => a + b
      case "-" => (a: Int, b: Int) => a - b
      case "*" => multiply(c, d)
      case "/" => divide(c, d)

    }

  }

}
