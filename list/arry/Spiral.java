package matrix;
import java.io.*;
public class Spiral {
public static void printSpiral(int[][] mat,int r,int c){
		 int sr=0,er=r-1,sc=0,ec=c-1;
		 while(!(sr==er)||!(sc==ec)){
			 //printing first row
			 for(int i=sc;i<=ec;i++){
				 System.out.print(" " +mat[sr][i]);
			 }
			 sr++;
			 
			 //printing column from last
			 for(int i=sr;i<=er;i++){
				 System.out.print(" "+mat[i][ec]);
			 }
			 ec--;
		
			 //printing row from last
			 for(int i=ec;i>=sc;i--){
				 System.out.print(" "+mat[er][i]);
			 }
			 er--;
			 //printing column from first
			 for(int i=er;i>=sr;i--){
				 System.out.print(" "+mat[i][sc]);
			 }
			 sc++;
			// System.out.println("iiii  "+sr+"  "+ec+" "+er+" "+sc);
		 }
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("matrix.txt"));
		int r=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		int[][] mat=new int[r][c];
		for(int i=0;i<r;i++){
			String s=br.readLine();
			String[] sp=s.split("\\s");
			for(int j=0;j<c;j++){
				mat[i][j]=Integer.parseInt(sp[j]);
			}
		}

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		printSpiral(mat,r,c);
	}

}
