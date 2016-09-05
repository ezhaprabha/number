public static void main(String[] args)
{
    Scanner ss = new Scanner(System.in);
    System.out.print("Please enter Roman Symbol:");
    String s = ss.nextLine();

    RomInt temp = new RomInt();
    temp.getVal(s);
    temp.assign(s);
    temp.disp();
}