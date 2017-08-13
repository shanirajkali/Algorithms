package string;
import java.io.*;
import java.math.*;
public class SubSecqueceOuccerecne {
	static void find(String str,String pat,int i,int k,int[] count){
		for(;i<str.length();++i){
			if(str.charAt(i)==pat.charAt(k)){
				if(k<pat.length()-1){
					System.out.println(i+" "+k);
					find(str,pat,++i,++k,count);
					
				}
				else if(str.charAt(i)==pat.charAt(k)){
					System.out.println(str.charAt(i)+" "+pat.charAt(k));
					count[0]++;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("string.txt"));
		String str=br.readLine();
		String pat=br.readLine();
		System.out.println(str+" "+pat);
		int[] count=new int[1];
		find(str,pat,0,0,count);
		System.out.println(count[0]);
		long a=1<<31;
		System.out.println(Integer.MAX_VALUE);
		

	}

}
   