package linked_list3;

public class LinkedList {
	Node head;

	public LinkedList() {
		super();
		head =null;
	}
	
	public void createLinkedList(int terms)
	{
		for(int i=1;i<=terms;i++)
		{
			Node record=new Node(5*i);
			if(head==null)
				head =record;
			else {
				Node move=head;
				while(move.next!=null)
					move=move.next;
				move.next=record;
			}
		}
	}
	public void display() {
		System.out.println("-------------Linked list-------------");
		Node move=head;
		while(move!=null)
		{
			System.out.println(move);
			move=move.next;
		}
	}
	
}
