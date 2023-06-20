package linked_list8_merge_reverce;

public class Demo {
	static LinkedList l1;
	static LinkedList l2;
	public static void merge(LinkedList l2)
	{
		Node move2=l2.head;
		Node move1=l1.head;
		while(move1.next!=null)
			move1=move1.next;
		
		Node record ;
		while(move2!=null)
			{
				record = new Node(move2.data);
				move1.next=record;
				move1=move1.next;
				move2=move2.next;
			}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("ll");
		l1=new LinkedList();
		l1.createLinkedList(5);
		l1.display();
		
		
		l2=new LinkedList();
		l2.createLinkedList(5);
		l2.display();
		
		l1.sort();
		//l1.merge(l2);  //changes l1 and add l2 at its end  //runs good
		//l1.display();
		//l1.printReverce(l1.head);    //runs good
		//l1.reverce();      //runs good
		//l1.display();
		
		/* 
	 	merge(l2);          //runs good
		l1.display();		// changes l1 and add l2 at its end
		*/
	}

}
