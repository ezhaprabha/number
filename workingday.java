class Workingday
{
public static void main(String[] args)
{

Scanner s=new Scanner(System.in);
System.out.println("Enter the day");
String day=in.next();
String p=day.toLowerCase();
if(p.equals("monday")||p.equals("tuesday")||p.equals("wednesday")||p.equals("thursday")||p.equals("friday")||p.equals("saturday"))
{
System.out.println("True");
}
else if(p.equals("sunday"))
{
System.out.println("False");
}
else
{
System.out.println("Invalid");
}
}
}