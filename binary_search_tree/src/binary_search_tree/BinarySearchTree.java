package binary_search_tree;

public class BinarySearchTree {
	Node root;

	public BinarySearchTree() {
		super();
		this.root = null;
	}
	
	public void addNode(int data) 
	{
		Node record=new Node(data);
		
		if(root==null)
			{
				root=record;
				return;
			}
		Node move=root;
		while(true)
		{
			if(move.data>record.data)
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
			else if(move.data<record.data)
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
			else {
				System.out.println("Duplicate data ");
				break;
			}
		}
	}
	
	public boolean search(int data)
	{
		boolean flag=false;
		Node move=root;
		while(move!=null )
		{
			
				if(move.data==data)
				{
					flag=true;
					break;
				}
				if(move.data>data)
					move=move.left;
				else
					move=move.right;

		}
		return flag;
		
	}
	public void inOrder(Node move)
	{
		if(move!=null)
		{
			inOrder(move.left);   
			System.out.print(" "+move.data);
			inOrder(move.right);
		}
	}
	
	public int greatest() {
		Node move=root;
		while(true)
		{
			if(move.right==null)
				break;
			else {
				move=move.right;
			}
		}
		return move.data;
	}
	public int smallest()
	{
		Node move=root;
		while(true)
		{
			if(move.left==null)
				break;
			else {
				move=move.left;
			}
		}
		return move.data;
	}
	
	public void delNode(int data) {
		Node temp=null,tag=null;
		temp=root;
		while(temp!=null && temp.data!=data)
		{
			tag=temp;
			if (data<temp.data)
				temp=temp.left;
			else {
				temp=temp.right;
			}
		}
		if(temp.right==null && temp.left==null)
		{
			if(tag.data>temp.data)
				tag.left=null;
			else {
				tag.right=null;
			}
		}
		
		if(temp.right!=null)
		{
			if(temp.left!=null)
			{
				Node tr=temp.right;
				while(tr.left!=null)
				{
					tr=tr.left;
				}
				tr.left=temp.left;
			}
			else {
				if(tag.data>temp.data)
					tag.left=temp.left;
				else 
					tag.right=temp.right;
			}
			
			
			
			if(tag.data>temp.data)
				tag.left=temp.right;
			else {
				tag.right=temp.right;
			}
		}
		
	}
}
