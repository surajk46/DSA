package practice;

import java.util.Scanner;

class Node {
	int data;
	Node left,right;
	public Node(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}
	@Override
	public String toString() {
		return "Node [data = " + data + "]";
	}
	
}

class BinarySearchTree
{
	Node root;
	
	public BinarySearchTree()
	{
		this.root=null;
	}
	
	public void addNode(int data) {
		Node record=new Node(data);
		if(root==null)
			{
				root=record;
				return;
			}
		else {
			Node move=root;
			while(true)
			{
				if(record.data<move.data)
				{
					if(move.left==null)
					{
						move.left=record;
						break;
					}
					else {
						move=move.left;
					}
				}
				else if(record.data>move.data)
				{
					if(move.right==null)
					{
						move.right=record;
						break;
					}
					else {
						move=move.right;
					}
				}
				else
				{
					System.out.println(record.data+" Duplicate data Not Allow");
					break;
				}
			}
		}
	}
	public void inOrder(Node move)
	{
		if(move!=null)
		{
			inOrder(move.left);
			System.out.println(move.data);
			inOrder(move.right);
		}
	}
	public int smallest()
	{
		Node move=root;
		while(true)
		{
			if(move.left==null)
				return move.data;
			else {
				move=move.left;
			}
		}
	}
	
}


public class Demo {
	public static void main(String[] args) {
		BinarySearchTree b=new BinarySearchTree();
		Scanner scanner=new Scanner(System.in);
		int arr[]= {100,125,150,175,25,60,90,10,15};
		for(int i=0;i<arr.length;i++)
		{
		//	System.out.print(" "+arr[i]);
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
					//System.out.println("Largest Element in tree "+b.greatest());
					
					break;
				case 5:
//					System.out.println("Enter Element to search : ");
//					data =scanner.nextInt();
//					if(b.search(data))
//						System.out.println("Element is Found");
//					else
//						System.out.println("Element is Not Found");	
//					break;
				case 6:
					System.out.println("Enter Data to Delete : ");
					int k=scanner.nextInt();
					//b.delNode(k);
				//	b.inOrder(b.root);
					break;
					
			}
		}while(choice!=0);
		scanner.close();
	}
}
