package adv;

public class LinkedList {
	Node head[];
	 public LinkedList(int size)
	 {
		 head=new Node[size];
		 for(int i=0;i<size;i++)
		 {
			 head[i]=new Node(i);
		 }
	 }

		
		public void addNode(int i, int data)
		{
			Node record=new Node(data);
			if(head[i]==null)
				head[i]=record;
			else {
				Node move=head[i];
				while(move.next!=null)
					move=move.next;
				move.next=record;
			}
		}
		public void display()
		{
		for(int i=0;i<head.length;i++)
			{
				 Node move=head[i];
				 while(move!=null)
				 {
					 System.out.print(" "+move.data);
					 move=move.next;
				 }
				 System.out.println();
			}
		}
}
