package linked_list8_merge_reverce;

import java.util.Random;

public class LinkedList {
	Node head;
	
	public LinkedList()
	{
		this.head=null;
	}
	public LinkedList(Node head)
	{
		this.head=head;
	}
	public void createLinkedList(int terms)
	{
		Random random=new Random();
		for(int i=1;i<=terms;i++)
		{
			Node record=new Node(i*random.nextInt(10));
			if(head==null)
			{
				head=record;
			}
			else {
				Node move=head;
				while(move.next!=null)
					move=move.next;
				move.next=record;
			}
			
		}
	}
		public void display()
		{
			System.out.println("--------------Your LinkedList is-----------------");
			Node move=head;
			int c=0;
			while(move!=null)
			{
				System.out.println(++c + " : "+move.data);
				move=move.next;
			}
		}
		
		public void printReverce(Node move) {
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
		public void sort()
		{
			Node move=head;
			Node temp=head;
			while(move.next.next!=null)
			{
				temp=move;
				if(move.next.data>move.next.next.data)
				{
					temp.next=move.next;
					move.next=move.next.next;
					move.next.next.next=temp.next;							
				}
				move=move.next;
			}
		}
		public void merge(LinkedList l2) {
			Node move2=l2.head;
			Node move1;
			for(move1=head; move1.next!=null;move1=move1.next);
			
			while(move2!=null)
				{
					Node record = new Node(move2.data);
					move1.next=record;
					move1=move1.next;
					move2=move2.next;
				}
		}
}
