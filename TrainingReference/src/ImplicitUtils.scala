class ImplicitUtils {

  implicit val anynumber = 10

  implicit def stringtoInt(input:String):Int = {
    Integer.parseInt(input)
  }

}
