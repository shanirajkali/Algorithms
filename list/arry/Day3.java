package matrix;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class Day3 {

	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("./input.txt");
		BufferedReader br=new BufferedReader(fr);
		int n=Integer.parseInt(br.readLine());
		int s=Integer.parseInt(br.readLine());
		int t=Integer.parseInt(br.readLine());
		int[][] r=new int[n][2];
		r[0][0]=Integer.parseInt(br.readLine());
		int g=Integer.parseInt(br.readLine());
		int seed=Integer.parseInt(br.readLine());
		int p=Integer.parseInt(br.readLine());
		for(int i=1;i<n;i++){
			r[i][0]=(r[i-1][0]*g+seed)%p;
		}
		int[][] graph=new int[n][n];
		for(int i=0;i<n;i++){
			int inc=-1;
			for(int j=0;j<n;j++){
				int dist;
				if(j>n/2){
					inc=inc+2;
					dist=Math.abs((i+inc)-j);
					}
				else{
					dist=Math.abs(i-j);
				}
					
					if(r[i][0]>=dist)
						graph[i][j]=1;
					
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(r[i][0]);
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(" "+graph[i][j]);
			}
			System.out.println();
		}
		
	}

}
