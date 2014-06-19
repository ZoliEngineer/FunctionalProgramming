package forcomp

import Anagrams._

object SandBox {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val sentence = List("Linux", "rulez")           //> sentence  : List[String] = List(Linux, rulez)
 val occ = sentenceOccurrences(sentence)          //> occ  : forcomp.Anagrams.Occurrences = List((e,1), (i,1), (l,2), (n,1), (r,1)
                                                  //| , (u,2), (x,1), (z,1))
 	val y = wordOccurrences("eat")            //> y  : forcomp.Anagrams.Occurrences = List((a,1), (e,1), (t,1))
        
	y drop 3                                  //> res0: List[(Char, Int)] = List()

	

   def sentenceAnagrams(occ: Occurrences): List[Sentence] = occ match {
    case Nil =>	List(Nil)
    case _ => {
    	for {
	      split <- 1 to occ.length
	      word <- getWords(occ take split)
	      rest <- sentenceAnagrams(occ drop split)
	    } yield {
	    		println (split + " " + word + " " + rest)
	   			word :: rest}
	    }.toList
  }                                               //> sentenceAnagrams: (occ: forcomp.Anagrams.Occurrences)List[forcomp.Anagrams.S
                                                  //| entence]
  
  def getWords(occ: Occurrences) :  List[Word] = {
  	dictionaryByOccurrences.get(occ) match {
  		case None => List()
  		case Some(wordList) => wordList
  	}
  }                                               //> getWords: (occ: forcomp.Anagrams.Occurrences)List[forcomp.Anagrams.Word]
  
  sentenceAnagrams(y)                             //> 3 ate List()
                                                  //| 3 eat List()
                                                  //| 3 tea List()
                                                  //| res1: List[forcomp.Anagrams.Sentence] = List(List(ate), List(eat), List(tea)
                                                  //| )
  
  
  
  
 
 
}