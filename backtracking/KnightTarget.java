package backtracking;

import java.util.Arrays;

import matrix.Matrix;

 public class KnightTarget {
	static int[][] board=new int[6][6] ;
	
static	int[][] moves={};
	public static boolean isPos(int[] move,int r,int c){
		if(move[0]+r<board.length && move[1]+c<board[0].length){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(1%2);
	//	Matrix.print(moves);
	}

}
