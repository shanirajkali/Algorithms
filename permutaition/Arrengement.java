package permutaition;
import java.io.*;
import java.util.Arrays;

public class Arrengement {
static	String rotate(String str,int frm,int in){
		char[] arr=str.toCharArray();
		arr[in]=str.charAt(frm);
		arr[frm]=str.charAt(in);
		return String.valueOf(arr);
	}
static	void prmt(String str,int pos,int[] t,String[] s){
		for(int i=pos;i<str.length();i++){
			str=rotate(str,pos,i);
			prmt(str,pos+1,t,s);
			if(pos==str.length()-1){
				t[0]++;
				s[t[0]]=str;
			}
		}
		
	}
static int fact(int n){
	for (int i=n-1;i>0;i--){
		n*=i;
	}
	return n;
}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("permutation.txt"));
		int n=Integer.parseInt(br.readLine());
		String str=br.readLine();
		int[] t=new int[1];
		t[0]=-1;
		String[] s=new String[fact(str.length())];
		prmt(str,0,t,s);
		Arrays.sort(s);
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]+" "+(i+1));
		}
		System.out.println(fact(2));
		br.close();
	}

}
