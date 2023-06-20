package circular_queue_int;

import java.util.Scanner;

public class Circular_q_int_demo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter size of Queue : ");
		int size=scanner.nextInt();
		Circular_queue_int c=new Circular_queue_int(size);
		System.out.println("Enter no Elements to add : ");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Element : ");
			int ele=scanner.nextInt();
			try {
				c.enQueue(ele);
			} catch (QueueException e) {
				//if(i>size-1)
				{
					try {
						c.deQueue();
						c.enQueue(ele);
					} catch (QueueException e1) {
						System.out.println(e1.getMessage());
					}
					
				}
			}
				
			
				
		}
		c.display();
	}
}
