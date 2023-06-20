package prime_stack;

import java.util.Scanner;

public class Demo_prime {
	public static boolean isPrime(int n) {
		boolean flag=true;
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Mystack_prime m=new Mystack_prime(5);
		Scanner scanner=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1 : push");
			System.out.println("2 : pop");
			System.out.println("3 : Display");
			System.out.println("0 : Exit");
			System.out.print("Enter Your choice : ");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Element to add : ");
				int n=scanner.nextInt();
				if(isPrime(n))
					m.push(n);
				else {
					System.out.println("---------------"+ n + " is not prime-----------------");
				}
				break;
			case 2:
				int n1=m.pop();
				System.out.println("Deleted element is : "+n1);
				break;
			case 3:
				m.display();
				break;
			case 7:
				break;
			};
		} while (choice!=0);
		scanner.close();
	}
}
