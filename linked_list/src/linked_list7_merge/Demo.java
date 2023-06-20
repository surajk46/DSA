package linked_list7_merge;

public class Demo {
	static LinkedList l1;
	static LinkedList l2;
	static LinkedList res;
/*	public static void merge(LinkedList l1,LinkedList l2)
	{
		res=new LinkedList();
		Node move1=l1.getHead();
		while(true)
		{
			if(move1==null)
				break;
			else {
				Node record=new Node(move1.getData());
				if(res.getHead()==null)
				{
					res.setHead(record);
				}
				else {
					Node move=res.getHead();
					while(move.next!=null)
						move=move.next;
					move.next=record;
				}
				move1=move1.next;
			}
		}
		Node move2=l2.getHead();
		while(true)
		{
			if(move2==null)
				break;
			else {
				Node record=new Node(move2.getData());
				if(res.getHead()==null)
				{
					res.setHead(record);
				}
				else {
					Node move=res.getHead();
					while(move.next!=null)
						move=move.next;
					move.next=record;
				}
				move2=move2.next;
			}
		}

		
	}
	
*/	public static void merge(LinkedList l1,LinkedList l2)
	{
		res=new LinkedList();
		Node move1=l1.getHead();
		Node move2=l2.getHead();
		Node record=null;
		while(true)
		{
			
			if(move1==null  &&  move2==null)
				break;
			else {
				if(move1!=null)
					{
						record=new Node(move1.getData());
						move1=move1.next;
					}
				else if(move2!=null)
					{
						record=new Node(move2.getData());
						move2=move2.next;
					}
				if(res.getHead()==null)
				{
					res.setHead(record);
				}
				else {
					Node move=res.getHead();
					while(move.next!=null)
						move=move.next;
					move.next=record;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		l1=new LinkedList();
		l1.createLinkedlist(5);
		l1.display();
		
		
		l2=new LinkedList();
		l2.createLinkedlist(5);
		l2.display();
		System.out.println("++++++++++++++++++++++++++");
		merge(l1, l2);
		System.out.println("----------------------------");
		res.display();
		System.out.println("**********************************");
	}
}
