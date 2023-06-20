package linked_list6_at_sorted_pos;

public class LinkedList {
	Node head;
	
	public LinkedList() {
		super();
	}
	
	public LinkedList(Node head) {
		super();
		this.head = head;
	}
	
	public Node getHead()
	{
		return head;
	}
	
	public void setHead(Node head) 
	{
		this.head = head;
	}
	
	
	public void addEle(int data)
	{
		Node record=new Node(data);
		if(head==null)
		{
			head=record;
			return;
		}
		if(record.getData()<head.getData())
		{
			record.setNext(head);
			head=record;
			return;
		}
		
		Node move=head;
		while(true)
		{
			if(move.getNext()==null)
			{
				move.setNext(record);
				return;
			}
			if(move.getData()<=record.getData()   &&  move.getNext().getData()>record.getData())
			{
				record.setNext(move.getNext());
				move.setNext(record);
				return;
			}
			move=move.getNext();
		}
		
	}
	public void display()
	{
		Node move=head;
		int i=0;
		System.out.println("------------Your LinkedList is-----------------");
		while(move!=null)
		{
			System.out.println(++i + " : "+ move.getData());
			move=move.getNext();
		}
	}
}
