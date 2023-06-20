package doubly_link_list2;

import java.lang.foreign.ValueLayout.OfAddress;
import java.util.Scanner;

class Node
{
	int data;
	Node prev,next;
	
	public Node(int data)
	{
		this.data=data;
		prev=next=null;
	}
	public String toString()
	{
		return "Data : " + data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}

class DoublyLinkedList
{
	Node head;
	public DoublyLinkedList()
	{
		this.head=null;
	}
	public int count()
	{
		int c=0;
		Node move=head;
		while(move!=null)
		{
			move=move.next;
			c++;
		}
		return c;
	}
	
	public void createLinkedList(int terms)
	{
		//Random random=new Random();
		for(int i=1;i<=terms;i++)
		{
		//	Node record=new Node(i*random.nextInt(10));
			Node record=new Node(i);
			if(head==null)
				head=record;
			else {
				Node move=head;
				while(move.next!=null)
					move=move.next;
				move.next=record;
				record.prev=move;
			}
		}
	}
	
	public void delEle(int pos)
	{
		Node move=head;
		if(head==null)
			System.out.println("------------------List is Empty--------------------");
		else if(pos==1)
		{
			move.next.prev=null;
			move=move.next;
			head=move;
		}
		else if(pos>1  && pos<=count()+1)
		{
			for(int i=1;i<pos-1;i++)
				move=move.next;
			move.next=move.next.next;
			move.next.next.prev=move.next.prev;
			
		}
		else {
			System.out.println("ele not found");
		}
	}
	
	public void delByData(int data)
	{
		Node move1=head;
		boolean flag=false;
		while(move1.data==data)
		{
			flag=true;
			move1=move1.next;
		}
		
		if(flag==true)
		{
			if(head==null)
				System.out.println("Empty");
			else {
				if(head.data==data)
				{
					head.next.prev=null;
					head=head.next;
				}
				else {
					Node move=head;
					while(move.next.data!=data)
						move=move.next;
					if(move.next.next==null)
						{
							move.next=null;
						}
					else {
						move.next=move.next.next;
						move.next.prev=move;
					}
					
				}
			}
		}
		else{
			System.out.println("------------data Not Found---------------------");
		}
			

	}
	
	public void addEle(int pos,int data)
	{
		Node record=new Node(data);
		if(head==null)
			head=record;
		else if(pos==1)
		{
			head.prev=record;
			record.next=head;
			head=record;
			return;
		}
		else if (pos>1  && pos<=count()+1){
			Node move=head;
			for(int i=1;i<pos-1;i++)
				move=move.next;
			record.next=move.next;
			if(move.next!=null)
				move.next.prev=record;
			record.prev=move;
			move.next=record;
		}
		else {
			System.out.println("------Position is out of length of list---------");
		}
	}
	
	public void printReverce()
	{
		Node move;
		for(move=head; move.next!=null; move=move.next);
		while(move!=null)
		{
			System.out.println(move.data);
			move=move.prev;
		}
	}
	
	public void display()
	{
		System.out.println("-------------Yours list is--------------------");
		Node move=head;
		int i=0;
		while(move!=null)
		{
			System.out.println(++i + " : " + move.data);
			move=move.next;
		}
		System.out.println("-----------------------------------------------");
	}
}


public class Demo {

	public static void main(String[] args) {
		DoublyLinkedList l=new DoublyLinkedList();
		 l.createLinkedList(5);
		 Scanner scanner1=new Scanner(System.in);
		int pos=0;
		int data=0;
		//Scanner scanner1=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1 : Add Ele ");
			System.out.println("2 : Del Ele ");
			System.out.println("3 : Display ");
			System.out.println("4 : Print Reverce ");
			System.out.println("5 : del by Data ");
			System.out.print("Enter Your choice ==>>>");
			choice=scanner1.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("Enter the Position : ");
				pos=scanner1.nextInt();
				System.out.print("Enter Data : ");
				data=scanner1.nextInt();
				l.addEle(pos, data);
				break;
			case 2:
				System.out.print("Enter the Position to delete: ");
				pos=scanner1.nextInt();
				l.delEle(pos);
				break;
			case 3:
				l.display();
				break;
			case 4:
				l.printReverce();
				break;
			case 5:
				System.out.print("Enter the data to delete: ");
				data=scanner1.nextInt();
				l.delByData(data);
				break;
			}
			
			
		} while (choice!=0);
		scanner1.close();
	}

}
