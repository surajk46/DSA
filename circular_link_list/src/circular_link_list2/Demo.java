package circular_link_list2;

import java.util.Scanner;


class Node
{
	private int data;
	private Node prev,next;
	public Node(int data) {
		super();
		this.data = data;
		this.prev = null;
		this.next = null;
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
class LinkedList
{
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedList() {
		super();
		head=null;
	}
	
	public int count() {
		Node move=head;
		int c=1;
		while(move.getNext()!=head)
		{
			c++;
			move=move.getNext();
		}
		return c;
	}
	
	
	public void createLinkedList(int terms) {
		for(int i=1;i<=terms;i++)
		{
			Node record=new Node(i);
			if(head==null)
			{
				head=record;
				head.setNext(head);
			}
			else {
				Node move=head;
				while(move.getNext()!=head)
					move=move.getNext();
				move.setNext(record);
				record.setNext(head);
				record.setPrev(move);
				head.setPrev(move.getNext());
			}
		}
	}
	
	public void addElem(int pos,int data) {
		Node record=new Node(data);
		if(head==null)
		{
			record.setNext(head);
			record.setPrev(head);
			head=record;
			
		}
		else if (pos==1)
		{
			record.setNext(head);
			record.setPrev(head.getPrev());
			
			Node move=head;
			while(move.getNext()!=head)
				move=move.getNext();
			head=record;
			move.setNext(head);
			
			
			
		}
		else if(pos>1 && pos<=count()+1)
		{
			Node move=head;
			for(int i=1;i<pos-1;i++)
				move=move.getNext();
			if(move.getNext()!=null)
			{
				record.setNext(move.getNext());
				record.getNext().setPrev(record);
				record.setPrev(move);
				move.setNext(record);
			}
		}
		else {
			System.out.println("-------------------Position Is out of bound---------------------");
		}
	}
	public void printReverce()
	{
		Node move=head;
		for(move=head; move.getNext()!=head; move=move.getNext());
		Node move1=move;
		int i=0;
		while(move.getPrev()!=move1)
		{
			System.out.println(++i +" : "+move.getData());
			move=move.getPrev();
		}
		System.out.println(++i +" : "+head.getData());
	}
	
	public void display() {
		System.out.println("----------------------------------------------------");
		Node move=head;
		int i=0;
		while(move.getNext()!=head)
			{
				System.out.println(++i +" : "+move.getData());
				move=move.getNext();
			}
		System.out.println(++i +" : "+move.getData());
		System.out.println("No of Elements = "+count());
		System.out.println("----------------------------------------------------");
	}
}
public class Demo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		Scanner scanner=new Scanner(System.in);
		int choice=0,data=0,pos=0;
		l.createLinkedList(7);
		l.display();
		do {
			System.out.println("1 : add ele ");
			System.out.println("2 :  ");
			System.out.println("3 : Display");
			System.out.println("4 : Print Reverce ");
			System.out.print("Enter your choice : ");
			choice=scanner.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter int Position : ");
					pos=scanner.nextInt();
					System.out.print("Enter int Element : ");
					data=scanner.nextInt();
					l.addElem(pos,data);
					break;
				case 2:
					
					break;
				case 3:
					l.display();
					break;
				case 4:
					l.printReverce();
					break;
			}
		}while(choice!=0);
		scanner.close();
	}
}
