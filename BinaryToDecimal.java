//Exercise 4.32: Pg 213 (Java 11th edition)
//Decimal equivalent of a Binary number
import java.util.Scanner;

public class BinaryToDecimal
{
  public static void main(String args[])
  {
    //create a Scanner object to access its methods
    Scanner input = new Scanner(System.in);
    
    System.out.printf("%s%n%n%s%n%s%n%n", 
    "\t\t\t\t~Decimal equivalent of a binary number~",
    "A binary integer is an integer only contaning 0s and 1s.",
    "The following program will convert the user's binary integer to a decimal integer.");
    
    //variable declaration & initialization
    int binary = 0;
    int decimalEquivalent = 0;
    int numCopy = 0;
    int numOfDigits = 0;
    
    System.out.print("Enter your binary digit: ");
    binary = input.nextInt();
    numCopy = binary;
    
    while(numCopy != 0) //counting the amount of digits in the number
    {
      numCopy /= 10;
      ++numOfDigits;
    }//end while
    
    int posValue = 1;
    int divisor = 1;
    numCopy = binary;
    while(numOfDigits != 0)//determining the decimal equivalent
    {
      binary = (numCopy/divisor) % 10;
      decimalEquivalent += binary * posValue;
      
      posValue *= 2;
      divisor *= 10;
      
      --numOfDigits;
    }//end while
    
    //displaying the result
    System.out.printf("%nThe decimal equivalent of %d is: %d%n%n", numCopy, decimalEquivalent);
    
  }//end main
}//end class BinaryToDecimal