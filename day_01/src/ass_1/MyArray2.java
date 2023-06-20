package ass_1;

import java.util.Scanner;

public class MyArray2 {

	public static int maxElm(int arr[]) 
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	public static int maxEven(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
	public static int minEven(int arr[]) 
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			if(min>arr[i])
				min=arr[i];
		}
		return min;
	}
	
	public static void rotateLeft(int arr [] ,int n)
	{
		int res[]=new int[arr.length];
		int k=0;
		for(int i=n;i<arr.length;i++)
			res[k++]=arr[i];
		for(int i=0;i<n;i++)
			res[k++]=arr[i];
		display(res);
	}
	private static void rotateRight(int[] arr, int n1) {
		
		int res[]=new int[arr.length];
		int k=0;
		for(int i=arr.length-n1;i<arr.length;i++)
			res[k++]=arr[i];
		for(int i=n1;i<arr.length-n1;i++)
			res[k++]=arr[i];
		display(res);
	}
	
	public static int sum(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		return sum;
	}
	
	private static void repetedDigits(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean shivam=true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					{
						shivam=false;
						break;
					}
			}
			if(!shivam)
				System.out.println(arr[i]);
		}
		
	}
	
	
	public static void display(int arr[])
	{
		System.out.println("*******************************************************************");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int arr []= {25,56,25,28,85,12,36,55,4,4,63,85,96};
		Scanner scanner=new Scanner(System.in);
		display(arr);
		System.out.println("maximum element in given array is : "+maxElm(arr));
		
		System.out.println("maximum even element in given array is : "+maxEven(arr));
		
		System.out.println("minumum even element in given array is : "+minEven(arr));
		
		System.out.print("Enter left rotate index : ");
		int n=scanner.nextInt();
		rotateLeft(arr, n);
		
		System.out.print("Enter right rotate index : ");
		int n1=scanner.nextInt();
		rotateRight(arr, n1);
		
		System.out.println("Sum of Array element = "+sum(arr));
		
		repetedDigits(arr);

	}
	

}
