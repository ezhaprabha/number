
import java.util.Scanner;
 
class Leapyr
{
    public static void main(String[] arg)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the year:");
        Integer year= s.nextInt();
        boolean leapyear= (year%4==0);
 
        System.out.println("leapyear="+leapyear);
    }
}