package graph;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class WeekOfCode33 {
	
	static boolean chotaRasta(int[][] g,int v,int s,int d,int[] visit,int[] path,int p){
		System.out.println("in " +s);
		if(s==d){
			path[p]=d;
			return true;
		}
		if(visit[s]==0){
			System.out.println("s="+s);
			visit[s]=1;
			p++;
			for(int i=1;i<v;i++){
				System.out.println("i="+i);
				if(g[s][i]==1){
					if(chotaRasta(g,v,i,d,visit,path,p)){
						path[p]=i;
						return true;
					}
					
				}
			}
			return false;
			
		}
		else if(s==d){
			p++;
			path[p]=s;
			return true;
		}
		else
		return false;
	}

	public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new FileReader("graph.txt"));
			String s1=br.readLine();
			String[] s1Arr=s1.split("\\s");
			int n=Integer.parseInt(s1Arr[0])+1;
			int q=Integer.parseInt(s1Arr[1]);
			int[][] g=new int[n][n];
			String nod=br.readLine();
			String patt=br.readLine();
			for(int i=1;i<n-1;i++){
				String ed=br.readLine();
				String[] edge=ed.split("\\s");
				int u=Integer.parseInt(edge[0]);
				int v=Integer.parseInt(edge[1]);
				System.out.println(u+ " "+v);
				g[u][v]=1;
				g[v][u]=1;
			}
			for(int i=1;i<n;i++){
				for(int j=1;j<n;j++){
					System.out.print(g[i][j]+" ");
				}
				System.out.println();
			}
			
			
			for(int i=0;i<q;i++){
				int[] path=new int[n];
				int[] visit=new int[n];
				String qu=br.readLine();
				System.out.println(qu);
				String[] query=qu.split("\\s");
				int s=Integer.parseInt(query[0]);
				int d=Integer.parseInt(query[1]);
				chotaRasta(g,n,s,d,visit,path,0);
				String p="";
				path[0]=s;
				for(int j=0;path[j]!=0;j++){
					System.out.print(" "+path[j]);
					p=p+nod.charAt(path[j]-1);
					
				}
				
				char[] gen=p.toCharArray();
				char[] pattern=patt.toCharArray();
				System.out.println(p);
				int count=0;
				for(int j=0;j<=gen.length-pattern.length;j++){
					int flag=1;
					for(int k=0;k<pattern.length;k++){
						if(gen[k+j]!=pattern[k]){
							flag=0;
						}	
					}
					if(flag==1)
						count++;
				}
				System.out.println(count);
			}
			
			
	}

}
