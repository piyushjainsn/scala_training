//Exercise 4. Make this object Summer executable but without using main method

/*##################  Standalone object( different object name than class) #########################################*/

import checksumAccumulator.calculate

object summer extends App {
    for(arg<- args)
      println(arg +" : "+ calculate(arg))

}

//  output
//  Siddhi : -85
//  Roshan : -107
//  Ripal : -248



