package circular_Queue;

import java.util.Scanner;

public class Circular_queue_cust {

	public static void main(String[] args) {
		Circular_Queue c=new Circular_Queue(5);
		Scanner scanner=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1 : enQueue");
			System.out.println("2 : deQueue");
			System.out.println("3 : Display");
			System.out.println("0 : Exit");
			System.out.print("Enter your choice =>>> ");
			choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1 : 
				System.out.print("Enter Customer Id =>>> ");
				int id=scanner.nextInt();
				System.out.print("Enter Customer Name =>>> ");
				String name=scanner.next();
				System.out.print("Enter Customer City =>>> ");
				String city=scanner.next();
				try
				{
					c.enQueue(new Customer(id, name, city));
					/* 
					 Customer cust=new Customer(id,name,city);
					 c.enQueue(cust);
					 */
				}
				catch(QueueException   e)
				{
					System.out.println(e.getMessage());
				}
				
				break;
			case 2 :
				try
				{
					System.out.println("Deleted element = "+c.deQueue());
				}
				catch(QueueException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 3 :
				try
				{
					c.display();
				} 
				catch (QueueException e) 
				{
					System.out.println(e.getMessage());

				}
			
				break;
			case 4 :
				break;
			}
		} while (choice!=0);
scanner.close();
	}

}
