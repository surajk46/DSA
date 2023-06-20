package dynamic_stack1;

import java.util.Scanner;

class Node
{
	int data;
	Node next;
	
	public Node() {
		super();
		this.next = null;
	}

	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}

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

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
}

class DynamicStack
{
	Node top;
	public DynamicStack()
	{
		top=null;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public void push(int data) {
		Node record=new Node(data);
		if(top==null)
			top=record;
		else {
			record.next=top;
			top=record;
		}
	}
	
	public int pop()
	{
		int data=-9999;
		if(!isEmpty())
		{
		//	Node del=top;
			data=top.data;
			top=top.next;
		//	del=null;
		}
		return data;
			
	}
	
	public void display()
	{
		Node move=top;
		int i=0;
		System.out.println("---------------------------------------------------------------");
		while(move!=null)
		{
			System.out.println(++i + " : "+move.data);
			move=move.next;
		}
		System.out.println("---------------------------------------------------------------");

	}
}

public class Demo {
	public static void main(String[] args) {
	DynamicStack d=new DynamicStack();
	Scanner scanner=new Scanner(System.in);
	int choice=0;
	do {
		System.out.println("1 : Push ");
		System.out.println("2 : pop ");
		System.out.println("3 : Display ");
		System.out.println("4 :  ");
		System.out.print("Enter your Choice :  ");
		choice=scanner.nextInt();
		switch(choice) {
			case 1:
				System.out.print("Enter Element to add : ");
				int data=scanner.nextInt();
				d.push(data);
				break;
			case 2:
				System.out.println("Deleted element is : "+ d.pop());
				break;
			case 3:
				d.display();
				break;
			case 4:
				
				break;
		}
	} while (choice!=0);
	scanner.close();
	
}
}
