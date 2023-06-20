package dynamic_queue;

import java.util.Scanner;

class Node 
{
	int data;
	Node next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node(int data) {
		
		this.data = data;
		this.next = null;
	}
	@Override
	public String toString() {
		return " "+data;
	}
	
}

class DynamicQueue
{
	Node rear,front;
	public DynamicQueue() {
		super();
	}

	public DynamicQueue(Node rear, Node front) {
		super();
		this.rear = null;
		this.front = null;
	}
	
	public void enQueue(int data)
	{
		Node record=new Node(data);
		if(rear==null)
			front=rear=record;
		else {
			rear.next=record;
			rear=record;
		}
	}
	public int deQueue() {
		int data;
		if(front==null)
			throw new QueueException("----------------Queue is Empty----------------------");
		else {
			Node del=front;
			data=front.data;
			del=null;
			front=front.next;
			return data;
		}
	}
	public void display() {
		Node move=front;
		int i=0;
		if(move==null)
			throw new QueueException("----------------Queue is Empty----------------------");
		else
		while(move!=rear )
		{
			System.out.println(++i +" : "+move.data );
			move=move.next;
		}
		if(move==rear)
		System.out.println(++i +" : "+move.data );
	}
}
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

public class Demo_Dyan_Q {
	public static void main(String[] args) {
		DynamicQueue q= new DynamicQueue();
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