public class ArmstrongFinder {	
 public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
	        Integer starting_number =s.nextInt();

	        Integer ending_number =s.nextInt();
	        for (Integer i = starting_number; i <= ending_number; i++) {

	            if (isArmstrong(i)) {

	                System.out.println(i + " is an Armstrong number!");

	            } else {

	                 
	            }

	        }

	    }

	 