package binary_search_tree;

public class Node {
	int data;
	Node left,right;
	public Node(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}
	@Override
	public String toString() {
		return "Node [data = " + data + "]";
	}
	
	
}
