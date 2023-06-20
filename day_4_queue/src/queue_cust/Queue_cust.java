package queue_cust;

public class Queue_cust {
	int size;
	int front,rear;
	Customer arr[];
	public Queue_cust(int size)
	{
		this.size=size;
		front=-1;
		rear=-1;
		arr=new Customer[size];
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
	public void enQueue(Customer ele)
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
	public Customer deQueue()
	{
		Customer ele;
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
		if(isEmpty())
			throw new QueueException("-------------your queue is Empty----------------");
		System.out.println("-------------your queue is---------------------");
		for(int i=rear;i>=front;i--)
		{
			System.out.println(arr[i]+"  ");
		}
	}
}
