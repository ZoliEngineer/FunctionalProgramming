package forcomp

import Anagrams._

object SandBox {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
 val x = wordOccurrences("abbc")                  //> x  : forcomp.Anagrams.Occurrences = List((a,1), (b,2), (c,1))
 val y = wordOccurrences("ab")                    //> y  : forcomp.Anagrams.Occurrences = List((a,1), (b,1))
        
        
 val trivial = x.filterNot(occurence => y.contains(occurence))
                                                  //> trivial  : List[(Char, Int)] = List((b,2), (c,1))
 
 trivial.filter(xoccurence => y.exists(yoccurence => xoccurence._1 == yoccurence._1 ))
                                                  //> res0: List[(Char, Int)] = List((b,2))
 
}