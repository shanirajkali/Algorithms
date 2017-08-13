package matrix;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Day5 {

	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("./input.txt");
		BufferedReader br=new BufferedReader(fr);
		int n=Integer.parseInt(br.readLine());
		int[] a=new int[n];
		int m=Integer.parseInt(br.readLine());
		int[] c=new int[m];
		int i=0,j=0,k=0,l=0;
		for(i=0;i<n;i++){
			a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<m;i++){
			c[i]=Integer.parseInt(br.readLine());
		}
		int[][] b=new int[n][m];
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				b[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		
		int result=0,candyEarns=0,secondryResult=0;
		int[] candy=new int[m];
		for(i=0;i<n;i++){
			for(l=0;l<a[i];l++){
				int ti=0,tj=0;
				for(j=0;j<m;j++){
					int tem=b[i][j];
					if(tem>candyEarns){
						candyEarns=tem;
						ti=i;tj=j;
					}
				}
				System.out.println("Candy earns "+candyEarns);
				result=result+candyEarns;
				b[ti][tj]=0;
				candyEarns=0;
				candy[tj]++;
			}
		}
		k=0;
		for(i=0;i<m;i++){
			int tem=0;
			if(candy[i]>c[i])
				tem=(int)Math.pow(c[i]-candy[i],2);
			k=k+tem;
			
		}
		for(i=0;i<m;i++)
			System.out.println(candy[i]);
		
		System.out.println(result-k+1);
	}

}
