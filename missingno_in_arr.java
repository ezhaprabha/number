public class missingno_inarray {

	
	public static void main(String[] args) {
int[] arr={10,5,2,8,6,7,1,3,9};
int len=arr.length;
int index=10,value=0;
for(int i=0;i<len;i++)
{
	index+=i+1;
	value+=arr[i];
	
}
int output=index-value;
	System.out.println("missing no is:"+output);
	}

}
