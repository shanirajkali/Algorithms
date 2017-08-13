package graph;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.io.FileReader;
import java.io.BufferedReader;
public class GraphInput {
	int n,m;
	int[][] g=new int[n+1][n+1];
	static void bfs(int[][] g,int v,int s,int d,int[] path){
		Queue<Integer> q=new LinkedList<>();
		int p=1;
		int[] visited=new int[v];
		path[1]=s;
		int u=s;
		visited[s]=1;
		while(true){
			for(int i=1;i<v;i++){
				if(g[u][i]!=0){
					if(visited[i]==0){
						q.add(i);
						System.out.println(i);
						visited[i]=1;
						p++;
						path[p]=i;
						//System.out.println("vv");
						if(i==d)
							return;
					}
				}
			}
			if(q.size()==0)
				return;
			u=q.remove();
		}
	}
	public GraphInput() throws IOException{
		FileReader fr=new FileReader("./graph.txt");
		BufferedReader br=new BufferedReader(fr);
		n=Integer.parseInt(br.readLine());
		m=Integer.parseInt(br.readLine());
		for(int i=0;i<m;i++){
			String[] s=br.readLine().split("\\s");
			System.out.println(s[0]+" "+s[1]);
				int p=Integer.parseInt(s[0]),q=Integer.parseInt(s[1]);
				System.out.println(n);
				g[p][q]=1;
		}
		
	}
}
