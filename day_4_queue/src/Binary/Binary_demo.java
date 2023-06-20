package Binary;

import java.util.Scanner;

public class Binary_demo {
	public static void main(String [] args) {
		int n,rem,c=0;
		int bn[]=new int[100];
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter n : ");
		n=scanner.nextInt();
		
		while(n>0) 
		{
			rem=n%2;
			bn[c++]=rem;
			n/=2;
		}
		for(int i=c-1;i>=0;i--)
			System.out.print(bn[i] +"  ");
		
	}
}
