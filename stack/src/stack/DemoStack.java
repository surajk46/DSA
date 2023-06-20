package stack;

import java.util.Arrays;
import java.util.Scanner;

import stack_array1.Mystack_array;

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
	}
	
	
	@Override
	public String toString() {
		return "MyStack [size=" + size + ", top=" + top + ", arr=" + Arrays.toString(arr) + "]";
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
}
public class DemoStack {
	public static void main(String[] args) {
		
		Mystack_array m=new Mystack_array(5);
		Mystack_array o=new Mystack_array(5);
		Mystack_array e=new Mystack_array(10);
		Scanner scanner=new Scanner(System.in);
		int choice;
		int odd=0,even=0;
		int n=1;
		while(odd<=5 || even<=10)
		{
			if(n%2==0)
				{
					e.push(n);
					odd++;
				}
			else 
				{
					o.push(n);
					even++;
				}
			n++;	
		}
		e.display();
		o.display();
		
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
				System.out.println("Enter Element to add : ");
				int n1=scanner.nextInt();
				m.push(n1);
				break;
			case 2:
				int n2=m.pop();
				System.out.println("Deleted element is : "+n2);
				break;
			case 3:
				m.display();
				break;
			case 7:
				break;
			};
		} while (choice!=0);
		scanner.close();
	}
}
