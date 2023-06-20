package stack_array1;


public class Mystack_array {
	int arr[];
	int top,size;
	
	public Mystack_array(int size) {
		this.size=size;
		top=-1;
		arr=new int[size];
	}
	private boolean isEmpty()
	{
		return top==-1;
	}
	private boolean isFull()
	{
		if(top==size-1)
			return true;
		else 
			return false;
	}
	
	public void push(int ele)
	{
		if(isFull())
			System.out.println("stack is full");
		else 
			arr[++top]=ele;

	}
	 
	public int pop()
	{
		int ele=-9999;
		if(!isEmpty())
			ele=arr[top--];
		return ele;	
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("---------------your stack is-----------------------");
			for(int i=top;i>=0;i--)
				System.out.println(arr[i]+" ");
		}
	}

	
}
