package ass_1;
public class Prime {
	public static void display() 
	{
		for(int i=1;i<=100;i++)
		{
			boolean shivam=true;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					shivam=false;
					break;
				}
			}
			if(shivam==true)
				System.out.println(i+ " is a prime Number");
		}
	}
	public static void main(String[] args) 
	{
		display();
	}
}
