package doubly_linked_list;

public class DoublyLinkedList {
	Node head;
	
	public DoublyLinkedList()
	{
		this.head=null;
	}
	
	public void addEle(int data)
	{
		Node record=new Node(data);
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
	
	public void display()
	{
		System.out.println("-------------------Your List is-----------------------");
		Node move=head;
		int i=0;
		while(move!=null)
		{
			System.out.println(++i + " : " + move.data);
			move=move.next;
		}
	}
	
	public void printReverce()
	{
		Node move;
		for(move=head ; move.next!=null ; move=move.next);
		while(move!=null)
		{
			System.out.println(move.data);
			move=move.prev;
		}
	}
}
