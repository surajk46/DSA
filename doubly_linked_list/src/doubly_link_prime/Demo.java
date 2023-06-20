package doubly_link_prime;

class Node
{
	int data;
	Node prev,next;
	
	public Node() {
		super();
		this.prev = null;
		this.next = null;
	}
	public Node(int data) {
		super();
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "Node data=" + data ;
	}
	
	
}



class DoublyLinkedList
{
	Node head;

	public DoublyLinkedList() {
		super();
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void createLinkedList(int terms)
	{
		int cnt=0,n=3;
		Node record=head;
		
		while(cnt<=terms)
		{
			
			boolean flag=true;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				cnt++;
				System.out.println(" " +n);
				record=new Node(n);
				if(head==null)
					head=record;
				else {
					Node move=head;
					while(move.next!=null)
						move=move.getNext();
					move.setNext(record);
					record.setPrev(move);
				}
			}
			n++;
		}
	}
	
	public void display() {
		Node move=getHead();
		int c=0;
		System.out.println("-------------Yours list is--------------------");
		while(move!=null)
			{
				System.out.println(++c + " : " + move.data);
				move=move.next;
			}
		System.out.println("-----------------------------------------------");
	}
}


public class Demo {
	public static void main(String[] args) {
		DoublyLinkedList l=new DoublyLinkedList();
		l.createLinkedList(15);
		l.display();
	}
}
