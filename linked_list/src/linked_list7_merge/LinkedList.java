package linked_list7_merge;

public class LinkedList {
	Node head;
	
	public LinkedList()
	{
		super();
	}
	public LinkedList(Node head)
	{
		this.head=head;
	}
	public Node getHead()
	{
		return head;
	}
	
	public void setHead(Node head) 
	{
		this.head = head;
	}
	public void createLinkedlist(int terms)
	{
		for(int i=1 ; i<=terms ;i++)
		{
			Node record = new Node(i*2);
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
		}
	}
	
	public boolean isEmpty()
	{
		boolean flag=false;
		if(head==null)
			flag=true;
		return flag;
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
}
