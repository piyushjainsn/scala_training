import java.io.File
// For Loop
for(i <- 1 to 10){ println(i)}

// Returning value from for loop (Vector)
for(i <- 1 to 10) yield i

// Until
for(i <- 1 until 10) yield i

// Multiple Conditions
val numbers = for{
  i <- 1 to 10; if i%2 == 0
} yield i

// Multiple Loops
val something = for{
  i <- 1 to 10  if i%2 == 0
  j <- 11 to 15 if j%2 == 0
} yield ( i, j)
something.foreach(println)

// For, map and filter works same so when to use what depends on readability
// Compiler converts for to map internally ( so try using map and filters )


// Java Packages ( . represents current folder )
val files = new File(".").listFiles()
files.map(f => f.getName)

for{
  file <- files
  name = file.getName if(name.startsWith("a"))
} yield name