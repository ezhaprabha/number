public class Pali {

    public static void main(String args[]){
       
        System.out.println("Please Enter a number : ");
        Scanner s=new Scanner(System.in);
        Integer palindrome=s.nextInt();
        if(isPalindrome(palindrome))
{
         System.out.println("Number : " + palindrome + " is a palindrome");
 }
       else
{
            System.out.println("Number : " + palindrome + " is not a palindrome");
 }      
       
    }
 

