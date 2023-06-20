package int10_queue;

public class Int10_demo {
	public static void main(String[] args) {
		Int10_queue q=new Int10_queue(10);
		for(int i=1;i<=10;i++)
		{
			q.enQueue(i);
		}
		System.out.println("Queue");
		q.display();
	}
}
