package insertion;

public class Insertion {
public static void main(String[] args) {
	int arr[]= {25,663,10,12,7,9,5,6,3,2,1,4,6,7,-2,1,-7};
	
	for(int i=1;i<arr.length;i++)
	{
		int key =arr[i];
		int j=i-1;
		while(j>=0 &&  arr[j]>key)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(" "+arr[i]);
	}
}
}
