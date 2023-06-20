package Reverce_string;

public class Mystack_Reverce {
	char arr[];
	int top,size;
	
	public Mystack_Reverce(int size) {
		this.size=size;
		top=-1;
		arr=new char[size];
	}
	private boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	private boolean isFull()
	{
		if(top==size-1)
			return true;
		else 
			return false;
	}
	
	public void push(char ele)
	{
		if(isFull())
			System.out.println("stack is full");
		else 
			arr[++top]=ele;

	}
	 
	public char pop()
	{
		char ele='\0';
		if(!isEmpty())
			ele=arr[top--];
		return ele;	
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

	
}
