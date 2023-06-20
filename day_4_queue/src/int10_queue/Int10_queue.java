package int10_queue;

public class Int10_queue {
	int arr[];
	int front,rear;
	int size;
	
	
	public Int10_queue(int size) {
		this.front = -1;
		this.rear = -1;
		this.size = size;
		arr= new int[size];
		
	}
	public boolean isEmpty()
	{
		boolean flag=false;
		if(front == -1 && rear ==-1)
			//if(front==rear)
				flag=true;
	//		throw new QueueException("-------queue is Empty-----------");
		return false;
	}

	public boolean isFull()
	{
		boolean flag=false;
		if(rear==size-1)
			flag=true;
		return flag;
	}
	
	public void enQueue(int ele) 
	{
		if(!isFull())
		{
			arr[++rear]=ele;
			if(front==-1)
				front=0;
		}
		else {
			throw new QueueException("---------queue is Full-----------");
		}
	}
	
	public int deQueue() {
		int ele;
		if(isEmpty())
			throw new QueueException("-------queue is empty");
		ele=arr[front];
		if(front==rear)
			front=rear=-1;
		else
			front++;
		return ele;
	}
	
	public void display() {
		if(isEmpty())
			throw new QueueException("Queue is Empty");
		System.out.println("-------------your queue is--------------");
		for(int i=front;i<=rear;i++)
			System.out.print(arr[i]+"  ");
	}


}
