package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c>r) throw new IllegalArgumentException("Column number can't be greater than row number")
    def pascalUp(c: Int, r: Int): Int = if (c<0 || r<0) 0 else  pascalUp(c-1,r-1)+pascalUp(c,r-1)
    pascalUp(c,r)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceOfTail(balance : Int, chars: List[Char]) : Int ={
      val balance = if (chars.head == '(' balance+1 else if chars.head==')' balance-1 else 0
      // TODO: handling negative balance, return with constant -1?
      if (chars.isEmpty) balance else balanceOfTail(balance, chars.tail)
    }
    
    balanceOfTail(0, chars) == 0
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    for i 0 to money, recurse 0-i and i-money
  }
}
