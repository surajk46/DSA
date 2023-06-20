package ass_1;


import java.util.Scanner;

public class Ass_1 {

	public static void accept(int arr[])
	{
		System.out.println("Enter "+arr.length+ " elements of array ");
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
	}
	
	public static void display(int arr[])
	{
		System.out.println("*******************************************************************");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
	}
	
	public static int[] unionAll(int arr1[],int arr2[],int l)
	{
		int res[]=new int[l];
		int k=0;
		for(int i=0;i<arr1.length;i++)
			res[k++]=arr1[i];
		for(int i=0;i<arr2.length;i++)
			res[k++]=arr2[i];
		return res;
	}
	
	public static int[] union(int arr1[],int arr2[],int l)
	{
		int res[]=new int[l];
		int k=0;
		for(int i=0;i<arr1.length;i++)
			res[k++]=arr1[i];
		
		for(int j=0;j<arr2.length;j++)
		{
			boolean flag=true;
			for(int i=0;i<arr1.length;i++)
			{
				if(arr2[j]==arr1[i])
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				res[k++]=arr2[j];
		}
		return res;
	}
	
	public static int cnt_dupli(int arr1[],int arr2[])
	{
		//int count=arr1.length;
		int count=0;
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr2[i]==arr1[j])
				{
					count++;
					break;
				}
			}
		}
		return count;
	}
	
	
	public static int[] intersection(int arr1[],int arr2[],int l)
	{
		int res[]=new int[l];
		int k=0;
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr2[i]==arr1[j])
				{
					res[k++]=arr2[i];					
					break;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) 
	{
	
	/*System.out.println("Enter size of two arrays ");
	Scanner scanner=new Scanner(System.in);
	int size1=scanner.nextInt();
	int size2=scanner.nextInt();
	int arr1[] = new int [size1] ;
	int arr2[] = new int [size2] ;
	accept(arr1);
	accept(arr2);
	display(arr1);
	display(arr2);
	*/
		int  arr1[]= {5,6,22,77};
		int  arr2[]= {10,5,96,28,33,4,6};
		display(arr1);
		display(arr2);
		int cnt_dupli=cnt_dupli(arr1, arr2);
		int res1[]=unionAll(arr1, arr2, arr1.length+arr2.length);
		display(res1);
		
		int res2[]=union(arr1, arr2, arr1.length+arr2.length-cnt_dupli);
		display(res2);
		
		int res3[]=intersection(arr1, arr2, cnt_dupli);
		display(res3);

	}

}