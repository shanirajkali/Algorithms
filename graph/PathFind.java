package graph;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PathFind {
static	public boolean path(int[][] g,int s,int e){
		for(int i=0;i<5;i++){
			if(g[s][i]==1){
				System.out.println(i);
				if(path(g,i,e))
					return true;
				if(i==e)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("./graph.txt");
		BufferedReader br=new BufferedReader(fr);
		int n=Integer.parseInt(br.readLine()),m=Integer.parseInt(br.readLine())+1;
		int[][] edge=new int[m][2];
		for(int i=0;i<m-1;i++){
			String[] s=br.readLine().split("\\s");
			System.out.println(s[0]+" "+s[1]);
				edge[i][0]=Integer.parseInt(s[0]);edge[i][1]=Integer.parseInt(s[1]);
				
	}
		
		int q=Integer.parseInt(br.readLine());
		int j=0;
		while(j<5){
			String[] s=br.readLine().split("\\s");
			int cond=Integer.parseInt(s[0]);
			if(cond==1)
			{
				m++;
				int[][] g=new int[m][m];
				for(int i=0;i<m-1;i++){
					g[edge[i][0]][edge[i][1]]=1;
				}
				int inOut=Integer.parseInt(s[2]);
				System.out.println("ss");
				if(inOut==0){
					g[Integer.parseInt(s[1])][m-1]=1;
				}
				else
					g[m][Integer.parseInt(s[1])]=1;
			for(int o=0;o<m;o++){
				for(int p=0;p<m;p++){
					System.out.print(" "+g[o][p]);
				}
				System.out.println();
			}
			}
			j++;
		}

		}
		}
	
