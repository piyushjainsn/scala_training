
val set1 = Set(1, 2, 3)
val set2 = Set(3, 4, 5)

set1.union(set2)
set1.intersect(set2)
set1.diff(set2)
set2.diff(set1)

val map = Map(1 -> "First", 2 -> "Second")

val arr = Array(1, 2, 3)
arr(2)

arr.length
arr.isEmpty

val a: Stream[Int] = 1 #:: 2 #:: Stream.empty[Int]

def febSeq(a: Int, b: Int): Stream[Int] = {
  a #:: febSeq(b, a+b)
}

febSeq(1, 1).take(12).toList.foreach(println)