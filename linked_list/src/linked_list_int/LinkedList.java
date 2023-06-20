package linked_list_int;

public class LinkedList {
	Node head;

	public LinkedList() {
		super();
		this.head = null;
	}
	
	public void createLinkedList(int terms)
	{
		int no=2;
		for(int i=1;i<=terms;i++)
		{
			Node record=new Node(no);
			if(head==null)
				head=record;
			else {
				Node move=head;
				while(move.next!=null)
					move=move.next;
				move.next=record;
			}
				
			no+=2;
		}
	}
	public void display() {
		System.out.println("------------Your Linked list is---------------");
		Node move=head;
		while(move!=null)
		{
			System.out.println(move);
			move=move.next;
		}
	}
}
