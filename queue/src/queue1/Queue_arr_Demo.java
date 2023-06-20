package queue1;

import java.util.Scanner;



public class Queue_arr_Demo {
	public static void main(String[] args) {
		Queue_arr1 q= new Queue_arr1(5);
		Scanner scanner=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1 : push");
			System.out.println("2 : pop");
			System.out.println("3 : Display");
			System.out.println("0 : Exit");
			System.out.print("Enter your choice : ");
			choice =scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("Enter arr element : ");
				int n=scanner.nextInt();
				try {
				q.enQueue(n);
				}
				catch(QueueException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try
				{
					System.out.println("Deleted element is : "+q.deQueue()); ;
				}
				catch(QueueException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					q.display();
				}
				catch(QueueException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				break;
			};
			
			
		} while (choice!=0);
	}
}
