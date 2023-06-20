package doubly_link_3_del_search_rev;

import java.util.Scanner;

class Node
{
	private int data;
	Node prev;
	private Node next;
	
	
	public Node() {
		super();
		this.prev = null;
		this.next = null;
	}

	public Node(int data) {
		super();
		this.data=data;
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

	@Override
	public String toString() {
		return "Node data=" + data ;
	}
	
}


class DoublyLinkedList
{
	private Node head;
	public DoublyLinkedList() {
		super();
		this.head = null;
	}
	
	public int count()
	{
		int c=1;
		Node move=head;
		for(move=head; move!=null; move=move.getNext())
		{
			c++;
		}
		return c;
	}
	
	public void delEle(int data) {
		boolean flag=true;
		if(head==null)
		{
			System.out.println("EMPTY");
		}
		else {
			Node move=head;
			while(move.getNext().getData()!=data)
			{
				move=move.getNext();
				flag=false;
			}
			if(flag==true)
			{
				if(head.getData()==data)
				{
					head.getNext().setPrev(null);
					head=head.getNext();
				}
				else if(move.getNext().getData()==data){
					if(move.getNext().getNext()==null)
					{
						move.setNext(null);
					}
				else {
					move.setNext(move.getNext().getNext());
					move.getNext().setPrev(move);
				}
				}
				
			}
		}
	}
	
	public void addEle(int pos,int data)
	{
		Node record=new Node(data);
		if(head==null)
			head=record;
		else if(pos==1)
		{
			record.setNext(head);
			head.setPrev(record);
			head=record;
		}
		else if(pos>1 && pos<count()+1)
		{
			Node move=head;
			for(int i=1;i<pos-1;i++)
				move=move.getNext();
			record.setNext(move.getNext());
			if(record.getNext()!=null)
				record.getNext().setPrev(record);
			record.setPrev(move);
			move.setNext(record);
			
		}
	}
	public void printReverce()
	{
		Node move;
		for(move=head; move.getNext()!=null; move=move.getNext());
		while(move!=null)
		{
			System.out.println(move.getData());
			move=move.getPrev();
		}
	}
	
	public void display()
	{
		System.out.println("-------------Yours list is--------------------");
		Node move=head;
		int i=0;
		while(move!=null)
		{
			System.out.println(++i + " : " + move.getData());
			move=move.getNext();
		}
		System.out.println("-----------------------------------------------");
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
		//System.out.println("5 : del by Data ");
		System.out.print("Enter Your choice ==>>>");
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			System.out.print("Enter the Position : ");
			pos=scanner.nextInt();
			System.out.print("Enter Data : ");
			data=scanner.nextInt();
			l.addEle(pos, data);
			break;
		case 2:
			System.out.print("Enter Data to Delete : ");
			data=scanner.nextInt();
			l.delEle(data);
			break;
		case 3:
			l.display();
			break;
		case 4:
			l.printReverce();
			break;
		case 5:
			
			break;
		}
		
		
	} while (choice!=0);
	scanner.close();
}
	
}
