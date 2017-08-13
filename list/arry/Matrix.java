package matrix;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Matrix {
	static public int[][] input() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("src/matrix/matrix.txt"));
		String[] size=br.readLine().split("\\s");
		int[][] mat=new int[Integer.parseInt(size[0])][Integer.parseInt(size[1])];
		for(int i=0;i<mat.length;i++){
			String[] row=br.readLine().split("\\s");
			for(int j=0;j<mat[0].length;j++){
				mat[i][j]=Integer.parseInt(row[j]);
			}
		}
		br.close();
		return mat;
	}
	
	public static void print(int[][] mat){
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
