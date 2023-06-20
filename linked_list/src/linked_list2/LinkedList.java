package linked_list2;

public class LinkedList {
	Node head;

	public LinkedList() {
		super();
		this.head = null;
	}
	public void createLikedList(int terms)
	{
		for(int i=1;i<=terms;i++)
		{
			Node record =new Node(i);
			if(head==null)
				head=record;
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
		System.out.println("------------Your linked list----------------");
		Node move=head;
		while(move!=null)
		{
			System.out.println(move);
			move=move.next;
		}
	}
	
}
