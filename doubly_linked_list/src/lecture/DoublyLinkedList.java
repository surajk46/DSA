package lecture;
import java.util.Scanner;
public class DoublyLinkedList {
	Node head;
	public DoublyLinkedList()
	{
		head=null;
	}
	public void addEnd(int data)
	{
		Node record=new Node(data);
		if(head==null)
		{
			head=record;
			return;
		}
		Node move=head;
		while(move.getNext()!=null)
			move=move.getNext();
		move.setNext(record);
		record.setPrev(move);
	}
	public void createLinkedLsit(int terms)
	{
		int no;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=terms;i++)
		{
			System.out.println("Enter Data ");
			no=sc.nextInt();
			addEnd(no);
		}
		
	}
	public int count()
	{
		int cnt=0;
		Node move=head;
		while(move!=null)
		{
			cnt++;
			move=move.getNext();
		}
		return cnt;
	}
	
	public void insert(int pos,int data)
	{   
		Node record=new Node(data);
		int cnt=count();
		if(pos==1)
		{
			head.setPrev(record);
			record.setNext(head);
			head=record;
			return;
		}
		if(pos>1 && pos<=cnt+1)
		{
			Node move=head;
			for(int i=1;i<pos-1;i++)
				move=move.getNext();
			record.setNext(move.getNext());
			if(move.getNext()!=null)
				move.getNext().setPrev(record);
			//record.setPrev(move);
			move.setNext(record);
		}
		else
			System.out.println(" Can not Insert Data ");
		
		
	}
	public void printReverse()
	{
		Node move;
		for(move=head;move.getNext()!=null;move=move.getNext());
		for(;move!=null;move=move.getPrev())
			System.out.println(move);
	}
	public void split()
	{
		DoublyLinkedList evennumber=new DoublyLinkedList();
		DoublyLinkedList oddnumber=new DoublyLinkedList();
		for(Node move=head;move!=null;move=move.next)
		{
			if(move.getData()%2==0)
				evennumber.addEnd(move.getData());
			else
				oddnumber.addEnd(move.getData());
		}
		evennumber.display();
		oddnumber.display();
		
	}
	public void display()
	{
		Node move;
		System.out.println(" ------------------- ");
		System.out.println();
		for(move=head;move!=null;move=move.getNext())
			System.out.print("  "+move);
		System.out.println();
		System.out.println(" ------------------- ");
	}
}
