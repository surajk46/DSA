package queue_cust;

import java.util.Random;
import java.util.Scanner;



public class Queue_arr_Demo {
	public static void main(String[] args) {
		Queue_cust q= new Queue_cust(5);
		Scanner scanner=new Scanner(System.in);
		Random random= new Random();
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

				System.out.print("Enter customer id : ");
				int id=random.nextInt(1000);
				System.out.println(id);
				System.out.print("Enter customer name : ");
				String name=scanner.next();
				System.out.print("Enter customer city : ");
				String city=scanner.next();
				try {
					q.enQueue(new Customer(id,name,city));
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
