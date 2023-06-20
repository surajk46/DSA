package Stack_Book;

public class Stack_book {
	int size,top;
	Book arr[];
	
	public Stack_book(int size)
	{
		this.size=size;
		top=-1;
		arr=new Book[size];
	}
	private boolean isEmpty()
	{
		boolean flag=false;
		if(top==-1)
			flag= true;
		return flag;
	}
	
	private boolean isFull()
	{
		boolean flag=false;
		if(top==size-1)
			flag=true;
		return flag;
	}
	
	public void push(Book ele)
	{
		if(!isFull())
			arr[++top]=ele;
		else {
			System.out.println("------------stack is Full-----------");
		}
	}
	
	public Book pop()
	{
		Book ele=null;
		if(!isEmpty())
			ele=arr[top--];
		return ele;
	}
	
	public void display()
	{
		System.out.println("----------------your stack is---------------------");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)
			System.out.println(arr[i]);
		}
			
	}
}

