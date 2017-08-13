package graph;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
public class HamiltonianCircuit_Cycle {
	 static boolean ham(int[][] g,int[] p,int s){
	      //  System.out.println("ham");
	        for(int i=1;i<p.length;i++){
	            if(g[s][i]==1&&p[i]!=1){
	                p[i]=1;
	                if(ham(g,p,i)){
	                	System.out.println(s);
	                    return true;
	                }
	                else{
	                    p[i]=0;
	                }
	               
	            }
	        }
	        for(int i=1;i<p.length;i++){
	            if(p[i]!=1){
	                return false;
	            }
	        }
	        return true;
	     }
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("gfg.txt"));
					
                    int v=Integer.parseInt(br.readLine());
                    int[][] g=new int[v+1][v+1];
                    int[] p=new int[v+1];
                    int e=Integer.parseInt(br.readLine());
                    while(e>0){e--;
                        int u=Integer.parseInt(br.readLine()),w=Integer.parseInt(br.readLine());
                        g[u][w]=1;
                        g[w][u]=1;
                    }
                   
                    for(int i=1;i<11;i++){
                    	System.out.print("  "+i);
                    }
                    System.out.println();
                    for(int i=1;i<p.length;i++){
                    	System.out.print(i);
                    	for(int j=1;j<p.length;j++){
                    		System.out.print("  "+g[i][j]);
                    	}
                    	System.out.println();
                    }
                    for(int i=1;i<p.length;i++){
                    	p[i]=1;
                    if(ham(g,p,i)){
                        System.out.println("1");
                                     break; }
                    else{
                        System.out.println("0");
                        p[i]=0;
                    }
                    }
                    br.close();
	}
}