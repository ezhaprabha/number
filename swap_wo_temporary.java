import java.util.Scanner;


public class swap {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the 2 integer value");
Integer a=s.nextInt();
Integer b=s.nextInt();
System.out.println("before swap:"+a+" "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swap:"+a+" "+b);
	}

}
