package ass_1;

import java.util.Scanner;


public class MyArray1 {
	
	public MyArray1()
	{
     	Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int arr[]=new int[size];
	}
	
	
	public static void accept(int arr[]) 
	{
     	Scanner scanner=new Scanner(System.in);
     	System.out.println("Enter "+arr.length+" elements of array ");
		for(int i=0;i<arr.length;i++)
			arr[i]=scanner.nextInt();
			
	}
	
	public static void display(int arr[])
	{
		System.out.println("*******************************************************************");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
	}
	
	public static boolean isAvailable(int arr[]) {
		boolean shivam=false;
		if(arr[0]!='\0')
			shivam=true;
		return shivam;
	}
	
	public static int search(int arr[]) {
		System.out.print("Enter element to serch in array : ");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		byte shivam=-1;
		for(byte i=0;i<arr.length;i++)
		{
			if(a==arr[i])
			{
				shivam=i;
				break;
			}
		}
		return shivam;
	}
	
	
	public static void reverce(int arr[]) {
		//int res[]=new int[arr.length];
		int k=arr.length-1;
		for(int i=0;i<arr.length/2;i++) 
		{
			int temp=arr[i];
			arr[i]=arr[k--];
			arr[k+1]=temp;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter size of array :");
		int size=scanner.nextInt();
		int arr[]=new int[size];
		accept(arr);
		display(arr);
		
		if(isAvailable(arr))
		{
			System.out.println("Array is available ");
		}
		
		int a=search(arr);
		if(a==-1)
			System.out.println("Element is not available is given array ");
		else {
			System.out.println("Element is available at index "+a);
		}
		
		
		reverce(arr);
		System.out.println("Reverce array is ");
		display(arr);
	}

}
