package linked_list8_merge_reverce;

public class Node {
	int data;
	Node next;
	public  Node() {
		next=null;
	}
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	
	@Override
	public String toString() {
		return "Node data=" + data ;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
	
}
