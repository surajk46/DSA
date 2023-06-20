package practice;

import java.util.Arrays;
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

class MyQueue
{
	int arr[],rear,front,size;

	public MyQueue(int size) {
		super();
		
		this.rear = -1;
		this.front = -1;
		this.size = size;
		arr=new int[size];
	}

	@Override
	public String toString() {
		return "MyQueue [arr=" + Arrays.toString(arr) + ", rear=" + rear + ", front=" + front + ", size=" + size + "]";
	}
	
	public boolean isEmpty() {
		return rear==-1;
	}
	public boolean isFull() {
		return rear== (size-1);
	}
	
	public void enQueue(int data)
	{
		if(!isFull())
		{
			if(front==-1)
				front=0;
			arr[++rear]=data;
		}
		else {
			System.out.println("---------------full-----------------");
		}
	}
	
	public int deQueue()
	{
		int ele;
		if(isEmpty())
			{
				throw new QueueException("Stack is empty");
			}
		ele=arr[front];
		if(rear<=front)
			rear=front=-1;
		else
			front++;
		return ele;
	}
	public void display()
	{
		if(!isEmpty())
		{
			for(int i=rear;i>=front;i--)
			{
				System.out.println(arr[i]);
			}
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		MyQueue q= new MyQueue(5);
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
