package insertion;
import java.util.Scanner;
public class BinarySearch {
	public static int binarySearch(int arr[],int data)
	{
		int left,mid,right;
		left=0;
		right=arr.length-1;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(arr[mid]==data)
				return mid;
			else if(arr[mid]>data)
				right=mid-1;
			else {
				left=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,6,7,9,11,22,29,37,39,45,49,55,66,67,69,99};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter element to search : ");
		int data=sc.nextInt();
		int index=binarySearch(arr,data);
		System.out.println("Elment found at index : "+index);
	}
}
