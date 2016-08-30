public class Naturalno 
{
    public static void main(String[] arg)
    {
        Integer a, i = 1,sum = 0;
        System.out.println("Enter no.of items :");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        while(i <= a)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+a+" numbers is :"+sum);
    } 
}