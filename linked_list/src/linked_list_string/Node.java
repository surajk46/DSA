package linked_list_string;

public class Node {
	String a;
	Node next;
	public Node() {
		super();
	}
	public Node(String a) {
		super();
		this.a = a;
		this.next = null;
	}
	
	@Override
	public String toString() {
		return "a=" + a ;
	}
	
}
