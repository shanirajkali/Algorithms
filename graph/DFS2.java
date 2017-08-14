package coding;
import java.util.Scanner;
public class DFS2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int node=sc.nextInt();
		int[][] adjMat=new int[node][node];
		for(int i=0;i<node;i++){
			for(int j=0;j<node;j++){
				adjMat[i][j]=0;
			}
		}
		System.out.print("enter edge which are connected ");
		int edge=sc.nextInt();
		int i=0;
		while(i<edge){
			System.out.println("enter connection: ");
			int l=sc.nextInt();
			int m=sc.nextInt();
			adjMat[l][m]=1;
			adjMat[m][l]=1;
		}
		for(i=0;i<node;i++){
			for(int j=0;j<node;j++){
				System.out.println(adjMat[i][j]);
			}
		}

	}

}
