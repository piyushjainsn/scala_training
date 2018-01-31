import scala.annotation.tailrec

def sum(n: Int): Int = {
  if(n == 1) n
  else n+sum(n-1)
}
sum(10)

@tailrec          // Annotation
def sumWithTailRecursion(n: Int, sum: Int): Int = {
  if(n == 1) n
  else sumWithTailRecursion(n-1, n+sum)
}
sumWithTailRecursion(12, 0)


"aayush" capitalize

"aayush" drop 3

def returnString(): String = "return this string"

def Something(): String = "Is it what you want!!!!"


// Call by value
def callByValue(x: Int) = println( "Call Bhy Value Demo : " + x)

callByValue(12)

// Call by name
def callByName(x: => String) = println("Call By Name Demo : " + x)

callByName(Something)