object listOperations{

  def main(args: Array[String]): Unit = {

    println(" 1) list operation 1 ====> initialize an immutable List ")
    val list1 = List("Siddhi","Sweety","Riddhi")
    println(s"list elements :$list1") // List(Siddhi, Sweety, Riddhi)
    println()

    println(" 2) list operation 2 ====> to access elements of immutable List at specific index")
    println(s"list element at index 0 :---> ${list1(0)}") //Siddhi
    println(s"list element at index 1 :---> ${list1(1)}") //  Sweety
    println(s"list element at index 2 :---> ${list1(2)}") //  Riddhi
    println()

    println(" 3) list operation 3 ====> traversing elements of immutable List using foreach ")
    list1.foreach(println)

    println(" 4) list operation 4 ====> How to append elements at the end of immutable List using :+ ")
    val list2:List[String]= list1 :+ "anju"
    println(s"list2 :--> $list2") // List(Siddhi, Sweety, Riddhi, anju)
    println()

    println("5) list operation 5 =====> How to prepend elements at the front of immutable List using +:")
    val list3 = "manju" +:list1
    println(s"list3 :-->$list3") // List(manju, Siddhi, Sweety, Riddhi)
    println()

    println("6) list operation 6 =====> to add two immutable lists together using ::")
    val L1 = List("a","b","c")
    val L2 = List(1,2,3)
    val combineList1: List[Any] = L1 :: L2
    println(s"combined List using :: -->$combineList1") // List(List(a, b, c), 1, 2, 3)
    println()

    println("7) list operation 7 =====> add two lists together using ::: ")
    val combineList2: List[Any] = L1 ::: L2
    println(s"add two immutable list using ::: ---> $combineList2") //  List(a, b, c, 1, 2, 3)
    println()

    println("8) list operation 8 =====> initialize an empty immutable List")
    val emptyList: List[String] = List.empty[String]
    println(s"emptyList :-->$emptyList") // List()
    println()

    println("9-1) list operation 9 ====>  find out size of list ")
    val L3 = List("scala","java","c","cpp")
    val sizeOfL3=L3.size;
    println(s"sizeOfL3 ==>$sizeOfL3") //4
    println(s"last Element of L3 using size  ===>${L3(L3.size-1)}") // cpp
    println()

    println("9-2) access the last element of list using last() ")
    println(s"last element of L3 using last() :===> ${L3.last}") // cpp
    println()

    println("10) isEmpty function :: returns true/false ---->")
    val emptyList1 = List()
    val listt11 = List(1,2,3,4,5)
    println(s"is emptyList is empty?? ::-->${emptyList1.isEmpty}")// true
    println(s"is list11 is empty?? ::-->${listt11.isEmpty} ") //false
    println()

    println("11-A) dropWhile function =====> ")
    val donutNames = List("pineapple", "sapple", "berpry", "coconut","apple" )
    println(s"donutNames Excluding names with p  ===> ${donutNames.dropWhile(_.contains("p"))}") // List(coconut, apple)
    println()


    println("11-B) declare a predicate function to be passed-through to the dropWhile function")
    def dropDonutNames:(String)=> Boolean = donutNames => donutNames.contains("p")
    println(s"donutNames Excluding names with p using the predicate function ===> ${donutNames.dropWhile(dropDonutNames)}") //List(coconut, apple)
    println()

    println("12) use of  filter method")
    val donuts= List("Plain Donut", "Strawberry Donut", "Glazed Donut", "Vanilla Donut")
    val donutListWithPlainAndVanillaDonut = donuts.filter{
      dName => dName.contains("Plain Donut")|| dName.contains("Vanilla Donut")
    }
    println(s"donutListWithPlainAndVanillaDonut :==> $donutListWithPlainAndVanillaDonut") // donutListWithPlainAndVanillaDonut :==> List(Plain Donut, Vanilla Donut)
    println()

    println("13)filter out element Vanilla Donut using the filterNot function ")
    val donutListWithoutVanilla =donuts.filterNot{
      dName => dName=="Vanilla Donut"
    }
    println(s"donutListWithoutVanilla :==> $donutListWithoutVanilla") //donutListWithoutVanilla :==> List(Plain Donut, Strawberry Donut, Glazed Donut)
    println()

    println("14)append the word Donut to each element using the map function")
    val donutList = List("Plain","Strawberry","Glazed","Vanilla")
    val donutList2 = donutList.map(_+" Donut") // wildcard operator _ inside the map method.
    println(s"elements of donutList2 ==> $donutList2") // List(Plain Donut, Strawberry Donut, Glazed Donut, Vanilla Donut)

    println("15): create a donut List with one None element")
    val donuts3 = List("Plain", "Strawberry", None)
    donuts3.foreach(println(_)) // Plain  Strawberry  None
    println()

    println("16) filter out the None element using map function")
    val donuts4 = donuts3.map {
      case donut: String => donut + " Donut"
      case None => "Unknown Donut"
    }
    println(s"Elements of donuts4 = $donuts4") // List(Plain Donut, Strawberry Donut, Unknown Donut)
    println()

    println("17)find the difference between two Lists using the diff function")
    val List11 =List(1,2,3)
    val List22 =List(5,2,7)
    val diff_L1_L2 = List11 diff List22
    println(s"Elements of diffDonutBasket1From2 = $diff_L1_L2") // List(1, 3)
    println()

    println("18)return a single list of Elements using the flatten function")
    val multipleList = List(List11,List22)
    println(s"multiple List without flatten :-> $multipleList") // List(List(1, 2, 3), List(5, 2, 7))
    val listFromFlatten = multipleList.flatten
    println(s"Elements of listFromFlatten = $listFromFlatten") // List(1, 2, 3, 5, 2, 7)
    println()

    println("19)append the *** to each element of multipleList using flatten and map functions")
    val multipleListtt = multipleList.flatten.map(_ + "*")
    println(s"Elements of multipleListtt  = $multipleListtt") // List(1*, 2*, 3*, 5*, 2*, 7*)
    println()

    println("20) return a single list  using the flatMap function")
    val multipleListFromFlatMap = multipleList.flatMap(List => List)
    println(s"Elements of multipleListFromFlatMap  as a flatMap as a single list = $multipleListFromFlatMap") // List(1, 2, 3, 5, 2, 7)
    println()

    println("21) take elements from the List using the take function")
    println(s"multipleListFromFlatMap :----> $multipleListFromFlatMap")
    println(s"1st element of multipleListFromFlatMap :--> ${multipleListFromFlatMap.take(1)}") // List(1)
    println(s"7th element of multipleListFromFlatMap :--> ${multipleListFromFlatMap.take(7)}") // List(1, 2, 3, 5, 2, 7)
    println()

    println("22)drop the first two elements using the drop function")
    println(s"multipleListFromFlatMap :----> $multipleListFromFlatMap")
    
    println(s"Drop the first and second elements in the List = ${multipleListFromFlatMap.drop(2)}") // List(3, 5, 2, 7)
    println(s"Drop last 2 elements in the List = ${multipleListFromFlatMap.dropRight(2)}") // List(1, 2, 3, 5)


  }

}