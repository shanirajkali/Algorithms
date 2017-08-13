package matrix;
import java.util.*;


public class WDay1 {

	public static void main(String[] args){
		
		Scanner in=new Scanner(System.in);
		int q=in.nextInt();
		int i=0;
		String s="0";
		while(i<q){
			int pos=in.nextInt();
			while(s.length()<=pos){
				char sarr[]=s.toCharArray();
				for(int j=0;j<sarr.length;j++){
					int val=1-Character.getNumericValue(sarr[j]);
					sarr[j]=(char)(val+48);
					s=s+String.valueOf(sarr[j]);
					System.out.println(s);
				}
				
			}
			
				char out[]=s.toCharArray();
				System.out.println(out[pos]);
			
			
		}
	}

}
