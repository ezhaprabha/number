public class Swap_even_odd
{
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String in=s.next();
StringBuilder out = new StringBuilder();
 
char[] characters = in.toCharArray();
 
for (int i = 0; i < characters.Length; i++)
{
  if (i % 2 == 0)
  {
    if((i+1) < characters.Length )
    {
      out.append(characters[i + 1]);
    }
               out.append(characters[i]);
  }
}
}