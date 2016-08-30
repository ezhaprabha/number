import java.util.Scanner;

class Greatestno
{
public static void main(String[] o) 
{
Integer a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("Enter any three numbers: ");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

if(a>=b && a>=c) 
{
System.out.println("Largest number: "+a);
}
else if (b>=a && b>=c) 
{
System.out.println("Largest number: "+b);
}
else if (c>=a && c>=b) 
{
System.out.println("Largest number: "+c);
}
}
}