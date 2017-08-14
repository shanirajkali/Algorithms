package dynamic;
import java.util.*;
import java.io.*;
/*
 * author Shani Raj Kali
 * date 16/06/2017
 */
public class LPSTransformation {
static void insTF(int[][] tf,int x,int y){
	int j=0;
	while(tf[x][j]!=0&&tf[x][j]!=y){
		j++;
	}
	tf[x][j]=y;
}
static void insOTF(int[][] tf,int n){
	for(int i=1;i<=n;i++){
		int j=0;
		while(tf[i][j]!=0){
			int num=tf[i][j];
			int k=0;
			while(tf[num][k]!=0){
				int num2=tf[num][k];
				if(num2!=i){
					insTF(tf,i,num2);
				}
				k++;
			}
			j++;
		}
	}
}
static boolean match(int[][] tf,int l,int r){
	for(int i=0;tf[r][i]!=0;i++){
		if(tf[r][i]==l)
			return true;
	}
	for(int i=0;tf[l][i]!=0;i++){
		if(tf[l][i]==r)
			return true;
	}
	for(int i=0;tf[l][i]!=0;i++){
		for(int j=0;tf[r][j]!=0;j++){
			if(tf[l][i]==tf[r][j])
				return true;
		}
	}

	return false;
}
static int pal(int []str,int[][] tf ){
    int t[][] = new int[str.length][str.length];
    for(int i=0; i < str.length; i++){
        t[i][i] = 1;
    }
    for(int i=0;i<str.length;i++){
    	int k=0,l=i+1;
    	for(;l<str.length;l++,k++){
    		if(str[k]==str[l]){
    			t[k][l]=2+t[k+1][l-1];
    			
    		}
    		
    		else{
    			if(match(tf,str[k],str[l])){
    				t[k][l]=2+t[k+1][l-1];
    			}
    			else{
    			t[k][l]=Math.max(t[k][l-1],t[k+1][l]);
    			}
    			
    		}
    	}
    }
    for(int i=0;i<str.length;i++){
    	System.out.println(str[i]);
    }
    for(int i=0;i<str.length;i++){
    	for(int j=0;j<str.length;j++){
    		System.out.print(t[i][j]+" ");
    	}
    	System.out.println();
    }
    return t[0][str.length-1];
}
	public static void main(String[] args) throws IOException {
		Scanner in=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new FileReader("temp.txt"));
			String str1=br.readLine();
			String[] strArr=str1.split("\\s");
			int n=Integer.parseInt(strArr[0]);
			int[][] tf=new int[n+1][100];
			int k=Integer.parseInt(strArr[1]);
			int l=Integer.parseInt(strArr[2]);
			for(int i=0;i<k;i++){
				String str2=br.readLine();
				String[] str2Arr=str2.split("\\s");
				int x=Integer.parseInt(str2Arr[0]);
				int y=Integer.parseInt(str2Arr[1]);
				insTF(tf,x,y);
				insTF(tf,y,x);
				
			}
			insOTF(tf,n);
			for(int i=0;i<=n;i++){
				System.out.print(i);
				for(int j=0;j<100;j++){
					System.out.print("  "+tf[i][j]);
				}
				System.out.println();
			}
			
			String str=br.readLine();
			String[] strtem=str.split("\\s");
			int[] out=new int[l];
			for(int i=0;i<l;i++){
				out[i]=Integer.parseInt(strtem[i]);
			}
			System.out.println(str);
			System.out.println(pal(out,tf));
	}
}
