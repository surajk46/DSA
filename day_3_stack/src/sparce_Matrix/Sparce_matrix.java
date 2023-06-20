package sparce_Matrix;

public class Sparce_matrix 
{
	public static void main(String[] args) {
		int i,j;
		int count=0;
		int[][] arr = {
				{0,0,0,0,1,0},
				{2,0,4,0,0,0},
				{0,0,0,0,0,0},
				{2,4,0,0,0,0},
				{0,0,0,0,0,0},
				{0,9,0,0,0,0}};

		for(i = 0 ; i<arr.length; i++)
		{
			for (j = 0; j < arr[0].length; j++) 
			{
				System.out.print(arr[i][j] + "  ");
				if(arr[i][j]!=0)
					count++;
			}
			System.out.println();
		}
		int [][]arr1=new int[count+1][3];
		arr1[0][0]=arr[0].length;
		arr1[0][1]=arr.length;
		arr1[0][2]=count;
		System.out.println();
		int c=0;
		for(i = 0 ; i<arr.length; i++)
		{
			for (j = 0; j < arr[0].length; j++) 
			{
				if(arr[i][j]!=0)
					{
						c++;
						arr1[c][0]=i;
						arr1[c][1]=j;
						arr1[c][2]=arr[i][j];
					}
			}
		}
		for(i = 0 ; i<arr1.length; i++)
		{
			for (j = 0; j < arr1[0].length; j++) 
			{
				System.out.print(arr1[i][j] +"  ");
			}
			System.out.println();
		}
		
	}		
}
