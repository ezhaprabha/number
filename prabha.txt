    import java.util.Scanner;

    public class Postive_Negative 

    {

        public static void main(String[] args) 

        {

            int p;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter the number:");

            p = s.nextInt();

            if(p > 0)

            {

                System.out.println("The given number "+p+" is Positive");

            }

            else if(p < 0)

            {

                System.out.println("The given number "+p+" is Negative");

            }

            else

            {

                System.out.println("The given number "+p+" is neither Positive nor Negative ");

            }

        }

    }