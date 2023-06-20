package linked_list3;

public class Node {
	int data;
	public Node next;
	public Node() {
		super();
		this.next = null;
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
	
