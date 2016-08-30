class SumOfno
{
	public static void main(String[] arg)
	{
		Integer sum = 0;
		Scanner s=new Scanner(System.in);
                Integer N=s.nextInt();
		for(int i = 1;i <= N;i++)
		{
			sum = sum + i;
		}
		System.out.println("The Sum Of "+N+" Numbers are:" + sum);
	}
}