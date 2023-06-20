package circular_link_list1;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
//		l.createLinkedList(7);
//		l.display();
		
		Scanner scanner=new Scanner(System.in);
		int choice=0,data=0,pos=0;
		l.createLinkedList(7);
		l.display();
		
		do {
			System.out.println("1 : add ele ");
			System.out.println("2 : del ele ");
			System.out.println("3 : Display");
			System.out.println("4 : split ");
			System.out.println("5 : Modify ");
			System.out.print("Enter your choice : ");
			choice=scanner.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter int Position : ");
					pos=scanner.nextInt();
					System.out.print("Enter int Element : ");
					data=scanner.nextInt();
					l.addElem(pos,data);
					break;
				case 2:
					System.out.print("Enter data to delete : ");
					data=scanner.nextInt();
					System.out.println("Deleted Element is : "+l.delEle(data));
					break;
				case 3:
					l.display();
					break;
				case 4:
					l.split();
					break;
				case 5:
					System.out.print("Enter which data you want to modify : ");
					data=scanner.nextInt();
					System.out.print("Enter which data you want to modify : ");
					int newData=scanner.nextInt();
					l.modify(data, newData);
					break;
				case 6:
					
					break;
			}
		}while(choice!=0);
		
		scanner.close();
	}
}
