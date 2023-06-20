package ass_1;

public class MergeArray {
	public static int[] merge(int a[],int b[]) {
		/*
		 int []res = new int[a.length+b.length];
		for(int i=0;i<b.length;i++)
		{
			int k=a.length;
			a[k++]=b[i];
		}
		return a;
		*/
		int []res = new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
			res[k++]=a[i];
		for(int i=0;i<b.length;i++)
			res[k++]=b[i];
		return res;
		
	}
	public static void display(int arr[])
	{
		System.out.println("*******************************************************************");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {11,22,33,44,55};
		int res[]=merge(a,b);
		display(res);
	}
}
