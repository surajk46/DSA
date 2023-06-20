package circular_queue_int;


public class Circular_queue_int {
	int size,rear,front;
	int arr[];
	public Circular_queue_int(int size) {
		super();
		this.size = size;
		this.rear = -1;
		this.front = -1;
		arr=new int[size];
	}
	public boolean isEmpty() {
		boolean flag=false;
		if(front==rear && front!=0)
			flag=true;
		return flag;
	}
	public boolean isFull() {
		boolean flag=false;
		if(front==(rear+1)%size)
			flag=true;
		return flag;
	}
	public void enQueue(int ele) {
		if(isFull())
			{
				throw new QueueException("---------------Queue is Full-------------");
			}
		else {
			if(front==-1)
				front=0;
			rear=(rear+1)%size;
			arr[rear]=ele;
			
			System.out.println("front= "+front);
			System.out.println("rear= "+rear);
		}
	}
	public int deQueue() {
		int ele=0;
		if(isEmpty())
			throw new QueueException("---------------Queue is Empty-------------");
		else {
			ele=arr[front];
			if(front==rear)
				front=rear=-1;
			else 
				front=(front+1)%size;
		}
		System.out.println("front= "+front);
		System.out.println("rear= "+rear);
		return ele;
	}
	public void display() {
		int i=0;
		System.out.println("<<<==  ");
		for(i=front;i!=rear;i=(i+1)%size)
			System.out.print(arr[i]+"  ");
		if(i==rear)
			System.out.print(arr[i]+"  <<<==");
	}
}
