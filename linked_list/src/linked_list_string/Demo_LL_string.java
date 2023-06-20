package linked_list_string;

import java.util.Scanner;

public class Demo_LL_string {

	public static void main(String[] args) {
		LinkedListString l=new LinkedListString();
		Scanner scanner=new Scanner(System.in);
		String b=null;
		int choice=0;
		do {
			System.out.println("1 : add String at beginning ");
			System.out.println("2 : add String at End ");
			System.out.println("3 : Display");
			System.out.println("4 : add String at pos ");
			System.out.println("5 : Delete Begining");
			System.out.println("6 : Delete End");
			System.out.println("7 : Print first node");
			System.out.println("8 : Print last node");
			System.out.println("9 : Print N th element");
			System.out.println("10 : Modify any element ");
			System.out.println("11 : Search Element ");
			System.out.println("12 : Delete by Element at Mid ");
			System.out.println("13 : Print reverce Liked list ");
			System.out.print("Enter your choice : ");
			choice=scanner.nextInt();
			
			switch (choice)
			{
				case 1:
					System.out.print("Enter String : ");
					b=scanner.next();
					l.addBeg(b);
					break;
				case 2:
					System.out.print("Enter String : ");
					b=scanner.next();
					l.addEnd(b);
					break;
				case 3:
					l.display();
					break;
				case 4:
					System.out.print("Enter position of new element : ");
					int pos=scanner.nextInt();
					System.out.print("Enter new element : ");
					b=scanner.next();
					l.addNodeMid(pos, b);
					break;
				case 5:
					System.out.println("Deleted Element is : " + l.deleteBeg());
					break;
				case 6:
					System.out.println("Deleted Element is : " + l.deleteEnd());
					break;
				case 7:
					System.out.println("First Element is : " + l.printFirstNode());
					break;
				case 8:
					System.out.println("Last Element is : " + l.printLastNode());
					break;
				case 9:
					System.out.print("Enter N : ");
					int n=scanner.nextInt();
					System.out.println("N th Element is : " + l.printNthNode(n));
					break;
				case 10:
					System.out.print("Enter index which element you want to modify : ");
					int index=scanner.nextInt();
					System.out.print("Enter new data : ");
					b=scanner.next();
					l.modify(index,b);
					break;
				case 11:
					System.out.print("Enter String Which you Want to Search  : ");
					b=scanner.next();
					l.search(b);
					break;
				case 12:
					l.display();
					System.out.println("Enter elemnet from linked list to delete : ");
					b=scanner.next();
					l.deleteMid(b);
					break;
				case 13:
					System.out.println("------------Linked list in reverce order-------------");
					l.printReverce(l.getHead());
					break;
				case 14:
					System.out.println("----------Making Reverce----------");
					l.reverce();
					System.out.println("----------Reverce list is----------");
					l.display();
					break;
				default:
					break;
			}
		} while (choice!=0);
		scanner.close();
	}

}
