package practice;


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


class Graph
{
	int vertex,g[][],visited[];
	
	public Graph(int vertex)
	{
		this.vertex=vertex;
		g=new int [vertex][vertex];
		visited=new int [vertex];
	}
	
	public void addEdge(int start,int end) {
		g[start][end]=1;
		g[end][start]=1;
	}
	public void DFS(int start)
	{
		visited[start]=1;
		System.out.println(" " + start);
		for(int i=0;i<vertex;i++)
		{
			if(g[start][i]==1 && visited[i]!=1)
			{
				DFS(i);
			}
			
		}
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


public class Demo {
	public static void main(String[] args) {
		Graph g=new Graph(6);
		g.addEdge(0,1);
		g.addEdge(0,3);
		g.addEdge(1,3);
		g.addEdge(2,1);
		g.addEdge(2,4);
		g.addEdge(3,4);
		g.addEdge(3,5);
		g.addEdge(4,5);
		
		//g.acceptGraph();
		g.display();
		System.out.println(" --------- DFS -----------");
		g.DFS(0);
		System.out.println();
		System.out.println(" --------- List -----------");
		//g.display2();
	}
}
