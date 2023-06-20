package circular_Queue;



public class Circular_Queue {
	private int size,rear,front;
    private Customer arr[];
	public Circular_Queue(int size) {
		this.size = size;
		this.rear = -1;
		this.front = -1;
		arr = new Customer[size];
	}
	
	public boolean isEmpty()
	{
		boolean flag=false;
		if(rear==front && rear!=0)
			flag=true;
		return flag;
	}
	
	public boolean isFull()
	{
		boolean flag=false;
		if(front==(rear+1)%size)
			flag=true;
		return flag;
	}
	
	public void enQueue(Customer ele)
	{
		if(isFull())
		{
			throw new QueueException("----------QUEUE is full------------");
		}
		else {
			if(front==-1)
				front=0;
			rear=(rear+1)%size;
			arr[rear]=ele;
			System.out.println("Rear = "+rear);
			System.out.println("Front = "+front);
		}
	}
	
	public Customer deQueue() {
		Customer ele=null;
		if(isEmpty())
		{
			throw new QueueException("-----------Queue is Empty---------------");
		}
		else {
			ele=arr[front];
			if(front==rear)
				front=rear=-1;
			else
			front=(front+1)%size;
			
		}
		System.out.println("Rear = "+rear);
		System.out.println("Front = "+front);
		return ele;
	}
	
	
	
	public void display()
	{
		if(isEmpty())
		{
			throw new QueueException("-------------Queue is Empty---------------");
		}
		int i;
		System.out.println("<<<==  ");
		for( i= front; i!=rear ; i=(i+1)%size)
			{
				System.out.println(arr[i]+"  ");
			}
		if(i==rear)
			System.out.println(arr[i]);
		System.out.println("  <<<==");
	}
}
