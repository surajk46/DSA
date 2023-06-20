package circularQueue;

import java.util.Scanner;
class QueueException extends RuntimeException{
	private String msg;
	public QueueException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage() 
	{
		return msg;
	}
}

class MyCircularQueue
{
	int rear,size,front,arr[];

	public MyCircularQueue(int size) {
		super();
		this.rear = -1;
		this.size = size;
		this.front = -1;
		this.arr = new int [size];
	}
	public boolean isEmpty()
	{
		return (rear==front && front!=0);
	}
	public boolean isFull()
	{
		return front==(rear+1)%size;
	}
	
	public void enQueue(int ele) {
		if(!isFull())
		{
			if(front==-1)
				front=0;
			rear=(rear+1)%size;
			arr[rear]=ele;
			System.out.println("Rear = "+rear);
			System.out.println("Front = "+front);
		}
		else {
			System.out.println("Full");
		}
	}
	public int deQueue()
	{
		int ele=-9999;
		if(!isEmpty())
		{
			ele=arr[front];
			if(rear==front)
				rear=front=-1;
			else {
				front=(front+1)%size;
			}
			System.out.println("Rear = "+rear);
			System.out.println("Front = "+front);
		}
		else {
			System.out.println("EMPTY");
		}
		return ele;
	}
	
	public void display() {
		int i=0;
		if(!isEmpty())
			for(i=front;i!=rear;i=(i+1)%size)
			{
				System.out.println(arr[i]);
			}
		if(i==rear)
			System.out.println(arr[i]);
	}
}

public class Demo {
	public static void main(String[] args) {
		MyCircularQueue q= new MyCircularQueue(5);
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