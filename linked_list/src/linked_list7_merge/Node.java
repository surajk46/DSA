package linked_list7_merge;

public class Node {
int data;
Node next;

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
	return "  data=" + data;
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
