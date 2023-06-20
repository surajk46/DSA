package ass_1;

import java.util.Scanner;

public class MyArray3_2Darray {
	//static int arr1[]=new int[5];
	static int arr1[];
	static int arr2[][]=new int[5][3];
	static Scanner scanner=new Scanner(System.in);
	
	
	public static void accept() {
		System.out.println("Enter "+arr1.length+" elements ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=scanner.nextInt();
		}
	}
	
	private static int square(int n) {
		return n*n;
	}



	private static int fact(int n) {
		int f=1;
		for(int i=1;i<=n;i++)
			f=f*i;
		return f;
	}
	
	public static void display(int arr1[])
	{
		System.out.println("*******************************************************************");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+"\t");
		System.out.println();
	}
	
	
	public static void display2d()
	{
		System.out.println("*******************************************************************");
		for(int i=0;i<arr2.length;i++)
			{
				for(int j=0;j<arr2[0].length;j++)
					System.out.print(arr2[i][j]+"\t");
				System.out.println();
			}
		
	}
	
	
public static void main(String[] args) {
	//accept();
	
	int arr1[]= {1,2,3,4,5};
	display(arr1);
	int k=0;
	for(int i=0;i<5;i++)
	{
//		for(int j=0;j<3)
		System.out.println("hello");
		arr2[i][0]=arr1[i];
		arr2[i][1]=fact(arr1[i]);
		arr2[i][2]=square(arr1[i]);
		
	}
	display2d();
//	for(int i=0;i<arr2.length;i++)
//	{
//		System.out.println("ll");
//	}
		/*for(int j=0;j<arr2[0].length;j++)
		{
			arr2[0][j]=arr1[j];
		}
		for(int j=0;j<arr2[0].length;j++)
		{
			arr2[0][j]=arr1[j];
		}
		for(int j=0;j<arr2[0].length;j++)
		{
			arr2[0][j]=arr1[j];
		}*/
	
}




}
