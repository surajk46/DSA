package linked_list4;


public class LinkedList {
	Node head;

	public LinkedList() {
		super();
		this.head =null;
	}
	
	public void createLinkedList(int terms)
	{
		Node record=null;
		for(int n=1;n<=100;n++)
		{
			boolean flag=true;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				{
					record = new Node(n);
					if(head==null)
						head=record;
					else {
						Node move=head;
						while(move.getNext()!=null)
							move=move.getNext();
						move.setNext(record);
						}
				}
			

		}
		
	}
	public void display() {
		System.out.println("------------Your Linked list is---------------");
		Node move=head;
		while(move!=null)
		{
			System.out.println(move);
			move=move.getNext();
		}
	}
}
