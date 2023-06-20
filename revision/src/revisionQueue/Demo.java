package revisionQueue;

import java.util.Scanner;

//ABDEFHHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz.
class MyQueueException extends RuntimeException
{
	private String msg;
	
	public MyQueueException(String msg)
	{
		this.msg=msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

class MyQueue
{
	private int data;
	private int front ,rear,size;
	private int arr[];
	
	public MyQueue(int size)
	{
		this.size=size;
		front=rear=-1;
		arr=new int[size];
	}
	
	public void enQueue(int data)
	{
		
		if(rear!=size-1)
		{
			if(front==-1)
				front=0;
			arr[++rear]=data;
		}
		else
			throw new MyQueueException("----------------------------Queue is Full--------------------");
	}
	public int deQueue() {
		if(rear!=-1)
		{
			int ele =arr[front];
			if(front>=rear)
				front=rear=-1;
			else
				front++;
			return ele;
		}
		else
			throw new MyQueueException("----------------------------Queue is Empty--------------------");
	}
	
	public void display()
	{
		if(rear==-1)
			throw new MyQueueException("----------------------------Queue is Empty--------------------");
		else
		{
			System.out.println("----------------------------------------------------------------");
			for(int i=front;i<=rear;i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println("----------------------------------------------------------------");
		}
			
	}
}

public class Demo {
	public static void main(String[] args) {

	MyQueue q= new MyQueue(5);
	Scanner scanner=new Scanner(System.in);
	int choice=0;
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
			catch(MyQueueException e)
			{
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			try
			{
				System.out.println("Deleted element is : "+q.deQueue()); ;
			}
			catch(MyQueueException e)
			{
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			try {
				q.display();
			}
			catch(MyQueueException e)
			{
				System.out.println(e.getMessage());
			}
			break;
		case 4:
			break;
		}
		
		
	} while (choice!=0);
	}
}
