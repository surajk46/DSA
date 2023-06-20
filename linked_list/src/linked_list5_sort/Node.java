package linked_list5_sort;

public class Node {
	private int data;
	private Node next;
	public Node() {
		super();
	}
	public Node(int data) {
		super();
		this.data = data;
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
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
}
