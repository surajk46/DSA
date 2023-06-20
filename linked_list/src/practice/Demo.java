package practice;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	
	public Node() {
		super();
		next=null;
	}

	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "  data=" + data ;
	}
}

class LinkedList
{
	Node head;

	public LinkedList() {
		super();
		head=null;
	}
	
	public void addStart(int ele)
	{
		Node record=new Node(ele);
		if(head==null)
		{
			head=record;
		}
		else {
			record.next=head;
			head=record;
		}
	}
	public int delStart()
	{
		if(head==null)
		{
			return 0;
		}
		else {
			Node move=head;
			int ele=head.data;
			head=head.next;
			return ele;
		}
	}
	public void addEnd(int ele)
	{
		Node record=new Node(ele);
		if(head==null)
			head=record;
		else {
			Node move=head;
			while(move.next!=null)
				move=move.next;
			move.next=record;
		}
	}
	public int delEnd()
	{
		if(head==null)
			return -9999;
		else if(head.next==null)
		{
			int ele=head.data;
			head=null;
			return ele;
		}
		else {
			Node move=head;
			while(move.next.next!=null)
				move=move.next;
			int ele=move.next.data;
			move.next=null;
			return ele;
		}
	}
	public int count()
	{
		int c=0;
		Node move=head;
		while(move!=null)
		{
			c++;
			move=move.next;
		}
		return c;
	}
	public void addPos(int ele,int pos)
	{
		Node record=new Node(ele);
		if(head==null)
		{
			head=record;
		}
		else if(pos==1)
		{
			record.next=head;
			head=record;
		}
		else if(pos>1 && pos<=count()+1)
		{
			Node move=head;
			for(int i=1;i<pos-1;i++)
				move=move.next;
			record.next=move.next;
			move.next=record;
		}
		else {
			System.out.println("OUT OF BOND ");
		}
	}
	public void printReverce(Node move)
	{
		if(move!=null)
		{
			printReverce(move.next);
			System.out.println(move.data);
		}
	}
	public void reverce()
	{
		Node prev=head;
		Node curr=head.next;
		Node nxt=curr.next;
		while(curr!=null)
		{
			curr.next=prev;
			prev=curr;
			curr=nxt;
			if(nxt!=null)
				nxt=nxt.next;
		}
		head.next=null;
		head=prev;
	}
	public void display()
	{
		Node move=head;
		int  i=1;
		while(move!=null)
		{
			System.out.println(i++ +" : "+move.data);
			move=move.next;
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1 : add Ele Start");
			System.out.println("2 : Del Start");
			System.out.println("3 : Display");
			System.out.println("4 : add at end");
			System.out.println("5 : Del end");
			System.out.println("6 : Add at Pos ");
			System.out.print("Enter Your choice : ");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter Element To Add : ");
					int data=sc.nextInt();
					l.addStart(data);
					break;
				case 2:
					System.out.println("Deleted Element is : "+l.delStart());
					break;
				case 3:
					l.display();
					break;
				case 4:
					System.out.print("Enter Element To Add : ");
					data=sc.nextInt();
					l.addEnd(data);
					break;
				case 5:
					System.out.println("Deleted Element is : "+l.delEnd());
					break;
				case 6:
					System.out.print("Enter position : ");
					Integer pos=sc.nextInt();
					System.out.print("Enter Element To Add : ");
					data=sc.nextInt();
					l.addPos(data, pos);
					break;
				case 7:
					System.out.println("count : "+l.count());
					break;
				case 8:
					l.printReverce(l.head);
					break;
				case 9:
					l.reverce();
					l.display();
					break;
			}
			
		} while (choice!=0);
		sc.close();
	}
}
