package forcomp

import Anagrams._

object SandBox {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
 /*  List(),
   *      List(('a', 1)),
   *      List(('a', 2)),
   *      List(('b', 1)),
   *      List(('a', 1), ('b', 1)),
   *      List(('a', 2), ('b', 1)),
   *      List(('b', 2)),
   *      List(('a', 1), ('b', 2)),
   *      List(('a', 2), ('b', 2))
  */
  
  /*def combinations(occurrences: Occurrences): Unit = {
  	for{
  		letter <- occurrences
  		num <- 0 to letter._2
  	} yield (letter, num)
  }*/
  
	val occ = wordOccurrences("abba")         //> occ  : forcomp.Anagrams.Occurrences = List((a,2), (b,2))
                 
  //combinations(occ)
  
  for{
  		letter <-  wordOccurrences("abba")
  		num <- 1 to letter._2
  	} yield (letter._1,num)                   //> res0: List[(Char, Int)] = List((a,1), (a,2), (b,1), (b,2))
  
                                    
                                
}