package sub_array;

public class Sub_array {
	public static void main(String[] args) {
		//int arr[]= {25,663,10,12,7,9,5,6,3,2,1,4,6,7,-2,1,-7};
		int arr[]={4,3,6,5,2,6};
		int sum=13;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int sum1=sum;
			int k=i;
			while(sum1>0 && k<arr.length)
			{
				sum1=sum1-arr[k++];
			}
			if(sum1==0)
			{
				for(int j=i;j<k;j++)
				{
					System.out.print(arr[j]+"  ");
				}
				count++;
				System.out.println();
			}
		}	
		System.out.println(count);
			
	}
}
