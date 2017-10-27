package calculateGCD

/*
 *
 *  This program takes two positive integers as input from the user and calculates GCD using recursion.
 *
 */
object GcdCalculation {
  def main(args: Array[String]): Unit = {

    println("Enter two values to calculate GCD")
    println("Enter First Value: ")
    
    //Read input from standard input by using StdiIn.readInt()
    val firstInput = scala.io.StdIn.readInt()
    println("Enter second Value: ")
    
    //Read input from standard input by using StdiIn.readInt()
    val secondInput = scala.io.StdIn.readInt()

    println("Greatest common divisor is :" + gcd(firstInput, secondInput))

    /*
     * this recursive function is used to find the gcd of two numbers
     * The gcd is determined when we get a remainder of 0 by dividing two numbers 
     *      * 
     */
    
    def gcd(firstInput: Int, secondInput: Int): Int = {
    
      //first check if divisor is non-zero, in the recursion we will send  secondInput as dividend
      if (secondInput != 0)
        //call gcd by secondInput  as dividend and remainder as divisor
        gcd(secondInput, firstInput % secondInput)
      else
        //when remainder becomes 0 this is returned
        firstInput
    }

  }
}