 public static void main(String args[])
   {
      Integer a, b;
      System.out.println("Enter an integer for multiplication table");
      Scanner s = new Scanner(System.in);
      a = s.nextInt();
      System.out.println("Multiplication table of "+a+" is");
      for ( b = 1 ; b <= 10 ; b++ )
{
      System.out.println(b+"*"+a+" = "+(a*b));
}
   }