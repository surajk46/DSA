package Sorting;

public class SelectionSort {
	static int[] a={5,-6,7,8,2,13,-65,22,33};
	public static void display() 
	{
		
		System.out.println("----------Your array is--------------");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"  ");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		display();
		int size=a.length;
		int min,index;
		for(int i=0;i<size-1;i++)
		{
			min=a[i];
			index=i;
			for(int j=i;j<size-1;j++)
			{
				if(min>a[j])
				{
					min=a[j];
					index=j;
				}
			}
			a[index]=a[i];
			a[i]=min;
			
		}
		display();

	}

}
