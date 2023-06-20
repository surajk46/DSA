package practice;

import java.util.Scanner;

class Node 
{
	int data;
	Node prev,next;
	public int getData() {
		return data;
	}
	public Node(int data) {
		
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	@Override
	public String toString() {
		return " "+data;
	}
	
}

class DoublyLinkedList
{
	Node head;

	public DoublyLinkedList() {
		super();
		this.head = null;
	}
	public void addEle(int data)
	{
		Node record=new Node(data);
		if(head==null)
		{
			head=record;
			//head.next=head;
		}
		else {
			Node move=head;
			while(move.next!=null)
				move=move.next;
			move.next=record;
			record.prev=move;
		}
	}
	public int count()
	{
		Node move=head;
		int c=1;
		while(move.next!=null)
		{
			move=move.next;
			c++;
		}
		return c;
		
	}
	public void addPos(int data,int pos)
	{
		Node record=new Node(data);
		Node move=head;
		if(head==null)
		{
			head=record;
		}
		else if(pos==1)
		{
			record.next=head;
			head.prev=record;
			head=record;
		}
		else if(pos>1 && pos<=count())
		{
			for(int i=1;i<pos-1;i++)
				move=move.next;
			record.next=move.next;
			if(record.next!=null)
				record.next.prev=record;
			record.prev=move;
			move.next=record;
			
			
		}
		
	}
	
	
	public void display()
	{
		Node move=head;
		System.out.println();
		while(move!=null)
		{
			System.out.print(" " + move.data);
			move=move.next;
		}
		System.out.println();
	}
	
	public void printReverce()
	{
		Node move;
		for(move=head;move.next!=null;move=move.next);
		
		for(;move!=null;move=move.prev)
		{
			System.out.println(" "+move.data);
		}
	}
	
}

public class Demo {
	public static void main(String[] args) {
		DoublyLinkedList l=new DoublyLinkedList();
		Scanner scanner=new Scanner(System.in);
		int pos=0;
		int data=0;
		int choice=0;
		do {
			System.out.println("1 : Add Ele ");
			System.out.println("2 : Del Ele ");
			System.out.println("3 : Display ");
			System.out.println("4 : Print Reverce ");
			System.out.print("Enter Your choice ==>>>");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
//				System.out.print("Enter the Position : ");
//				pos=scanner.nextInt();
				System.out.print("Enter Data : ");
				data=scanner.nextInt();
				l.addEle(data);
				break;
			case 2:
				System.out.print("Enter Data to Delete : ");
				data=scanner.nextInt();
				//l.delEle(data);
				break;
			case 3:
				l.display();
				break;
			case 4:
				l.printReverce();
				break;
			case 5:
				System.out.println("count  =  "+l.count());
				break;
			case 6:
				System.out.print("Enter the Position : ");
				pos=scanner.nextInt();
				System.out.print("Enter Data : ");
				data=scanner.nextInt();
				l.addPos(data,pos);
				break;
			}
			
			
		} while (choice!=0);
		scanner.close();
	}
}
