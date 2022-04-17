package upgrad.com;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphListRepresentation {
private LinkedList<Integer>[] adj;
private int V;
private int E;

public GraphListRepresentation(int nodes) {
	this.V=nodes;
	this.E=0;
	this.adj=new LinkedList[nodes];
	for(int v=0;v<V;v++) {
		adj[v]=new LinkedList<>();
	}
}
public void addEdge(int u,int v) {
	adj[u].add(v);
	adj[v].add(u);
	E++;
}
public String toString() {
	StringBuilder sb=new StringBuilder();
	sb.append(V + " vertices," + E+ " edges " + "\n");
	for(int v=0; v<V;v++) {
		sb.append(v + " : ");
	for(int w: adj[v]) {
		sb.append(w + " ");
		
	}
	sb.append("\n");
}return sb.toString();
}

public void bfs(int s) {
	boolean [] visited=new  boolean[V];
	
	Queue<Integer> q=new LinkedList<>();
	visited[s]=true;
	q.offer(s);
	while(!q.isEmpty()) {
		int u=q.poll();
		System.out.print(u + " ");
		
		for(int v:adj[u]) {
			if(!visited[v]) {
				visited[v]=true;
				q.offer(v);
			}
		}
		
	}
}

public void dfs(int s) {
	boolean [] visited=new boolean[V];
	Stack<Integer> stack =new Stack<>();
	stack.push(s);
	
	while(!stack.isEmpty()) {
		int u=stack.pop();
		if(!visited[u]) {
			visited[u]=true;
			System.out.print(u + " ");
			
			for(int v:adj[u]) {
				if(!visited[v]) {
					stack.push(v);
				}
			}
		}
	}
}
public void dfsRecursive() {
	boolean[] visited=new boolean[V];
	for(int v=0;v<V;v++) {
		if(!visited[v]) {
			dfsRecursive(v,visited);
		}
	}
}
private void dfsRecursive(int v,boolean[] visited ) {
	visited[v]=true;
	System.out.print(v+" ");
	for(int w:adj[v]) {
		if(!visited[w]) {
			dfsRecursive(w,visited);
		}
	}}

public boolean dfsConnectComp(int x,int y) {
	boolean [] visited=new boolean[V];
	int[] compId=new int[V];
	int count=0;
	for(int v=0;v<V;v++) {
		if(!visited[v]) {
			dfsConnectComp(v,visited,compId,count);
			count++;
		}
	
    }return compId[x]==compId[y];
    
	}
private void dfsConnectComp(int v, boolean[] visited, int[] compId, int count) {
	visited[v]=true;
	compId[v]=count;
	for(int w:adj[v]) {
		if(!visited[w]) {
			dfsConnectComp(w,visited,compId,count);
		}
	}
	
	
}

public int dfsNumIslands(char[][] grid) {
	int m=grid.length;
	int n=grid[0].length;
	boolean[][] visited=new boolean[m][n];
	int numofIslands=0;
	for(int i=0;i<m;i++) {
		for(int j=0;j<m;j++) {
			if(!visited[i][j]&&grid[i][j]=='1') {
				dfsIslands(grid,i,j,visited);
				numofIslands++;
			}
		}
	}return numofIslands;
}
private void dfsIslands(char[][] grid, int row, int col, boolean[][] visited) {
	if(row<0||col<0||row>=grid.length||col>=grid[0].length||visited[row][col]||grid[row][col]=='0') {
		return;
	}
	visited[row][col]=true;
	dfsIslands(grid,row,col-1,visited);
	dfsIslands(grid,row-1,col,visited);
	dfsIslands(grid,row,col+1,visited);
	dfsIslands(grid,row+1,col,visited);
}
public static void main(String args[]) {
	GraphListRepresentation g=new GraphListRepresentation(5);
	g.addEdge(0, 1);
	g.addEdge(1, 0);
	g.addEdge(0, 3);
	g.addEdge(3, 0);
	g.addEdge(2, 4);

char grid[][]= {{'1','1','0','0'},{'1','0','0','0'},{'0','0','1','0'},{'0','0','0','1'}};
System.out.println(g.dfsNumIslands(grid));


	
}
}
