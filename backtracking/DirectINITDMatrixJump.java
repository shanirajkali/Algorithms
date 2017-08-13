package matrix;
import java.io.*;
public class DirectINITDMatrixJump {
	static int row=2,col=3;
	DirectINITDMatrixJump() throws IOException{
	}
	public static int fun(int r,int c,int[][] mat){
		int down=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
		if(r < row && (r+mat[r][c]) < row && r+mat[r][c] != r){
			down=fun(r+mat[r][c],c,mat);
		}
		if(r<col&&(c+mat[r][c])<col&&c+mat[r][c]!=c){
			right=fun(r,c+mat[r][c],mat);
		}
		if(r==row-1&&c==col-1){
			return 0;
		}
		if(down==Integer.MAX_VALUE&&right==Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		return 1+Math.min(right, down);
	}
	public static void main(String[] args) throws IOException  {
		DirectINITDMatrixJump ob=new DirectINITDMatrixJump();
		BufferedReader br=new BufferedReader(new FileReader("matrix.txt"));
		row=Integer.parseInt(br.readLine());
		col=Integer.parseInt(br.readLine());
		int[][] mat=new int[row][col];
		for(int i=0;i<row;i++){
			String s=br.readLine();
			String[] sp=s.split("\\s");
			for(int j=0;j<col;j++){
				mat[i][j]=Integer.parseInt(sp[j]);
			}
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(" "+mat[i][j]);
			}
			System.out.println();
		}
		
		int r=0,c=0;
		int ans=fun(0,0,mat);
		if(ans<Integer.MAX_VALUE)
		System.out.println(ans);
		else
			System.out.println(0);
		
	}

}
