/*################## Chapter 6 ---> Functional Object     ###############################*/

/* 1)java has parameterised or default constructor
   2)but scala has class parameters which can be used inside class body
   3)Every class in scala inherits toString() from Java.lang.Object class
   4)on Object creation  toString() prints className @ HexaDecimal number
*/

class Rational(n:Int,d:Int){
   println(s"created Rational Object :$n/$d")
}

new Rational(5,8)            // instance of Rational class

// Output
// created Rational Object :5/8
// res0: Rational = Rational@74d9a1f3


/*### override default toString method (Java.lang.Object.toString() method )###*/

class Rational1(n: Int, d: Int){
  println(s"created Rational Object :$n/$d")
  override  def toString= n+"/"+d
}

new Rational1(5,10)

/* output
created Rational Object :5/10
res1: Rational1 = 5/10
*/

val x = new Rational1(3,5)

/* Output
created Rational Object :3/5
x: Rational1 = 3/5
*/

/*################# Checking preconditions while creating object #############*/


class Rational2 (n: Int, d: Int){
  require(d!=0)
  println(s"created Rational Object :$n/$d")
  override  def toString= n+"/"+d
}

//new Rational2(5,0)    // java.lang.IllegalArgumentException: requirement failed
new Rational2(5,10)     // res2: Rational2 = 5/10

/* ##########  adding Fields  and  use of self references in class  ########## */

class RationalOperation(n:Int,d:Int){
  require(d!=0)

  private val g = gcd(n.abs,d.abs)

  val numera  = n/g
  val denomi = d/g

  override def toString= numera+"/"+denomi

  // Auxiliary Constructor
  def this(num:Int)=this(num:Int,1)

  private def gcd(a:Int,b:Int):Int={
    if(b == 0 )
      a
    else
      gcd(b,a%b)
  }

  def add(that:RationalOperation)={
     new RationalOperation(numera*that.denomi+denomi*that.numera,denomi*that.denomi)
  }


  def -(that:RationalOperation)={
    new RationalOperation(numera*that.denomi-denomi*that.numera,denomi*that.denomi)
  }
  /*###################### method overloading #############################*/

  def -(that:Int)= new RationalOperation(this.numera-denomi*that,this.denomi)

  def lessThan(that:RationalOperation): Boolean ={
    this.numera*that.denomi>that.numera*this.denomi     // self references (i.e this )
  }

  def max(that:RationalOperation)={
    if(this.lessThan(that)) that else this
  }
}

/* ###################################################################### */

val R1 = new RationalOperation(2,3)
R1.numera    // res3: Int = 2
R1.denomi    // res4: Int = 3

val R2 = new RationalOperation(3,4)
val addition = R1.add(R2)
addition                       //  res3: RationalOperation = 17/12

println(s"is R1 : $R1 less than R2 : $R2 ? "+R1.lessThan(R2))
// output :---> is R1 : 2/3 less than R2 : 3/4 ? false

println(s"return max among R1 :$R1 and R2 :$R2 : "+R1.max(R2))
// output :---> return max among R1 :2/3 and R2 :3/4 : 2/3

val auxiliaryConst =new RationalOperation(5)
println("rational object returned by auxiliary constructor :"+auxiliaryConst)
//output :---->  rational object returned by auxiliary constructor :5/1

val R3 = new RationalOperation(6,4)
println(s"R3 : $R3")
//Output :---->  R3 : 3/2

println(s"R1 : $R1 - R2 : $R2 =${R1-R2} ")
//output :---> R1 : 2/3 - R2 : 3/4 =-1/12

println(s"R1 : $R1 - 3 =${R1-3} ")        // calling to overloaded method
//output :---> R1 : 2/3 - 3 =-7/3

implicit def intToRational(x:Int)=new RationalOperation(x)
val result : RationalOperation = 5-R1
// result: RationalOperation = 13/3
/* ############################################################### */


