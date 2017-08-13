package matrix;


import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Rotate {

	public static void main(String[] args) throws IOException {
	FileReader f=new FileReader("./input.txt");
	
	BufferedReader fr=new BufferedReader(f);
	int n=Character.getNumericValue((char)fr.read());
	fr.readLine();
	int[][] mat=new int[n][n];
	for(int i=0;i<n;i++){
		String line=fr.readLine();
		String lineArr[]=line.split("\\s");
		for(int j=0;j<n;j++){
			mat[i][j]=Integer.parseInt(lineArr[j]);
		}
	}
	System.out.println("input matrix");
	System.out.println();
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
	int row=n-1,col=n-1;
	for(int i=0,r=0,c=0;i<n/2;i++,c++,r++,row--,col--){
		int temp=mat[row][c];
		mat[row][c]=mat[r][c];
		
		int temp2=mat[row][col];
		mat[row][col]=temp;
		
		temp=mat[r][col];
		mat[r][col]=temp2;
		
		mat[r][c]=temp;
	}
	
	System.out.println("input matrix");
	System.out.println();
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
	//int a=Character.getNumericValue('1');
	fr.close();
	}

}
