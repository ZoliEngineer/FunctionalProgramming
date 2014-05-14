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
    def pascalUp(c: Int, r: Int): Int = if (c==0 && r==0 ) 1 else if (c<0 || r<0) 0 else  pascalUp(c-1,r-1)+pascalUp(c,r-1)    
    pascalUp(c,r)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceOfTail(balance : Int, chars: List[Char]) : Int ={
      def newBalance = if (chars.head == '(') balance+1 else if (chars.head==')') balance-1 else balance
      if (balance < 0 || chars.isEmpty) balance else balanceOfTail(newBalance, chars.tail)
    }    
    balanceOfTail(0, chars) == 0
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =  {  
    def denomination = coins.head
    if (coins.isEmpty || money < 0) 0 else if(money == 0) 1 else countChange(money, coins.tail) + countChange(money-denomination, coins)
  }
}
