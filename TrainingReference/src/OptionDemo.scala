
object OptionDemo {
  val capitals = Map("France"-> "Paris", "Japan" -> "Tokyo")

  //get is Options Method
  println("Capital of Japan is: "+show(capitals.get("Japan")))
  println("Capital of India is: "+show(capitals.get("India")))

  def show(x : Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }
}
