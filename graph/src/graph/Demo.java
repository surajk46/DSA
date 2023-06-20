package graph;


class Node {
	int data;
	Node next;
	
	public Node() {
		super();
		next=null;
	}

	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "  data=" + data ;
	}
}

class LinkedList {
	Node head[];
	public LinkedList(int vertex)
	{
		head=new Node[vertex];
		for(int i=0;i<vertex;i++)
		{
			head[i]=new Node(i);
		}
	 }

	public Node[] getHead()
	{
		return head;
	}

	public void setHead(Node[] head)
	{
		this.head = head;
	}

	public void addNode(int i, int data)
	{
		Node record=new Node(data);
		if(head[i]==null)
			head[i]=record;
		else {
			Node move=head[i];
			while(move.next!=null)
				move=move.next;
			move.next=record;
		}
	}
	public void display()
	{
		for(int i=0;i<head.length;i++)
		{
			 Node move=head[i];
			 while(move!=null)
			 {
				 System.out.print(" "+move.data);
				 move=move.next;
			 }
			 System.out.println();
		}
	}
}

class Graph {
	int vertex,g[][],visited[];
	LinkedList l;
	public Graph (int size){
		super();
		this.vertex = size;
		this.g = new int [size][size];
		this.visited = new int [vertex];
		l=new LinkedList(vertex);;
	}
	
	public void addEdge(int start ,int end) {
		g[start][end]=1;
		g[end][start]=1;
		l.addNode(start, end);
		l.addNode(end,start);
	}
	
	public void DFS(int start) {
		visited[start]=1;
		System.out.print(" "+start);
		for(int i=0;i<vertex;i++)
		{
			if(g[start][i]==1 && visited[i]!=1)
			{
				//l.addNode(start, i);
				DFS(i);
			}
				
		}
	}
	public void display2()
	{
		l.display();
	}
	public void display()
	{
		System.out.println();
		System.out.println("--------- Array ---------");
		for(int i=0;i<vertex;i++)
		{
			System.out.println();
			for(int j=0;j<vertex;j++)
				System.out.print("\t"+g[i][j]);
		}
		System.out.println();
	}
	
}

public class Demo
{
	public static void main(String[] args) {
		Graph g=new Graph(6);
		g.addEdge(0,1);
		g.addEdge(0,4);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(3,5);
		
		//g.acceptGraph();
		g.display();
		System.out.println(" --------- DFS -----------");
		g.DFS(0);
		System.out.println();
		System.out.println(" --------- List -----------");
		g.display2();
	}
}