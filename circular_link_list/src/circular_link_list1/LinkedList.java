 package circular_link_list1;

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
				{
					head=record;
					head.next=head;
				}
			else {
				Node move=head;
				while(move.next!=head)
					move=move.next;
				record.next=head;
				move.next=record;
			}
				
			no+=1;
		}
	}


	public void printReverce() {
		
		
	}

	public int count() {
		Node move=head;
		int c=1;
		while(move.next!=head)
			{
				move=move.next;
				c++;
			}
		return c;
	}
	public void addElem(int pos, int data) {
		Node record=new Node(data);
		if(head==null)
		{
			head=record;
			head.next=head;
		}
		else if (pos==1){
			record.next=head;
			Node move=head;
			while(move.next!=head)
				move=move.next;
			head=record;
			move.next=head;
		}
		else if(pos>1 && pos<=count()+1)
		{
			Node move=head;
			for(int i=1;i<pos-1;i++)
				move=move.next;
			record.next=move.next;
			move.next=record;
			
		}
		else {
			System.out.println("------------------Position is out of bound-------------------");
		}
		
	}
	
	public int delEle(int data) {
		Node move=head;
		int data1=-9999;
		if(head==null)
			System.out.println("-------------List is Empty-------------------");
		else if(head.data==data)
		{
			while(move.next!=head)
				move=move.next;
			move.next=head.next;
			data1=data;
			head=head.next;
		}
		else {
			while(move.next.data!=data)
			{
				move=move.next;
			}
			data1=move.next.data;
			move.next=move.next.next;
		}
		return data1;
	}
	
	public void split()
	{
		
		LinkedList even=new LinkedList();
		LinkedList odd=new LinkedList();
		int i=1,j=1;
		Node move=head;
		while(move.next!=head)
		{
			if(move.data%2==0)
				{
					even.addElem(i, move.data);
					i++;
				}
			else {
				odd.addElem(j, move.data);
				j++;
			}
			move=move.next;
		}
		if(move.next.data%2==0)
			even.addElem(i, move.data);
		else {
			odd.addElem(j, move.data);
		}
		
		even.display();
		odd.display();
		
	}
	public void modify(int data, int newData)
	{
		Node move=head;
		boolean flag=false;
		if(head==null)
			System.out.println("-------------List is Empty-------------------");
		else {
			while(move.next!=head)
				{
					if(move.data==data)
					{
						flag=true;
						break;
					}
					move=move.next;
				}
			
			if(flag==true)
				move.data=newData;
			else if(move.data==data)
				move.data=newData;
			else {
				System.out.println("---------------Element not found-------------");
			}
		}
	}
	public void display() {
		System.out.println("------------Your Linked list is---------------");
		Node move=head;
		int i=0;
		while(move.next!=head)
		{
			System.out.println(++i+ " : "+move.data);
			move=move.next;
		}
		System.out.println(++i+ " : "+move.data);
	}

	
}
