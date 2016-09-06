import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListPrimeNumbers {

    public static void main(String[] args) throws NumberFormatException, IOException {

        int count=0;
        int limit;

        System.out.println("Enter the Limit:");

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        limit = Integer.parseInt(in.readLine());

        System.out.println("Prime numbers From 1 to " + limit);

        //loop from 1 to limit
        for(int i=1; i < limit; i++) {

            boolean isPrime = true;

            //check to see if the number is prime
            for(int j=2; j < i ; j++) {

                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // print the number
            if(isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal Prime Number in given range: "+count);
    }

}