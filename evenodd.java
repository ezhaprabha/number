import java.util.Scanner;

class EvenOdd
{
  public static void main(String args[])
  {
    Integer p;
    System.out.println("Enter an Integer number:");
    Scanner s = new Scanner(System.in);
    p = s.nextInt();
    if ( p % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}