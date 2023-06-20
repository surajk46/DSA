package prime_stack;

public class Mystack_prime {
	int arr[];
	int top,size;
	
	public Mystack_prime(int size)
	{
		this.size=size;
		top=-1;
		arr=new int[size];
	}
	private boolean isEmpty() {
		boolean flag=false;
		if(top==-1)
			flag=true;
		return flag;
	} 
	private boolean isFull() {
		boolean flag=false;
		if(top==size-1)
			flag=true;
		return flag;
	} 
	
	public void push(int ele) {
		if(!isFull())
			arr[++top]=ele;
		else
			System.out.println("Stack is full ");
	}
		
	public void display()
		{
			if(!isEmpty())
			{
				System.out.println("---------------your stack is-----------------------");
				for(int i=top;i>=0;i--)
					System.out.println(arr[i]+" ");
			}
		}	
		
	public int pop() {
		int ele=-9999;
		if(!isEmpty())
			ele=arr[top--];
		else 
			System.out.println("Stack is Empty ");
		return ele;
	}
}
