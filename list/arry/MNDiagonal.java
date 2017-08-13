package matrix;
import java.io.IOException;
public class MNDiagonal {
	static int dia(int[][] mat,int r,int c){
		int sum=0;
		while(true){if(r==-1||c==-1) return sum;
			sum+=mat[r][c];
			c--;r--;}	
	}
	public static void main(String[] args) throws IOException {
		int[][] mat=Matrix.input();
		int r=mat.length-1,c=0;
		int che=dia(mat,r,c);
		int flag=0;
		while(r>=0){int var=dia(mat,r,c);
			System.out.println(var);
			if(var!=che) flag++;
			if(c<mat[0].length-1){
				c++;}
			else{r--;}
		}
		if(flag>0) System.out.println("False");
		else System.out.println("True");
	}
}