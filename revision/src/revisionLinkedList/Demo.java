package revisionLinkedList;

import java.util.Scanner;

class Node
{
	private int data;
	private Node next;
	
	public Node(int data) {
		this.data=data;
		next=null;
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
	
}

class MyLinkedList
{
	private Node head;
	
	public MyLinkedList() {
		head=null;
	}
	
	public void addBeg(int data) {
		Node record=new Node(data);
		if(head==null)
			head=record;
		else {
			Node move=head;
			while(move.getNext()!=null)
				move=move.getNext();
			move.setNext(record);
		}
	}
	
	public void display() {
		Node move=head;
		System.out.println("---------------------------------------------------------------------");
		while(move!=null)
		{
			System.out.println(move.getData());
			move=move.getNext();
		}
		System.out.println("---------------------------------------------------------------------");
	}
	public void reverce() {
		Node move=head;
		Node prev=head;
		while(move!=null)
		{
			move=move.getNext();
			move.setNext(prev);
			prev=prev.getNext();
		}
		head=move;
		System.out.println("---------------------------------------------------------------------");
		while(move!=null)
		{
			System.out.println(move.getData());
			move=move.getNext();
		}
		System.out.println("---------------------------------------------------------------------");
	}
}

public class Demo {

	public static void main(String[] args) {
		MyLinkedList l=new MyLinkedList();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1 : add Beg");
			System.out.println("2 : ");
			System.out.println("3 : Display");
			System.out.print("Enter Your choice : ");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter Element To Add : ");
					int data=sc.nextInt();
					l.addBeg(data);
					break;
				case 2:
					break;
				case 3:
					l.display();
					break;
				case 4:
					l.reverce();
					break;
			}
			
		} while (choice!=0);
		sc.close();
	}


}
