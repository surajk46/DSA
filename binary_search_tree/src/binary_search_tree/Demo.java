package binary_search_tree;

import java.util.Random;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Random random=new Random();
		Scanner scanner=new Scanner(System.in);
		BinarySearchTree b=new BinarySearchTree();
		int arr[]= {100,125,150,175,25,60,90,10,15};
		for(int i=0;i<arr.length;i++)
		{
//			int k=i*random.nextInt(10);
			System.out.print(" "+arr[i]);
			b.addNode(arr[i]);
		}
		int data=0;
		int choice=0;
		do {
			System.out.println("1 : add ele ");
			System.out.println("2 : Display ");
			System.out.println("3 : smallest");
			System.out.println("4 : Largest");
			System.out.println("3 : search");
			System.out.println("4 : Delete");
			System.out.print("Enter your choice : ");
			choice=scanner.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter int Element : ");
					data=scanner.nextInt();
					b.addNode(data);
					break;
				case 2:
					System.out.println();
					b.inOrder(b.root);
					System.out.println();
					
					break;
				case 3:
					System.out.println("Smallest Element in tree  : "+b.smallest());
					break;
				case 4:
					System.out.println("Largest Element in tree "+b.greatest());
					
					break;
				case 5:
					System.out.println("Enter Element to search : ");
					data =scanner.nextInt();
					if(b.search(data))
						System.out.println("Element is Found");
					else
						System.out.println("Element is Not Found");	
					break;
				case 6:
					System.out.println("Enter Data to Delete : ");
					int k=scanner.nextInt();
					b.delNode(k);
					b.inOrder(b.root);
					break;
					
			}
		}while(choice!=0);
		scanner.close();
	}

}
