package matrix;
import java.util.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

class Day6 {
	public static void main(String[] args) throws IOException{
		Scanner in=new Scanner(System.in);
		FileReader f=new FileReader("./input.txt");
		
		BufferedReader fr=new BufferedReader(f);
		int n=Character.getNumericValue((char)fr.read());
		String s=fr.readLine();
		char chS[]=s.toCharArray();
		int[] gs=new int[n];
		String pref="";
		HashSet<String> gsS=new HashSet<String>();
		System.out.println("1");
		int tt=0;
		for(int i=0;i<n;i++){
			pref=pref+chS[i];
		aa:	for(int j=i;j>=0;j--){
				for(int o=j,p=i;o<=i;o++,p--){
					System.out.println(tt++);
					if(chS[o]!=chS[p])
						continue aa;
				}		
						String prefPalStr="";
						for(int k=j;k<=i;k++){
							prefPalStr=prefPalStr+chS[k];
							if(gsS.add(prefPalStr))
								gs[i]++;
							System.out.println(tt++);
						}
			}
			if(i>0){
				gs[i]=gs[i]+gs[i-1];
				//System.out.println(gs[i]);
			}
		}
	}
}