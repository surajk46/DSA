package lecture;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		DoublyLinkedList list1=new DoublyLinkedList();
		
		list1.createLinkedLsit(7);
		list1.display();
		// Split linked with two linked list
		// one for data with even numbers
		// second for data with odd numbers
		//list1.split();
		int no,ch,pos;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println(" 1. Insert");
			System.out.println(" 2. Display");
			System.out.println(" 3. Print Reverse");
			System.out.println(" ");
			System.out.println(" Enter your Choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Data  and Position ");
				no=sc.nextInt();
				pos=sc.nextInt();
				list1.insert(pos,no);
				break;
			case 2:
				list1.display();
				break;
			case 3:
				list1.printReverse();
			}
		
			
		}while(ch!=0);
		
		
	}
}
