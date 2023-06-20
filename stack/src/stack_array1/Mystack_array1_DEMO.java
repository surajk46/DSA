package stack_array1;

import java.util.Scanner;

public class Mystack_array1_DEMO {
	public static void main(String[] args) {
		Mystack_array m=new Mystack_array(5);
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
				m.push(n);
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
