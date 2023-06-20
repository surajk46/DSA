package stack_as_queue;

import java.util.Scanner;

class MyStack
{
	int size;
	int top;
	int arr[];
	public MyStack() {
		super();
		this.top = -1;
	}
	public MyStack(int size) {
		super();
		this.size = size;
		this.top = -1;
		this.arr=new int[size];
	}
	
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==size-1;
	}
	
	public void push(int data) {
		if(isFull())
		{
			System.out.println("----------stack is full--------------");
		}
		else {
			arr[++top]=data;
		}
	}
	
	public int pop()
	{
		int ele=-9999;
		if(!isEmpty())
		{
			ele=arr[top--];
		}
		return ele;
	}
	public void display()
	{
		if(!isEmpty())
		{
			System.out.println("---------------your stack is-----------------------");
			for(int i=top;i>=0;i--)
				System.out.println(arr[i]+" ");
		}
		else {
			System.out.println("---------------your stack is Empty-----------------------");
		}
	}
}


public class Demo
{
	public static void main(String[] args) {
		MyStack m1=new MyStack(10);
		MyStack m2=new MyStack(10);
		
		Scanner scanner=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1 : push");
			System.out.println("2 : pop");
			System.out.println("3 : Display");
			System.out.println("0 : Exit");
			System.out.print("Enter Your choice : ");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("Enter Element to add : ");
				int n1=scanner.nextInt();
				m1.push(n1);
				break;
			case 2:
				int n2=0;
				while(!(m1.isEmpty()))
				{
					m2.push(m1.pop());
				}
				n2=m2.pop();
				System.out.println("Deleted element is : "+n2);
				while(!(m2.isEmpty()))
				{
					m1.push(m2.pop());
				}
				
				break;
			case 3:
				m1.display();
				break;
			case 7:
				break;
			};
		} while (choice!=0);
		scanner.close();
	}
}