// Basic Types and Operations

// Integral Types

// 1. hexa decimalDecimal no.(always starts with 0x)(base 16)

val hex1: Int = 0x9        // hex1: Int = 9
val hex2: Int = 0xA        // hex2: Int = 10
val hex3: Int = 0X111      // hex3: Int = 273

//2.decimal number (base 10)
val dec1 = 1515            // dec1: Int = 1515
val dec2 = 166             // dec2: Int = 166

//3.number ends with L or l (i.e. long)
val long1: Long = 166L     // long1: Long = 166
val long2: Long = 166l     // long2: Long = 166
val long3: Int = 166       // long2: Int = 166   (otherwise type Int)

//4. Int assigning to Short or Byte is allowed if no. is within range

val little1 = 1345         //  little1: Int = 1345
val little2:Short = 1345   //  little2: Short = 1345
val little3:Byte = 127     // little3: Byte = 127

//5. Floating point Litrels
val big = 1.234            // big: Double = 1.234
val bigger = 1.234e1       // bigger: Double = 12.34
val biggerStill = 12344E1  // biggerStill: Double = 123440.0
var anotherDouble = 3e5    //  anotherDouble: Double = 300000.0
val yetAnother = 3e5D      // yetAnother: Double = 300000.0

//6.character literals
val a: Char = 'A'                // a: Char = A
val octalA: Char = '\101'        // octalA: Char = A
val octalB: Char = '\102'        // octalB: Char = B
val hexaA: Char = '\u0041'       // hexaA: Char = A
val BackSlash ='\\'              // BackSlash: Char = \

//7.String literals
val hello: String = "hello"            // hello: String = hello
val escapes: String = "\\\'\""         // escapes: String = \'"

println("""Welcome to scala
 |          type Help !""")            // Welcome to scala
                                       //        type hello !

println(
  """ Welcome to scala
    | type Help
  """.stripMargin)                    // Welcome to scala
                                      // type Help

// 8. symbol literals
val aSymbol: Symbol = 'aSymbol        // aSymbol: Symbol = 'aSymbol

// boolean literals
val bool: Boolean =true
val fool: Boolean =false

/* ********************************************************* */
// operators as methods

val sum = 1+2                   // sum: Int = 3
val sum1 =(1).+(2)              // sum1: Int = 3
                                // + as method
val sumMore = 1+4L              //sumMore: Long = 5
val sumMore1 = (1).+(4L)        //sumMore1: Long = 5

// any method can be used as operator

val string= "hello world !"
string indexOf 'o'              // res2: Int = 4
string indexOf ('w', 2)         // res3: Int = 6

// unary operator as method

-2.0                            // res4: Double = -2.0
(2.0).unary_-                   // res5: Double = -2.0

/* ********************************************************* */
// object equality

List(1,2,3)==List(1,2,3)       // res6: Boolean = true
2==1                           // res7: Boolean = false
List(1,2,3)==List(4,5,6)       // res8: Boolean = false
("he"+"llo")=="hello"          // res9: Boolean = true
null == List(1,2,3)            // res10: Boolean = false

/* ********************************************************* */
// Some Rich Operations

2 max 5                         // res11: Int = 5
2 min 5                         // res12: Int = 2
-2.7 abs                        // res13: Double = 2.7

"robert" capitalize             // res14: String = Robert

-2.5 round                      // res15: Long = -3

1.5 isInfinite                  // res16: Boolean = false

4 to 6                          // res17: scala.collection.immutable.Range.Inclusive = Range 4 to 6

"Siddhi" drop 2                 // res18: String = ddhi 