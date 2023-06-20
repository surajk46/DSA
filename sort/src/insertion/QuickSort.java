package insertion;

import java.util.Scanner;

public class QuickSort {
	public static void q_sort(int numbers[], int left, int right)
	{
		int pivot, l_hold, r_hold;

		l_hold = left;
		r_hold = right;
		pivot = numbers[left];

		while (left < right)
		{
			while ((numbers[right] >= pivot) && (left < right))
				right--;

			if (left != right)
			{
				numbers[left] = numbers[right];
				left++;
			}

			while ((numbers[left] <= pivot) && (left < right))
				left++;

			if (left != right)
			{
				numbers[right] = numbers[left];
				right--;
			}
		}

		numbers[left] = pivot;

		if (l_hold < left)
			q_sort(numbers, l_hold, left-1);

		if (r_hold > left)
			q_sort(numbers, right+1, r_hold);
	}

	public static void quickSort(int numbers[], int array_size)
	{
		q_sort(numbers, 0, array_size - 1);
	}

	public static void display(int a[],int size)
	{
		int i;
		System.out.println("\nArray Is : \n");
		for(i=0;i<size;i++)
			System.out.print(" "+a[i]);
	}
	
	public static void main(String[] args) {

		int size=5;
		int arr[]=new int[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Elements ");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		display(arr, size);
		quickSort(arr, size);
		display(arr, size);
		sc.close();
		
		
		
			
	}


}
