package revisionstack;

import java.util.Scanner;

class MyStackException extends RuntimeException
{
	String msg;

	public MyStackException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage()
	{
		return msg;
	}
}

class MyStack
{
	private int top,size;
	private int arr[];
	public MyStack(int size) {
		super();
		this.top = -1;
		this.size = size;
		this.arr = new int[size];
	}
	
	public void push(int data)
	{
		if(top!=size-1)
		{
			arr[++top]=data;
		}
		else {
			throw new MyStackException("--------------Stack is full-------------------");
		}
	}
	public int pop() {
		if(top!=-1)
		{
			return arr[top--];
		}
		else {
			throw new MyStackException("----------------Stack is empty------------------");
		}
	}

	public void display() {
		System.out.println("--------------------------------------------------------------");
		for(int i=top;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		System.out.println("--------------------------------------------------------------");
		
	}
}
public class Demo {
	public static void main(String[] args) {
		MyStack s=new MyStack(5);
		Scanner scanner=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1 : push");
			System.out.println("2 : Pop");
			System.out.println("3 : Display");
			System.out.println("1 : push");
			System.out.print("Enter your choice : ");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("Enter Element To add : ");
				int data =scanner.nextInt();
				try {
					s.push(data);
				}
				catch(MyStackException e)
				{
					System.out.println(e.getMessage());
				}
				
				break;
			case 2:
				try {
					System.out.println("Deleted data is : "+s.pop());
				}
				catch(MyStackException e)
				{
					System.out.println(e.getMessage());
				}
				
				break;
			case 3:
				try {
					s.display();
				}
				catch(MyStackException e)
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

