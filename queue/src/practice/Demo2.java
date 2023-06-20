package practice;

import java.util.Scanner;
class MyQueue2
{
	int arr[],size,rear,front;

	public MyQueue2(int size) {
		super();
		
		this.size = size;
		this.rear = -1;
		this.front = -1;
		arr=new int[size];
	}
	
	
	public boolean isEmpty() {
		return rear==-1;
	}
	public boolean isFull() {
		return rear==size-1;
	}
	public void enQueue(int ele)
	{
		if(!isFull())
		{
			if(front==-1)
				front=0;
			arr[++rear]=ele;
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
			if(rear<=front)
				rear=front=-1;
			else {
				front++;
			}
		}
		else {
			System.out.println("Empty");
		}
		return ele;
	}
	public void display() {
		if(!isEmpty())
			for(int i=rear;i>=front;i--)
				System.out.println(arr[i]);
		
	}
}
public class Demo2 {
	public static void main(String[] args) {
		MyQueue2 q= new MyQueue2(5);
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