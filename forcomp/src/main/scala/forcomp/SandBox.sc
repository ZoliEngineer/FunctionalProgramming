package forcomp

import Anagrams._

object SandBox {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
 val x = wordOccurrences("xabbc")                 //> x  : forcomp.Anagrams.Occurrences = List((a,1), (b,2), (c,1), (x,1))
 val y = wordOccurrences("sab")                   //> y  : forcomp.Anagrams.Occurrences = List((a,1), (b,1), (s,1))
        

 def subtract(xs: Occurrences, ys: Occurrences): Occurrences = (xs, ys) match{
 	case(Nil, ys) => ys
 	case(xs, Nil) => xs
 	case(x::xt, y::yt) =>
 		if (x._1 == y._1) (x._1, x._2 - y._2) :: subtract(xt, yt)
 		else x :: subtract(xt, ys)
 }                                                //> subtract: (xs: forcomp.Anagrams.Occurrences, ys: forcomp.Anagrams.Occurrence
                                                  //| s)forcomp.Anagrams.Occurrences
        
  
 
 	subtract(x,y)                             //> res0: forcomp.Anagrams.Occurrences = List((a,0), (b,1), (c,1), (x,1), (s,1))
                                                  //| 


 
}