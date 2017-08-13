package matrix;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

public class Passbook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("./input.txt");
		BufferedReader br=new BufferedReader(fr);
		int q=Integer.parseInt(br.readLine());
		int i=0;
		HashSet<String> set=new HashSet<String>();
		while(i<q){
			String inp=br.readLine();
			char c=inp.charAt(0);
			if(c=='c'){
				 String store=inp.substring(4, inp.length());
				 int j=1;
				 while(!set.add(store)){
					 store=inp.substring(4, inp.length());
					 store=store+"("+j+")";
					 j++;
				 }
				System.out.println("+ "+store);
			}
			else if(c=='d'){
				String store=inp.substring(4, inp.length());
				set.remove(store);
				System.out.println("- "+store);
			}
			else if(c=='r'){
				String store=inp.substring(4, inp.length());
				String[] splt=store.split("\\s");
				set.remove(splt[0]);
				int j=1;
				String ss=splt[1];
				while(!set.add(ss)){
					ss=splt[1];
					ss=ss+"("+j+")";
					j++;
				}
				System.out.println("r "+splt[0]+" -> "+ss);
				
			}
			i++;
		}
	}

}
