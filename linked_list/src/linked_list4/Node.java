package linked_list4;

public class Node {
	private int data;
	private Node next;
	public Node() {
		super();
		this.next = null;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public Node getNext() {
		return next;
	}
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	@Override
	public String toString() {
		return "   data = " + data;
	}
}
	
