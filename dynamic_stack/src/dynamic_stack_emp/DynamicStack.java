package dynamic_stack_emp;

public class DynamicStack {
	Node top;
	
	public DynamicStack() {
		super();
		this.top = null;
	}

	public DynamicStack(Node top) {
		super();
		this.top = top;
	}

	public Node getTop() {
		return top;
		
	}
	public void setTop(Node top) {
		this.top = null;
	}
	
	public void push(Emp data)
	{
		Node record=new Node(data); 
		if(top==null)
			top=record;
		else {
			record.setNext(top);
			top=record;
		}
	}
	public Emp pop()
	{
		if(top==null)
			return null;
		Emp data =top.getData();
		top=top.getNext();
		return data;
	}
}
