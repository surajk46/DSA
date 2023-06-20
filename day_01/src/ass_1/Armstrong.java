package ass_1;
public class Armstrong {
	private static int count_digit(int n) {
		int c=0;
		while(n>0)
		{
			c++;
			n/=10;
		}
		return c;
	}
	private static long power(int n,int l) {
		long res=1;
		for(int i=1;i<=l;i++)
		{
			res=res*n;
		}
		return res;
	}
	private static void arm() 
	{
		for(int n=1;n<=10000;n++)
		{
			int n2=n;
			long arm=0;
			int l=count_digit(n);
		/*	while(n2>0)
			{
				int rem=n2%10;
				arm= arm+power(rem, l);
				n2/=10;
			}
		*/
			for(;n2>0;n2=n2/10)
			{
				int rem=n2%10;
				arm= arm+power(rem, l);
			}
			if(n==arm)
				System.out.println(n + " is armstrong number ");
		}
	}
	public static void main(String[] args) {
		arm();
	}
}
