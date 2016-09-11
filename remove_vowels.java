
class ReverseString
{
   public static void main(String args[])
   {
      String original, reverse = "",strNew;
      Scanner s = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      original = s.nextLine();
 
      int length = original.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + original.charAt(i);
 
      System.out.println("Reverse of entered string is: "+reverse);

       System.out.print("Removing Vowels from The String [" +reverse+ "]\n");
       
       strNew = reverse.replaceAll("[aeiouAEIOU]", "");
	   
       System.out.print("Now the String is :\n");
              
       System.out.print(strNew);
   }
}