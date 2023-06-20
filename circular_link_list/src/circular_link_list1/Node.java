package circular_link_list1;

public class Node {
		int data;
		Node next;
		
		public Node() {
			super();
			next=null;
		}

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}

		@Override
		public String toString() {
			return "  data=" + data ;
		}
		
}
