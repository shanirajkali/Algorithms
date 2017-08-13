package matrix;
import java.util.Scanner;
public class Day4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int sss=in.nextInt();
		String s=in.next();
		char arr[]=s.toCharArray();

		int a=0,b=0,c=0,i=0;
		for(i=0;i<sss;i++){
			if(arr[i]=='a')
				a++;
			else if(arr[i]=='b')
				b++;
			else if(arr[i]=='c')
				c++;
		}
		int[] aa=new int[a];
		int[] ab=new int[b];
		int[] ac=new int[c];
		a=-1;b=-1;c=-1;
		for(i=0;i<sss;i++){
			if(arr[i]=='a')
				aa[++a]=i+1;
			else if(arr[i]=='b')
				ab[++b]=(i+1)*(i+1);
			else if(arr[i]=='c')
				ac[++c]=i+1;
		}
		a++;b++;c++;
		int result=0;
		for(i=0;i<b;i++){
			for(int j=0;j<a;j++){
				if(ab[i]<aa[j])
					break;
				else if(ab[i]%aa[j]==0){
				for(int k=0;k<c;k++){
					int tem=aa[j]*ac[k];
					if(ab[i]==tem)
						result++;
					else if(ab[i]<tem){
						break;}
				}
				}
			}
		}
		System.out.println(result);
	}
}
