package queue_as_stack;

import java.util.Scanner;


class MyQueueException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	
	public MyQueueException(String msg) {
		this.msg=msg;
	}
	
	public String getMessage()
	{
		return msg;
	}

	@Override
	public String toString() {
		return "MyQueueException [msg=" + msg + "]";
	}
	
}

class MyQueue
{
	private int rear,front,size;
	private int arr[];
	
	public MyQueue(int size) {
		this.rear=-1;
		this.front=-1;
		this.size=size;
		this.arr=new int[size];
		
	}
	
	public int getRear() {
		return rear;
	}


	public int getFront() {
		return front;
	}

	public void enQueue(int data) {
		if(rear!=size-1)
		{
			if(front==-1)
				front=0;
			arr[++rear]=data;
			System.out.println("Rear = "+rear);
			System.out.println("Front = "+front);
		}
		else {
			throw new MyQueueException("--------------------Queue is Full------------------------");
		}
	}
	
	public int deQueue() {
		if(front!=-1) {
			int ele=arr[front];
			if(front >= rear)
				rear=front=-1;
			else {
				front++;
			}
			System.out.println("Rear = "+rear);
			System.out.println("Front = "+front);
			return ele;
		}
		else {
			throw new MyQueueException("--------------------Queue is Empty------------------------");
		}
	}
	
	public void display() {
		System.out.println("-----------------------------------------------------------------------");
		if(front !=-1 && rear !=-1)
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\n-----------------------------------------------------------------------");
	}
}

public class Demo {
	public static void main(String[] args) {
		MyQueue q1= new MyQueue(5);
		MyQueue q2= new MyQueue(5);
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
				q1.enQueue(n);
//				while(q1.getRear()>2)
//					q2.enQueue(q1.deQueue());
				}
				catch(MyQueueException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try
				{
					while(q1.getRear() > q1.getFront())
						q2.enQueue(q1.deQueue());
					int d=q1.deQueue();
					System.out.println("Deleted element is : "+d);
					while(q2.getFront()!=-1)
						q1.enQueue(q2.deQueue());
				} 
				catch(MyQueueException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					q1.display();
				}
				catch(MyQueueException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				break;
			};	
		} while (choice!=0);
		scanner.close();
	}
}
