package coding;

import java.util.*;

public class Graph {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int v=sc.nextInt();
		int[][] mat=new int[n][n];
		int[][] rem=new int[v][2];
		int[] freq=new int[n];
		for(int i=0;i<v;i++){
			int a=sc.nextInt();
			freq[a]++;
			int b=sc.nextInt();
			freq[b]++;
			mat[a][b]=2;
		}
		for(int i=0;i<n;i++){
			System.out.println(freq[i]);
		}
		int cout=0;
		
		for(int i=0;i<n;i++){
			if(freq[i]<1)
				continue;
			for(int j=i+1;j<n;j++){
				if(mat[i][j]!=2&&freq[j]>0){
				mat[i][j]=1;
				cout++;
			}
		}
		}
		System.out.println(cout);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}

}
