package backtracking;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;
class KnightTour{
	static int ro=0,co=0,ro1=0,co1=0;
	public static int ways(int[][] mat,int row,int col){
		int d=0,r=0;
		if(row+ro<mat.length&&col+co<mat[0].length&&(ro!=0||co!=0)){
			//System.out.println("hmm");
			if(mat[row+ro][col+co]==0){
			d=ways(mat,row+ro,col+co);}
			
		}
		if(row+ro1<mat.length&&col+co1<mat[0].length&&(ro1!=0||co1!=0)){
			//System.out.println("haahh");
			if(mat[row+ro1][col+co1]==0){
			r=ways(mat,row+ro1,col+co1);}
			
		}
		//System.out.println("kjsl");
		if(row==mat.length-1&&col==mat[0].length-1){
			return 1;
		}
		return (d+r);
	}
	public static void main(String[] args) throws AWTException {
		Scanner br=new Scanner(System.in);
		int t=br.nextInt();
		br.nextLine();
		Robot r = new Robot();
		while(t>0){t--;
		 if(t==0){

				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
		    }
		String[] size=br.nextLine().split("\\s");
		int[][] mat=new int[Integer.parseInt(size[0])+1][Integer.parseInt(size[1])+1];
		int i=Integer.parseInt(size[2]);
	    String[]	move=br.nextLine().split("\\s");
	   ro=Integer.parseInt(move[0]);
	    co=Integer.parseInt(move[1]);
	    ro1=Integer.parseInt(move[2]);
	    co1=Integer.parseInt(move[3]);
	    if(i>0){
	    	//System.out.println("fsdf");
		String[] block=br.nextLine().split("\\s");
		int a=0,b=1;
		while(i>0){i--;
		
			mat[Integer.parseInt(block[a])][Integer.parseInt(block[b])]=1;
			a+=2;b+=2;
		}
	    }
	   
		System.out.print(ways(mat,0,0)+"\n");

		
		
		/*int[][] mat=new int[in.nextInt()+1][in.nextInt()+1];
		int i=in.nextInt();
	    	ro=in.nextInt();
	   	co=in.nextInt();
	    	ro1=in.nextInt();
	    	co1=in.nextInt();
		while(i>0){i--;
			mat[in.nextInt()][in.nextInt()]=1;
		}
		System.out.println(ways(mat,0,0));*/
		}
	}
}