package linked_list6_at_sorted_pos;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1 : add Ele");
			System.out.println("2 : ");
			System.out.println("3 : Display");
			System.out.print("Enter Your choice : ");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter Element To Add : ");
					int data=sc.nextInt();
					l.addEle(data);
					break;
				case 2:
					break;
				case 3:
					l.display();
					break;
				case 4:
					break;
			}
			
		} while (choice!=0);
		sc.close();
	}

}
