package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  printSet(singletonSet(5))
  printSet(map(singletonSet(5), i => i+1))
}
