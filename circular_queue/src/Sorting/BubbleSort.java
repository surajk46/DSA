package Sorting;


public class BubbleSort {
	static int a[]={5,-6,7,8,2,13,-65,22,33};
	
	public static void display() 
	{
		
		System.out.println("----------Your array is--------------");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"  ");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		display();
		int size=a.length;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		display();
	}

}
