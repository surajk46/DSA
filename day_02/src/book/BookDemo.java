package book;

import java.util.Scanner;

public class BookDemo {
	static int count=0 ;
	static Book b[]=new Book[25];
	
	public static void addBook()
	{
		int bookId,price;
		String name;
		System.out.println("Enter BookId , Book Name and Book Price :");
		Scanner scanner=new Scanner(System.in);
		bookId=scanner.nextInt();
		name=scanner.next();
		price=scanner.nextInt();
		//count++;
		b[count]=new Book(bookId,name,price);
		count++;
	}
	public static void display() 
	{
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=null)
			System.out.println(b[i]);
		}
	}
	
	public static void search(String key) {
		for(int i=0;i<b.length ;i++)
		{
			if(b[i]!=null)
			if(key.equalsIgnoreCase(b[i].getName()))
			{
				System.out.println("yours book Found!!!!");
				System.out.println(b[i]);
			}
		}
	}
	
	public static void modifyName(int bookId) {
		System.out.print("Enter New Name of Book : ");
		Scanner sc=new Scanner(System.in);
		String newName=sc.next();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=null)
				if(bookId==b[i].getId())
				{
					b[i].setName(newName);
				}	
			System.out.println(b[i]);
		}
	}
	public static void modifyPrice(int bookId) {
		System.out.print("Enter New Price of Book : ");
		Scanner sc=new Scanner(System.in);
		int newPrice=sc.nextInt();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=null)
				{
					if(bookId==b[i].getId())
					{
						b[i].setPrice(newPrice);
					}	
					System.out.println(b[i]);
				}
		}
	}
	public static void main(String[] args) {
		int shivam;
		do{
			System.out.println("1 Add book");
			System.out.println("2 Display book");
			System.out.println("3 Modify book");
			System.out.println("4 Search book");
			System.out.println("5 Count book");
			System.out.println("0 Exit book");
			
			Scanner scanner=new Scanner(System.in);
			shivam = scanner.nextInt();
			switch(shivam)
			{
			case 1 :
				addBook();
				break;
			case 2 :
				display();
				break;
			case 3 :
				System.out.print("Enter Book ID of book which you want to modify : ");
				int id=scanner.nextInt();
				System.out.print("0 for Book name Modify       1 for Book price modify : ");
				int c=scanner.nextInt();
				if(c==0)
					modifyName(id);
				else 
					modifyPrice(id);
				break;
			case 4 :
				System.out.println("Enter a name of book to search in Array ");
				String name=scanner.next();
				search(name);
				break;
			case 5 :
				System.out.println("Number of books in arrays = "+count);
				break;
			};
			
		} while(shivam!=0);
		
		
		
		
		
		
		/*Book b[]=new Book[5];
		int bookId,price;
		String name;
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter BookId , Book Name and Book Price :");
			Scanner scanner=new Scanner(System.in);
			bookId=scanner.nextInt();
			name=scanner.next();
			price=scanner.nextInt();
		}*/
	}
}
