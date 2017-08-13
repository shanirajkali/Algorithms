package matrix;

public class Ractangles {
	
	static void print(int mS,int nS,int mE,int nE,int[][] mat,int[] out){
		int[] arr=new int[10];
		
		for(int i=mS;i<=mE;i++){
			for(int j=nS;j<=nE;j++){
				System.out.print(mat[i][j]+" ");
				arr[mat[i][j]]++;
			}
			System.out.println();
		}
		System.out.println();
		int var=(((mE+1)-mS)*((nE+1)-nS)),flag=0;
		if(var%2==0){
			for(int i=0;i<10;i++){
				if(arr[i]%2!=0){
					flag=0;
					break;}
				flag=1;
			}
			
		}
		else if(var%2!=0){
			int freq=0;
			for(int i=0;i<10;i++){
				if(arr[i]%2!=0){
					freq++;
					if(freq>1){
						flag=0;
						break;}
				}
				flag=1;
			}
			
		}
		
		if(flag==1&&var>out[0]){
			out[0]=var;
			out[1]=mS;
			out[2]=nS;
			out[3]=mE;
			out[4]=nE;
		}
	}
	
	static void ract(int m,int n,int[][] mat,int row,int col,int[] out){
		int i=m,j=n;
		while(i<row){
			for(j=n;j<col;j++){
				print(m,n,i,j,mat,out);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		int[][] mat={{1,2,0,3,2},{0,1,2,3,4},{0,9,8,9,0}};
		int row=3,col=5;
		int[] out=new int[5];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				ract(i,j,mat,row,col,out);
			}
		}
		System.out.println(out[0]);
		for(int i=1;i<5;i++){
			System.out.print(out[i]+" ");
		}
	}
}