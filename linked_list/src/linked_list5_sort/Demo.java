package linked_list5_sort;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
	
	LinkedList l=new LinkedList();
	Scanner scanner=new Scanner(System.in);
	int data=0;
	int choice=0;
	do {
		System.out.println();
		System.out.println("1 : add ele ");
		System.out.println("2 :  ");
		System.out.println("3 : Display");
		System.out.println("4 :  ");
		System.out.print("Enter your choice : ");
		choice=scanner.nextInt();
		switch(choice)
		{
			case 1:
				System.out.print("Enter int Element : ");
				data=scanner.nextInt();
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
	}while(choice!=0);
	scanner.close();
	}
}
