package linked_list_string;

import java.util.Scanner;


public class LinkedListString {
	Node head;

	public LinkedListString() {
		super();
		head=null;
	}

	public Node getHead() {
		return head;
	}

	public LinkedListString(Node head) {
		super();
		this.head = null;
	}
	public void display() {
		System.out.println("------------Your Linked list is---------------");
		Node move=head;
		int c=0;
		while(move!=null)
		{
			System.out.println(c++ +" : " +move.a);
			move=move.next;
		}
	}
	public void createLinkedList() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter String : ");
		String b=scanner.next();
		
		Node record=new Node(b);
		if(head==null)
			head=record;
		else {
			Node move=head;
			while(move.next!=null)
				move=move.next;
			move.next=record;
			scanner.close();
		}		
	}
	public void addBeg(String str) {
		Node record=new Node(str);
		if(head==null)
		{
			head=record;
			return;
		}
		record.next=head;
		head=record;
	}
	
	
	public void addEnd(String str) {
		Node record=new Node(str);
		if(head==null)
			head=record;
		else {
			Node move=head;
			while(move.next!=null)
			{
				move=move.next;
			}
			move.next=record;
		}
	}
	
	public void addNodeMid(int pos,String str) {
		Node record=new Node(str);
		Node move=head;
		for(int i=0;i<pos-1;i++)
		{
			move=move.next;
		}
		
		record.next=move.next;
		move.next=record;
	}
	
	public String deleteBeg()
	{
		if(head==null)
			{
				System.out.println("----------LinkedList is Empty----------------");
				return "";
			}
		String a=head.a;
		head=head.next;
		
		return a;
	}
	public String deleteEnd() {
		if(head==null)
		{
			System.out.println("----------LinkedList is Empty----------------");
			return "";
		}
		Node move=head;
		while(move.next.next!=null)
			move=move.next;
		String a=move.next.a;
		move.next=null;
		return a;
		
	}
	public String printFirstNode() {
		return head.a;
	}
	public String printLastNode() {
		Node move=head;
		while(move.next!=null)
			move=move.next;
		return move.a;
	}

	public String printNthNode(int n) {
		Node move=head;
		for(int i=0;i<n;i++)
		{
			move=move.next;
		}
		return move.a;
	}

	public void modify(int index,String str) {
		Node move=head;
		for(int i=0;i<index;i++)
		{
			move=move.next;
		}
		move.a=str;
		System.out.println("-------Updated LInked list is---------");
		display();
	}

	public void search(String str) {
		Node move=head;
		int c=0;
		int index=0;
		while(move.next!=null)
		{
			if(move.a.equalsIgnoreCase(str))
			{
				index=c;
				break;
			}
			move=move.next;
			c++;
		}
		if(index==0)
			System.out.println(str+" Not found in given Linked List");
		else {
			System.out.println(str+" found At "+index+" index in given Linked List");
		}	
	}

	public void deleteMid(String str) {
		Node move=head;
		while(move.next!=null)
		{
			if(move.next.a.equals(str))
			{
				move.next=move.next.next;
				break;
			}
			move=move.next;
		}
		
	}

	public void printReverce(Node move) {
		if(move!=null)
		{
			printReverce(move.next);
			System.out.println(move.a);
		}
	}
	
	public void reverce()
	{
		Node prev=head;
		Node curr=head.next;
		Node nxt=curr.next;
		while(curr != null)
		{
			curr.next=prev;
			prev=curr;
			if(nxt!=null)
				nxt=nxt.next;
		}
		head.next=null;
		head=prev;
	}
}
