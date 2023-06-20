package linked_list5_sort;

public class LinkedList {
	Node head;

	public LinkedList() {
		super();
	}

	public LinkedList(Node head) {
		super();
		this.head = head;
	}
	
	public void display()
	{
		System.out.println("-------------your linked list is----------------");
		Node move=head;
		int c=0;
		while(move!=null)
		{
			System.out.println(++c +" : "+move.getData());
			move=move.getNext();
		}
	}
	
	public void addEle(int data)
	{
		Node record=new Node(data);
		if(head==null)
		{
			head=record;
			return;
		}
		Node move=head;
		if(record.getData()<head.getData())
		{
			record.setNext(head);
			head=record;
			return;
		}
		
		
		while(true)
		{
			if(move.getNext()==null)
			{
				move.setNext(record);
			break;
			}
			if(move.getData()<=record.getData() && move.getNext().getData()>record.getData())
			{
				record.setNext(move.getNext());
				move.setNext(record);
				break;
			}
			move=move.getNext();
		}
	}
}
