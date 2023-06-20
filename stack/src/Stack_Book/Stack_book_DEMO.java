package Stack_Book;

import java.util.Scanner;

public class Stack_book_DEMO {

	public static void main(String[] args) {
		Stack_book s=new Stack_book(5);
		Scanner sc=new Scanner(System.in);
		
		int choice;
		do
		{
			System.out.println("1 : push");
			System.out.println("2 : pop");
			System.out.println("3 : Display");
			System.out.println("0 : Exit");
			choice=sc.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.println("Enter BookId, Book Name and Book Price : ");
				int bookId=sc.nextInt();
				String name=sc.next();
				int price=sc.nextInt();
				Book b=new Book(bookId,name,price);
				s.push(b);
				break;
			case 2:
				Book b1=s.pop();
				if(b1!=null)
				System.out.println("Deleted Element is : "+b1);
				break;
			case 3:
				s.display();
				break;
			case 4:
				break;
			}
		}while(choice!=0);
		sc.close();
	}

}
