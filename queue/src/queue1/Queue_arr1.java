package queue1;

public class Queue_arr1 {
	int size;
	int front,rear;
	int arr[];
	public Queue_arr1(int size)
	{
		this.size=size;
		front=-1;
		rear=-1;
		arr= new int [size];
	}
	public boolean isFull()
	{	
		boolean flag=false;
		if(rear==size-1)
			flag=true;
		return flag;
	}
	public boolean isEmpty()
	{
		boolean flag=false;
			if(rear==-1)
				flag=true;
		return flag;
	}
	public void enQueue(int ele)
	{
		if(isFull())
		{
			throw new QueueException("----------------Stack is Full------------------------");
		}
		else {
			if(front==-1)
				front=0;
			arr[++rear]=ele;
		}
	}
	public int deQueue()
	{
		int ele;
		if(isEmpty())
			{
				throw new QueueException("Stack is empty");
			}
		ele=arr[front];
		if(rear<=front)
			rear=front=-1;
		else
			front++;
		return ele;
	}
	public void display()
	{
		System.out.println("-------------your queue is---------------------");
		//if(rear>=front)
		if(isEmpty())
			throw new QueueException("-------------your queue is Empty----------------");
		for(int i=rear;i>=front;i--)
		{
			System.out.println(arr[i]+"  ");
		}
	}
}
